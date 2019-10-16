package com.manishbsta.image_on_click;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btnClick;
    ImageView iconFirst, iconSecond, iconThird, iconFourth;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClick = findViewById(R.id.btnClick);
        iconFirst = findViewById(R.id.iconFirst);
        iconSecond = findViewById(R.id.iconSecond);
        iconThird = findViewById(R.id.iconThird);
        iconFourth = findViewById(R.id.iconFourth);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;

                if(counter==1){
                    iconFirst.setVisibility(View.VISIBLE);
                    iconSecond.setVisibility(View.INVISIBLE);
                    iconThird.setVisibility(View.INVISIBLE);
                    iconFourth.setVisibility(View.INVISIBLE);

                }

                if(counter==2){
                    iconFirst.setVisibility(View.INVISIBLE);
                    iconSecond.setVisibility(View.VISIBLE);
                    iconThird.setVisibility(View.INVISIBLE);
                    iconFourth.setVisibility(View.INVISIBLE);
                }

                if(counter==3){
                    iconFirst.setVisibility(View.INVISIBLE);
                    iconSecond.setVisibility(View.INVISIBLE);
                    iconThird.setVisibility(View.VISIBLE);
                    iconFourth.setVisibility(View.INVISIBLE);
                }

                if(counter==4){
                    iconFirst.setVisibility(View.INVISIBLE);
                    iconSecond.setVisibility(View.INVISIBLE);
                    iconThird.setVisibility(View.INVISIBLE);
                    iconFourth.setVisibility(View.VISIBLE);
                    counter=0;
                }
            }
        });
    }
}
