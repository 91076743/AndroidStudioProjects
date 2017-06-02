package com.example.palmdigital.textviewoutput01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{



    TextView textView_top;
    TextView textView_middle;
    TextView textView_bottom;

    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageViewNum1 = (ImageView) findViewById(R.id.imageView);
        ImageView imageViewNum2 = (ImageView) findViewById(R.id.imageView2);
        ImageView imageViewNum3 = (ImageView) findViewById(R.id.imageView3);
        ImageView imageViewNum4 = (ImageView) findViewById(R.id.imageView4);
        ImageView imageViewNum5 = (ImageView) findViewById(R.id.imageView5);
        ImageView imageViewNum6 = (ImageView) findViewById(R.id.imageView6);
        ImageView imageViewNum8 = (ImageView) findViewById(R.id.imageView8);


        textView_top = (TextView) findViewById(R.id.textView_top);
        textView_middle = (TextView) findViewById(R.id.textView_middle);
        textView_bottom = (TextView) findViewById(R.id.textView_bottom);


        imageViewNum1.setOnClickListener(this);
        imageViewNum2.setOnClickListener(this);
        imageViewNum3.setOnClickListener(this);
        imageViewNum4.setOnClickListener(this);
        imageViewNum5.setOnClickListener(this);
        imageViewNum6.setOnClickListener(this);
        imageViewNum8.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
if(view.getId() == R.id.imageView)
{
    textView_top.setText("1");
    num1 = 1;
}
        else if(view.getId() == R.id.imageView2)
        {
            textView_top.setText("2");
            num1 = 2;
        }
        else if (view.getId() == R.id.imageView3)
        {
            textView_top.setText("3");
            num1 = 3;
        }
        if (view.getId() == R.id.imageView4)
        {
            textView_middle.setText("4");
            num2 = 4;
        }
        else if (view.getId() == R.id.imageView5)
        {
            textView_middle.setText("5");
            num2 = 5;
        }
        else if (view.getId() == R.id.imageView6)
        {
            textView_middle.setText("6");
            num2 = 6;
        }
        else if (view.getId() == R.id.imageView8)
        {
            int sum = num1 + num2;
            textView_bottom.setText("" + sum);
        }
    }
}
