package ahunt.rockpaperscissorsai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int rockTotal = 0;
    int paperTotal = 0;
    int scissorsTotal = 0;

    public void onRockClick(View v){
        TextView t1 = (TextView)findViewById(R.id.textView);
        TextView t2 = (TextView)findViewById(R.id.rockNumber);
        TextView t3 = (TextView)findViewById(R.id.textView3);


        if (t1 != null) {
            t1.setText(String.format("you have chosen rock"));
        }

        rockTotal++;
        if (t2 != null) {
            t2.setText(String.valueOf(rockTotal));
        }
        int botChoice = onAnyClick();

        if(botChoice == 0){
            assert t3 != null;
            t3.setText(String.format("you have tied"));
        }
        else if(botChoice == 1){
            assert t3 != null;
            t3.setText(String.format("the bot has won"));
        }
        else if(botChoice == 2){
            assert t3 != null;
            t3.setText(String.format("you have won"));
        }

    }
    public void onPaperClick(View v){
        TextView t1 = (TextView)findViewById(R.id.textView);
        TextView t2 = (TextView)findViewById(R.id.paperNumber);
        TextView t3 = (TextView)findViewById(R.id.textView3);



        if (t1 != null) {
            t1.setText(String.format("you have chosen paper"));
        }
        paperTotal++;
        if (t2 != null) {
            t2.setText(String.valueOf(paperTotal));
        }
        int botChoice = onAnyClick();

        if(botChoice == 0){
            assert t3 != null;
            t3.setText(String.format("you have won"));
        }
        else if(botChoice == 1){
            assert t3 != null;
            t3.setText(String.format("you have tied"));
        }
        else if(botChoice == 2){
            assert t3 != null;
            t3.setText(String.format("the bot has won"));
        }
    }
    public void onScissorsClick(View v){
        TextView t1 = (TextView)findViewById(R.id.textView);
        TextView t2 = (TextView)findViewById(R.id.scissorsNumber);
        TextView t3 = (TextView)findViewById(R.id.textView3);



        if (t1 != null) {
            t1.setText(String.format("you have chosen scissors"));
        }
        scissorsTotal++;
        if (t2 != null) {
            t2.setText(String.valueOf(scissorsTotal));
        }

        int botChoice = onAnyClick();

        if(botChoice == 0){
            assert t3 != null;
            t3.setText(String.format("the bot has won"));
        }
        else if(botChoice == 1){
            assert t3 != null;
            t3.setText(String.format("you have won"));
        }
        else if(botChoice == 2){
            assert t3 != null;
            t3.setText(String.format("you have tied"));
        }
    }

    public int onAnyClick(){
        TextView t1 = (TextView)findViewById(R.id.textView2);

        int totalCount = rockTotal+paperTotal+scissorsTotal;
        Random r = new Random();
        int randomlySelected = r.nextInt(totalCount)+1;

        if (randomlySelected <= rockTotal)
        {
            assert t1 != null;
            t1.setText(String.format("the bot has chosen paper"));
            return 1;
        }
        else if (randomlySelected <= paperTotal) {
            assert t1 != null;
            t1.setText(String.format("the bot has chosen scissors"));
            return 2;
        }
        else{
            assert t1 != null;
            t1.setText(String.format("the bot has chosen rock"));
            return 0;
        }

    }
}