package sg.edu.rp.c346.id20008460.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    TextView tvAnswer ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        tvAnswer = findViewById(R.id.textView3);

        Intent intentReceived = getIntent();
        double value = intentReceived.getDoubleExtra("double", -1);
        //default Value will show if nobody pass in - e.g. if "double" does not exist in
        // MainActivity.java (putExtra) - will not crash ; default value would show up
        tvAnswer.setText("Double value received is: " + value);

    }
}