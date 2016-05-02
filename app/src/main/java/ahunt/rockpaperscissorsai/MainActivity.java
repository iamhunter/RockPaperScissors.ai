package ahunt.rockpaperscissorsai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int rockTotal = 0;
        int paperTotal = 0;
        int scissorsTotal = 0;
    }

    public void onRockClick(View v){
        TextView t1 = (TextView)findViewById(R.id.textView);

        if (t1 != null) {
            t1.setText(String.format("you have chosen rock"));
        }
    }
    public void onPaperClick(View v){
        TextView t1 = (TextView)findViewById(R.id.textView);

        if (t1 != null) {
            t1.setText(String.format("you have chosen paper"));
        }
    }
    public void onScissorsClick(View v){
        TextView t1 = (TextView)findViewById(R.id.textView);

        if (t1 != null) {
            t1.setText(String.format("you have chosen scissors"));
        }
    }
}
