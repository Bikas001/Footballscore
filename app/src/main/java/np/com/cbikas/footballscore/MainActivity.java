package np.com.cbikas.footballscore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvScoreA,tvScoreB;
    int i=0,j=0;
    Button btnstart,btnstop,btnreset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvScoreA=findViewById(R.id.tvScoreA);
        tvScoreB=findViewById(R.id.tvScoreB);
        btnstart=findViewById(R.id.start);
        btnstop=findViewById(R.id.stop);
        btnreset=findViewById(R.id.reset);
        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=0;j=0;
                tvScoreA.setText(""+i);
                tvScoreB.setText(""+j);

            }
        });

    }

    public void displayA(int score){
        tvScoreA.setText(String.valueOf(score));
    }

    public void btnAddScoreA(View view){
        i++;
       displayA(i);
    }
    public void btnScoreA(View view) {

        tvScoreA.setText(String.valueOf(i));
    }


    public void displayB(int score){
        tvScoreB.setText(String.valueOf(score));
    }
    public void btnScoreB(View view) {
        tvScoreB.setText(String.valueOf(j));
    }
    public void btnAddScoreB(View view){
        j++;
        displayB(j);
    }
    public void passedTime(){

    }
    public void ReminningTime(){

    }


}
