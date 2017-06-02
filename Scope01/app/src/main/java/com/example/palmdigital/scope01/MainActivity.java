package com.example.palmdigital.scope01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

//we are outside the MainActivity class
// we are outside any methods

// understanding how scope works is very important


public class MainActivity extends AppCompatActivity
{
// in the MainActivity class, but outside any methods

    // fields - these variables have classwide scope
    //       and these variables
    String myString;
    // declare a field that is a double named enemyHealth
    double enemyHealth;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // here we are inside the onCrate() method which is inside
        // the MainActivity class

        // when we 'declare or 'define' a variable we use the following format:
        // dataType variableName; <--- this is a variable declaration/definition
        // some examples:
        int myInt; // <--- this is declaring a variable of dataType 'int' and named 'myInt'
        double myDouble; // <--- this is declaring a variable of dataType 'double' named 'myDouble'
        TextView textView_story; //  <--- this is declaring a variable of dataType 'TextView' named
                                     // textView_story
        ImageView imageView_ex;  // <--- dataType is ImageView, variableName is imageView_ex

        // assigning a value to a declared value
        // after we declare a variable, we can assign a value to it
        // variableName = someValueOfTheSameDataTypeAsTheVariable;
        // Some examples:
        myInt = 10; // <-- setting the value of myInt to 10, myInt has a dataType 'int' & 10 is an int
        myDouble = 20.12; // myDouble gets the value 20.12
        textView_story = (TextView) findViewById(R.id.textView_st); // set value of
                                                                   //textView_story to the UI element
                                                                  //R.id.textView_st

        imageView_ex = (ImageView) findViewById(R.id.imageView_android_guy);

        // you know you can declare and assign in the same step
        // dataType variableName = someValueOfTheSameDataTypeAsTheVariable;
        // Some examples:
        int myInt2 = 25; // <-- this is a declaration AND assignment
        myInt2 = 50; // <-- this is only assignment
        // THE DIFFERENCE IS the dataType!!!!!!!!! 'int'
        myString = "this is a string"; // <--- a declaration AND an assignment
        myString = "this is another string"; // this is just assignment

        // !!!!!!!!!!! Wherever you declare a variable determines that variable's scope!!!!!!
        // in other words, if I declare a variable here in the onCreate() method, only
        // code in the onCreate() method can see it and use it
        // nothing outside of onCreate() can see it... let's prove this...

        enemyHealth = 10.2;

    } // end of onCreate method

    public void myAwesomeMethod01()
    {
        myString = "what's going on here...";


    } // end of MyAwesomeMethod01



    public void MyAwesomeMethod02()
    {

    }
} //end of class

