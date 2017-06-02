package com.example.palmdigital.simplecalcv03;

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

    float num1;
    int num2;
    int sum;
    int operator;

    ImageView imageViewMinus;
    ImageView imageViewPlus;
    ImageView imageViewDivide;
    ImageView imageViewMultiply;
    ImageView imageViewEquals;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageViewNum0 = (ImageView) findViewById(R.id.imageView);
        ImageView imageViewNum1 = (ImageView) findViewById(R.id.imageView1);
        ImageView imageViewNum2 = (ImageView) findViewById(R.id.imageView2);
        ImageView imageViewNum3 = (ImageView) findViewById(R.id.imageView3);
        ImageView imageViewNum4 = (ImageView) findViewById(R.id.imageView4);
        ImageView imageViewNum5 = (ImageView) findViewById(R.id.imageView5);
        ImageView imageViewNum6 = (ImageView) findViewById(R.id.imageView6);
        ImageView imageViewNum7 = (ImageView) findViewById(R.id.imageView7);
        ImageView imageViewNum8 = (ImageView) findViewById(R.id.imageView8);
        ImageView imageViewNum9 = (ImageView) findViewById(R.id.imageView9);

        ImageView imageViewNum00 = (ImageView) findViewById(R.id.imageView00);
        ImageView imageViewNum01 = (ImageView) findViewById(R.id.imageView01);
        ImageView imageViewNum02 = (ImageView) findViewById(R.id.imageView02);
        ImageView imageViewNum03 = (ImageView) findViewById(R.id.imageView03);
        ImageView imageViewNum04 = (ImageView) findViewById(R.id.imageView04);
        ImageView imageViewNum05 = (ImageView) findViewById(R.id.imageView05);
        ImageView imageViewNum06 = (ImageView) findViewById(R.id.imageView06);
        ImageView imageViewNum07 = (ImageView) findViewById(R.id.imageView07);
        ImageView imageViewNum08 = (ImageView) findViewById(R.id.imageView08);
        ImageView imageViewNum09 = (ImageView) findViewById(R.id.imageView09);


        imageViewPlus = (ImageView) findViewById(R.id.imageView_plus);
        imageViewMinus = (ImageView) findViewById(R.id.imageView_minus);
        imageViewMultiply = (ImageView) findViewById(R.id.imageView_multiply);
        imageViewDivide = (ImageView) findViewById(R.id.imageView_divide);
        imageViewEquals = (ImageView) findViewById(R.id.imageView_equals);

        textView_top = (TextView) findViewById(R.id.textView_top);
        textView_middle = (TextView) findViewById(R.id.textView_middle);
        textView_bottom = (TextView) findViewById(R.id.textView_bottom);


        imageViewNum0.setOnClickListener(this);
        imageViewNum1.setOnClickListener(this);
        imageViewNum2.setOnClickListener(this);
        imageViewNum3.setOnClickListener(this);
        imageViewNum4.setOnClickListener(this);
        imageViewNum5.setOnClickListener(this);
        imageViewNum6.setOnClickListener(this);
        imageViewNum7.setOnClickListener(this);
        imageViewNum8.setOnClickListener(this);
        imageViewNum9.setOnClickListener(this);

        imageViewPlus.setOnClickListener(this);
        imageViewMinus.setOnClickListener(this);
        imageViewMultiply.setOnClickListener(this);
        imageViewDivide.setOnClickListener(this);
        imageViewEquals.setOnClickListener(this);

        imageViewNum00.setOnClickListener(this);
        imageViewNum01.setOnClickListener(this);
        imageViewNum02.setOnClickListener(this);
        imageViewNum03.setOnClickListener(this);
        imageViewNum04.setOnClickListener(this);
        imageViewNum05.setOnClickListener(this);
        imageViewNum06.setOnClickListener(this);
        imageViewNum07.setOnClickListener(this);
        imageViewNum08.setOnClickListener(this);
        imageViewNum09.setOnClickListener(this);

    }

    public void onClick (View view)
    {
if (view.getId() == R.id.imageView)
{
textView_top.setText("0");
    num1 = 0;
}
        else if (view.getId() == R.id.imageView1)
{
    textView_top.setText("1");
    num1 = 1;
}
        else if (view.getId() == R.id.imageView2)
{
    textView_top.setText("2");
    num1 = 2;
}
        else if (view.getId() == R.id.imageView3)
{
    textView_top.setText("3");
    num1 = 3;
}
        else if (view.getId() == R.id.imageView4)
{
    textView_top.setText("4");
    num1 = 4;
}
        else if (view.getId() == R.id.imageView5)
{
    textView_top.setText("5");
    num1 = 5;
}
        else if (view.getId() == R.id.imageView6)
{
    textView_top.setText("6");
    num1 = 6;
}
        else if (view.getId() == R.id.imageView7)
{
    textView_top.setText("7");
    num1 = 7;
}
        else if (view.getId() == R.id.imageView8)
{
    textView_top.setText("8");
    num1 = 8;
}
        else if (view.getId() == R.id.imageView9)
{
    textView_top.setText("9");
    num1 = 9;
}
        else if (view.getId() == R.id.imageView00)
{
    textView_middle.setText("0");
    num2 = 0;
}
        else if (view.getId() == R.id.imageView01)
{
    textView_middle.setText("1");
    num2 = 1;
}
        else if (view.getId() == R.id.imageView02)
{
    textView_middle.setText("2");
    num2 = 2;
}
        else if (view.getId() == R.id.imageView03)
{
    textView_middle.setText("3");
    num2 = 3;
}
        else if (view.getId() == R.id.imageView04)
{
    textView_middle.setText("4");
    num2 = 4;
}
        else if (view.getId() == R.id.imageView05)
{
    textView_middle.setText("5");
    num2 = 5;
}
        else if (view.getId() == R.id.imageView06)
{
    textView_middle.setText("6");
    num2 = 6;
}
        else if (view.getId() == R.id.imageView07)
{
    textView_middle.setText("7");
    num2 = 7;
}
        else if (view.getId() == R.id.imageView08)
{
    textView_middle.setText("8");
    num2 = 8;
}
        else if (view.getId() == R.id.imageView09)
{
    textView_middle.setText("9");
    num2 = 9;
}
else if (view.getId() == R.id.imageView_plus)
{
    operator = 0;
    imageViewPlus.setBackgroundColor(0xffff0000);
    imageViewMinus.setBackgroundColor(0xFFFFFF);
    imageViewDivide.setBackgroundColor(0xFFFFFF);
    imageViewMultiply.setBackgroundColor(0xFFFFFF);
}
else if (view.getId() == R.id.imageView_minus)
        {
    operator = 1;
    imageViewMinus.setBackgroundColor(0xffff0000);
    imageViewPlus.setBackgroundColor(0xFFFFFF);
    imageViewMultiply.setBackgroundColor(0xFFFFFF);
    imageViewDivide.setBackgroundColor(0xFFFFFF);
}
        else if (view.getId() == R.id.imageView_multiply)
{
    operator = 2;
    imageViewMultiply.setBackgroundColor(0xffff0000);
    imageViewDivide.setBackgroundColor(0xFFFFFF);
    imageViewMinus.setBackgroundColor(0xFFFFFF);
    imageViewPlus.setBackgroundColor(0xFFFFFF);
}
        else if (view.getId() == R.id.imageView_divide)
{
    operator = 3;
    imageViewDivide.setBackgroundColor(0xffff0000);
    imageViewMultiply.setBackgroundColor(0xFFFFFF);
    imageViewMinus.setBackgroundColor(0xFFFFFF);
    imageViewPlus.setBackgroundColor(0xFFFFFF);
}
        if (view.getId() == R.id.imageView_equals)
        {
            textView_bottom.setText("" + sum);
            if (operator == 0)
            {
                textView_bottom.setText("" +(num1 + num2));
            }
            else if (operator == 1)
            {
                textView_bottom.setText("" +(num1 - num2));
            }
            else if (operator == 2)
            {
                textView_bottom.setText("" +(num1 * num2));
            }
            else if (operator == 3)
            {
                textView_bottom.setText("" +(num1 / num2));
                divideZero();
            }

        }
    }
    public void divideZero()
    {
        if (num2 == 0)
        {
            textView_bottom.setText("ERROR");
        }

    }
}
