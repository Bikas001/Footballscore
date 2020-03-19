package np.com.cbikas.footballscore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvScoreA,tvScoreB;
    int i=0,j=0,shots=0,corners=0,fouls=0,offside=0,yellowcard=0,redcard=0,shotsB=0,cornersB=0,foulsB=0,offsideB=0,yellowcardB=0,redcardB=0;
    Button btnstart,btnreset,btnshots,btncorners,btnfouls,btnoffside,btnyellowcard,btnredcard,btnshotsB,btncornersB,btnfoulsB,btnoffsideB,btnyellowcardB,btnredcardB;
    TextView tvshots,tvcorners,tvfouls,tvoffside,tvyellowcard,tvredcard,tvshotsB,tvcornersB,tvfoulsB,tvoffsideB,tvredcardB,tvyellowcardB;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvScoreA=findViewById(R.id.tvScoreA);
        tvScoreB=findViewById(R.id.tvScoreB);
        btnstart=findViewById(R.id.start);
        tvshots=findViewById(R.id.tvshots);
        tvshotsB=findViewById(R.id.tvshotsB);
        tvcorners=findViewById(R.id.tvcorners);
        tvcornersB=findViewById(R.id.tvcornersB);
        tvfouls=findViewById(R.id.tvfouls);
        tvfoulsB=findViewById(R.id.tvfoulsB);
        tvoffside=findViewById(R.id.tvoffside);
        tvoffsideB=findViewById(R.id.tvoffsideB);
        tvyellowcard=findViewById(R.id.tvYelloCard);
        tvyellowcardB=findViewById(R.id.tvYelloCardB);
        btnredcard=findViewById(R.id.btnRedCard);
        btnredcardB=findViewById(R.id.btnRedCardB);
        btnshots=findViewById(R.id.btnshots);
        btnshots.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shots++;
                tvshots.setText(""+shots);
            }
        });
        btnshotsB=findViewById(R.id.btnshotsB);
        btnshotsB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shotsB++;
                tvshotsB.setText(""+shotsB);
            }
        });

        btncorners=findViewById(R.id.btncorners);
        btncorners.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                corners++;
                tvcorners.setText(""+corners);
            }
        });

        btncornersB=findViewById(R.id.btncornersB);

        btncornersB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cornersB++;
                tvcornersB.setText(""+cornersB);
            }
        });

        btnfouls=findViewById(R.id.btnfouls);

        btnfouls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fouls++;
                tvfouls.setText(""+fouls);
            }
        });

        btnfoulsB=findViewById(R.id.btnfoulsB);

        btnfoulsB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                foulsB++;
                tvfoulsB.setText(""+foulsB);
            }
        });

        btnoffside=findViewById(R.id.btnoffside);

        btnoffside.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                offside++;



                tvoffside.setText(""+offside);
            }
        });


        btnoffsideB=findViewById(R.id.btnoffsideB);

        btnoffsideB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                offsideB++;
                tvoffsideB.setText(""+offsideB);
            }
        });
           btnyellowcard=findViewById(R.id.btnYelloCard);

           btnyellowcard.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   yellowcard++;
                   tvyellowcard.setText(""+yellowcard);
               }
           });
        btnyellowcardB=findViewById(R.id.btnYelloCardB);

        btnyellowcardB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yellowcardB++;
                tvyellowcardB.setText(""+yellowcardB);
            }
        });

        tvredcard=findViewById(R.id.tvRedCard);

        btnredcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                redcard++;
                tvredcard.setText(""+redcard);
            }
        });

        tvredcardB=findViewById(R.id.tvRedCardB);

        btnredcardB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                redcardB++;
                tvredcardB.setText(""+redcardB);
            }
        });





       btnreset=findViewById(R.id.btnreset);
        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=0;j=0;
                shots=0;corners=0;fouls=0;offside=0;yellowcard=0;redcard=0;shotsB=0;cornersB=0;foulsB=0;offsideB=0;yellowcardB=0;redcardB=0;
                tvScoreA.setText(""+i);
                tvScoreB.setText(""+j);
                tvshots.setText("0");
                tvfouls.setText("0");
                tvcorners.setText("0");
                tvoffside.setText("0");
                tvyellowcard.setText("0");
                tvredcard.setText("0");

                tvshotsB.setText("0");
                tvfoulsB.setText("0");
                tvcornersB.setText("0");
                tvoffsideB.setText("0");
                tvyellowcardB.setText("0");
                tvredcardB.setText("0");

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


}
