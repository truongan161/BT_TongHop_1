package com.example.admin.bt_tonghop;

import android.graphics.Picture;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    Button btn1, btn2;
    //ArrayList<Integer> arrImg = new ArrayList<>();
    ArrayList<Pictures> arrPic = new ArrayList<>();
    int pos = 0;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        addControl();
        initDatas();
        addEvent();
    }

    private void addEvent()
    {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pos++;
                if(pos == arrPic.size())
                    pos = 0;
                //img.setImageResource(arrPic.get(pos));
                img.setImageResource(arrPic.get(pos).getImage());
                txt.setText(arrPic.get(pos).getText());
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pos--;
                if(pos < 0)
                    pos = arrPic.size() - 1;
                //img.setImageResource(arrPic.get(pos));
                img.setImageResource(arrPic.get(pos).getImage());
                txt.setText(arrPic.get(pos).getText());
            }
        });
    }

    private void initDatas()
    {
//        arrImg.add(R.drawable.a01);
//        arrImg.add(R.drawable.a02);
//        arrImg.add(R.drawable.a03);
//        arrImg.add(R.drawable.a04);
//        arrImg.add(R.drawable.a05);
//        arrImg.add(R.drawable.a06);
//        arrImg.add(R.drawable.a07);
//        arrImg.add(R.drawable.a08);
//        arrImg.add(R.drawable.a09);
//        arrImg.add(R.drawable.a10);
//        arrImg.add(R.drawable.a11);
        arrPic.add(new Pictures(R.drawable.a01, "abcxyz"));
        arrPic.add(new Pictures(R.drawable.a02, "ABCXYZ"));
        arrPic.add(new Pictures(R.drawable.a03, "abcxyz"));
        arrPic.add(new Pictures(R.drawable.a04, "abcxyz"));
        arrPic.add(new Pictures(R.drawable.a05, "abcxyz"));
        arrPic.add(new Pictures(R.drawable.a06, "abcxyz"));
        arrPic.add(new Pictures(R.drawable.a07, "abcxyz"));
        arrPic.add(new Pictures(R.drawable.a08, "abcxyz"));
        arrPic.add(new Pictures(R.drawable.a09, "abcxyz"));
        arrPic.add(new Pictures(R.drawable.a10, "abcxyz"));
        arrPic.add(new Pictures(R.drawable.a11, "abcxyz"));


        img.setImageResource(arrPic.get(pos).getImage());
        txt.setText(arrPic.get(pos).getText());
    }

    private void addControl()
    {
        img = (ImageView) findViewById(R.id.ImageView);
        btn1 = (Button) findViewById(R.id.btn_next);
        btn2 = (Button) findViewById(R.id.btn_previous);
        txt = (TextView) findViewById(R.id.txt);
    }
    }

