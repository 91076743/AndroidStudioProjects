package com.example.palmdigital.scope02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    int myInt1, myInt2, MyInt3, MyInt4, MyInt5;
    double myDouble1, myDouble2, myDouble3, myDouble4, myDouble5;
    String myString1, myString2, myString3, myString4, myString5;
    TextView textView_1, textView_2, textView_3, textView_4, textView_5;
    ImageView imageView_1, imageView_2, imageView_3, imageView_4, imageView_5;
    Button button_1, button_2, button_3, button_4, button_5;




    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void myAwesomeMethod01()
    {
        myInt1 = 6;
        myDouble1 = 6.6;
        myString1 = "String boy";
        TextView textView_1;
        ImageView imageView_1;
        Button button_1;

        myDouble5 = 20;
    }
    public void myAwesomeMethod02()
    {
        myInt2 = 3;
        myDouble2 = 5.8;
        myString2 = "String girl";
        TextView textView_2;
        ImageView imageView_2;
        Button button_2;

        myDouble5 = 20;
    }
    public void myAwesomeMethod03()
    {
        int myInt3;
        double myDouble3;
        String myString3;
        TextView textView_3;
        ImageView imageView_3;
        Button button_3;

        myDouble5 = 20;
    }
    public void myAwesomeMethod04()
    {
        int myInt4;
        double myDouble4;
        String myString4;
        TextView textView_4;
        ImageView imageView_4;
        Button button_4;

        myDouble5 = 20;
    }
    public void myAwesomeMethod05()
    {
        int myInt5;
        double myDouble5;
        String myString5;
        TextView textView_5;
        ImageView imageView_5;
        Button button_5;

        myDouble5 = 20;
    }
}
