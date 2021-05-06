package tryme.gohoool.tryme;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private View windowView;
    private Button tryMeButton;
    private int colors[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        windowView = findViewById(R.id.windowViewId);
        windowView.setBackgroundColor(Color.RED);
        tryMeButton = (Button) findViewById(R.id.trymebutton);
        
        colors = new int[]{Color.RED, Color.DKGRAY, Color.BLACK, Color.BLUE, Color.MAGENTA,
                Color.GREEN,Color.CYAN};

        tryMeButton.setOnClickListener(new View.OnClickListener() {
            Random rand = new Random();
            @Override
            public void onClick(View v) {
                Log.d("test","tap");
                int indexToSwap = rand.nextInt(colors.length);
                int randColor = colors[indexToSwap];
                windowView.setBackgroundColor(randColor);
            }
        });



    }
}