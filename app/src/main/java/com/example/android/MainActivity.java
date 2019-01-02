package com.example.android.helloworlddesu;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;
        import android.widget.Toast;

        import org.w3c.dom.Text;

        import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private int rand1;
    private int rand2;
    private int points;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        points = 0;

        pickRandom();
    }


    private void pickRandom(){
        Random rand = new Random();
        rand1 = rand.nextInt(10);
        while (true) {
            rand2 = rand.nextInt(10);
            if (rand2 != rand1) break;
        }
        Button lbutt = (Button) findViewById(R.id.left_button);
        lbutt.setText(Integer.toString(rand1)); //or "" + rand1 adsasdas

        Button rbutt = (Button) findViewById(R.id.right_button);
        rbutt.setText(Integer.toString(rand2));
    }

    public void LeftNum(View view){
        if (rand1 >= rand2){
            points++;
            Toast.makeText(this, "Great Job!", Toast.LENGTH_SHORT).show();

        }
        else {
            points--;
            Toast.makeText(this, "cmon!", Toast.LENGTH_SHORT).show();

        }
        TextView tv =  (TextView) findViewById(R.id.point_score);
        tv.setText("Points:" + points);
        pickRandom();
    }

    public void RightNum(View view){
        if (rand1 <= rand2){
            points++; //testing commit
            Toast.makeText(this, "Great Job!", Toast.LENGTH_SHORT).show();
        }
        else {
            points--;
            Toast.makeText(this, "cmon!", Toast.LENGTH_SHORT).show();
        }
        TextView tv =  (TextView) findViewById(R.id.point_score);
        tv.setText("Points:" + points);
        pickRandom();
    }
}
