package com.example.palmdigital.chooseyouradventurev02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    Button button_left;
    Button button_right;

    TextView textView_title;
    TextView textView_story;
    TextView textView_question;

    String main;



    int operator;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         textView_story = (TextView) findViewById(R.id.textView_story);
         textView_question = (TextView) findViewById(R.id.textView_question);


        // Faint textView_story.setText("You made a delicious soup! Yum! The end.")

        // Yes-HECK YES textView_story.setText("Awesome dude!  You live out the rest of your life fighting crimes and eating pizza!")

        button_left = (Button) findViewById(R.id.button_left);
        button_right = (Button) findViewById(R.id.button_right);




        button_left.setOnClickListener(this);
        button_right.setOnClickListener(this);

        center();
    }

    public void onClick (View view)
    {
        if(view.getId() == R.id.button_left && operator == 0)
        {
            wakeUp();
        }

        else if (view.getId() == R.id.button_right && operator == 0)
        {
           explore();
            operator =+ 1;
        }
    }

   public void center()
    {
       if (operator == 0)
        {
       mainScreen();
        }


    }

    public void mainScreen()
    {
        textView_story.setText("One morning the Tortoise woke up in a dream.");
        textView_question.setText("Do you want to 'wake up' or 'explore' the dream?");
        button_left.setText("Wake Up");
        button_right.setText("Explore");

        button_left.setBackgroundColor(0x000ffffff);
        button_right.setBackgroundColor(0x000ffffff);
    }

    public void wakeUp()
    {
        textView_story.setText("You wake up and have a boring day. The end.");
        textView_question.setText("");
        button_left.setText("");
        button_right.setText("");

        button_left.setBackgroundColor(0xff99cc00);
        button_right.setBackgroundColor(0xff99cc00);
    }

    public void explore()
    {
        textView_story.setText("You approach a glowing, green bucket of ooze. Worried that you will get in trouble, you pick up the bucket.");
        textView_question.setText("Do you want to pour the ooze into the 'backyard' or 'toilet'?");
        button_left.setText("Backyard");
        button_right.setText("Toilet");

        button_left.setBackgroundColor(0xffffffff);
        button_right.setBackgroundColor(0xffffffff);
    }

    public void backyard()
    {
        textView_story.setText("As you walk into the backyard a net scoops you up and a giant takes you to a boiling pot of water.");
        textView_question.setText("As the man starts to prepare you as soup, do you...'Scream' or 'Faint'?");
        button_left.setText("Scream");
        button_right.setText("Faint");

        button_left.setBackgroundColor(0xffffffff);
        button_right.setBackgroundColor(0xffffffff);
    }

    public void toilet()
    {

    }

}
