package com.example.calculate2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText entervalue;
    Button button;
    TextView digits, sum, cube, trimorphic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        entervalue = (EditText) findViewById(R.id.entervalue);
        button = (Button) findViewById(R.id.button);
        digits = (TextView) findViewById(R.id.digits);
        sum = (TextView) findViewById(R.id.sum);
        cube = (TextView) findViewById(R.id.cube);
        trimorphic = (TextView) findViewById(R.id.trimorphic);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = entervalue.getText().toString();
                int val = Integer.parseInt(value);
                int n, summation=0, c = 0, number;
                digits.setText(String.valueOf(val));
                while(val > 0)
                {
                    n = val % 10;
                    summation = summation + n;
                    val = val / 10;
                }
                sum.setText(String.valueOf(summation));

                double sqrt=Math.sqrt(summation);

                int sq = (int) Math.floor(sqrt);

                if(sq*sq== summation) {
                    cube.setText("Yes");
                }else {
                    cube.setText("No");
                }


            }

        });

    }
}