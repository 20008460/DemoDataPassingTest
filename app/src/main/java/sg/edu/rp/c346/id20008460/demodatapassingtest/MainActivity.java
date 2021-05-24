package sg.edu.rp.c346.id20008460.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Event handling Step 1
    Button btnPassInteger;
    Button btnPassChar;
    TextView tvDouble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Event handling Step 2
        btnPassInteger = findViewById(R.id.buttonPassInteger);
        btnPassChar = findViewById(R.id.buttonPassChar);
        tvDouble = findViewById(R.id.tvDouble);

        //Event handling Step 3
       btnPassInteger.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
                   Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                   intent.putExtra("value", 1);
                   startActivity(intent);

               }
       });

       btnPassChar.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
                Intent intent2 = new Intent (MainActivity.this , ThirdActivity.class);
                intent2.putExtra("char" , "a");
                startActivity(intent2);
           }
       });

        tvDouble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent (MainActivity.this , FourthActivity.class);
                intent3.putExtra("double" , 99.999);
                startActivity(intent3);
            }
        });

    }
}