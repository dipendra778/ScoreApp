package com.example.dipak.scoreapp;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int a = 0, b = 0;
    Button sixA, sixB, fourA, fourB, threeA, threeB, twoA, twoB, oneA, oneB, reset;
    Button okA, okB;
    TextView wicA, wicB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textViewA = findViewById(R.id.TeamScoreA_Tv);
        final TextView textViewB = findViewById(R.id.TeamScoreB_Tv);
        sixA = findViewById(R.id.SixA_Btn);
        sixB = findViewById(R.id.SixB_Btn);
        fourA = findViewById(R.id.FourA_Btn);
        fourB = findViewById(R.id.FourB_Btn);
        threeA = findViewById(R.id.threeA_Btn);
        threeB = findViewById(R.id.threeB_Btn);
        twoA = findViewById(R.id.twoA_Btn);
        twoB = findViewById(R.id.twoB_Btn);
        oneA = findViewById(R.id.oneA_Btn);
        oneB = findViewById(R.id.oneB_Btn);
        reset = findViewById(R.id.Reset_Btn);

        wicA = findViewById(R.id.wicketA_Tv);
        wicB = findViewById(R.id.wicketB_Tv);

        okA = findViewById(R.id.okA_Btn);
        okB = findViewById(R.id.okB_Btn);
        sixA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = a + 6;
                textViewA.setText("" + a);
            }
        });
        sixB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b = b + 6;
                textViewB.setText("" + b);
            }
        });
        fourA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = a + 4;
                textViewA.setText("" + a);
            }
        });
        fourB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b = b + 4;
                textViewB.setText("" + b);
            }
        });
        threeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = a + 3;
                textViewA.setText("" + a);
            }
        });
        threeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b = b + 3;
                textViewB.setText("" + b);
            }
        });
        twoA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = a + 2;
                textViewA.setText("" + a);
            }
        });
        twoB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b = b + 2;
                textViewB.setText("" + b);
            }
        });
        oneA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = a + 1;
                textViewA.setText("" + a);
            }
        });
        oneB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b = b + 1;
                textViewB.setText("" + b);
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = 0;
                b = 0;
                textViewA.setText("" + a);
                textViewB.setText("" + b);
                int A = 0;
                TextView AWicketTv = findViewById(R.id.wicketA_Tv);
                AWicketTv.setText(String.valueOf(A));
                int B = 0;
                TextView BWicketTv = findViewById(R.id.wicketB_Tv);
                BWicketTv.setText(String.valueOf(B));

            }
        });
    }

    public void displayA(View view) {
        EditText AWicketEt = findViewById(R.id.wicketA_Et);
        String A = AWicketEt.getText().toString();
        TextView AWicketTv = findViewById(R.id.wicketA_Tv);
        AWicketTv.setText(String.valueOf(A));
    }

    public void displayB(View view) {
        EditText BWicketEt = findViewById(R.id.wicketB_Et);
        String B = BWicketEt.getText().toString();
        TextView BWicketTv = findViewById(R.id.wicketB_Tv);
        BWicketTv.setText(String.valueOf(B));
    }

    public void hidekeyboard(View view) {
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}
