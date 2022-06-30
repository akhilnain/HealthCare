package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class faq extends AppCompatActivity {
    Button bt1,bt2,bt3, bt4;
    TextView tv1,tv2,tv3,tv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);
        bt1=findViewById(R.id.faq1);
        bt2=findViewById(R.id.faq2);
        bt3=findViewById(R.id.faq3);
        bt4=findViewById(R.id.faq4);
        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        tv3=findViewById(R.id.tv3);
        tv4=findViewById(R.id.tv4);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv1.getVisibility()==View.GONE){
                    tv1.setVisibility(View.VISIBLE);
                }
                else if(tv1.getVisibility()==View.VISIBLE){
                    tv1.setVisibility(View.GONE);
                }
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv2.getVisibility()==View.GONE){
                    tv2.setVisibility(View.VISIBLE);
                }
                else if(tv2.getVisibility()==View.VISIBLE){
                    tv2.setVisibility(View.GONE);
                }
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv3.getVisibility()==View.GONE){
                    tv3.setVisibility(View.VISIBLE);
                }
                else if(tv3.getVisibility()==View.VISIBLE){
                    tv3.setVisibility(View.GONE);
                }
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv4.getVisibility()==View.GONE){
                    tv4.setVisibility(View.VISIBLE);
                }
                else if(tv4.getVisibility()==View.VISIBLE){
                    tv4.setVisibility(View.GONE);
                }
            }
        });



    }
}