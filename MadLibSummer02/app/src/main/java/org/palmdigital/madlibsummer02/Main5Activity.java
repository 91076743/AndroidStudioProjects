package org.palmdigital.madlibsummer02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity
{

    String newString, newString2, newString3, newString4;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
       TextView tv_story = (TextView) findViewById(R.id.text_view_story);


        if (savedInstanceState == null)
        {
            Bundle extras = getIntent().getExtras();
            if (extras == null)
            {
                newString = null;
                newString2 = null;
                newString3 = null;

            } else
            {
                newString = extras.getString("STORY_SO_FAR");
                newString2 = extras.getString("STORY_SO_FAR");
                newString3 = extras.getString("STORY_SO_FAR");

            }
        }
        else
        {
            newString = (String) savedInstanceState.getSerializable("STORY_SO_FAR");
            newString2 = (String) savedInstanceState.getSerializable("STORY_SO_FAR");
            newString3 = (String) savedInstanceState.getSerializable("STORY_SO_FAR");

        }
        tv_story.setText(newString);
        tv_story.setText(newString2);
        tv_story.setText(newString3);


    }



    public void Createstory (View view)
    {
     //   TextView tv_story = (TextView) findViewById(R.id.text_view_story);
      //  tv_story.setText(newString);
       // tv_story.setText(newString2);
        //tv_story.setText(newString3);
        //tv_story.setText(newString4);

        EditText et_person = (EditText)findViewById(R.id.edit_text_person);
        EditText et_place = (EditText) findViewById(R.id.edit_text_place);
        EditText et_adj01 = (EditText) findViewById(R.id.edit_text_adj01);
        EditText et_sameplace = (EditText) findViewById(R.id.edit_text_sameplace);

        String str_Person = et_person.getText().toString();
        String str_Place = et_place.getText().toString();
        String str_Adj01 = et_adj01.getText().toString();
        String str_Sameplace = et_sameplace.getText().toString();

        EditText et_pluralnoun = (EditText) findViewById(R.id.edit_text_pluralnoun);
        EditText et_adj02 = (EditText) findViewById(R.id.edit_text_adj02);
        EditText et_pluralnoun02 = (EditText) findViewById(R.id.edit_text_pluralnoun02);
        EditText et_place02 = (EditText) findViewById(R.id.edit_text_place02);

        String str_Pluralnoun = et_pluralnoun.getText().toString();
        String str_Adj02 = et_adj02.getText().toString();
        String str_Pluralnoun02 = et_pluralnoun02.getText().toString();
        String str_Place02 = et_place02.getText().toString();

        EditText et_actionverb = (EditText) findViewById(R.id.edit_text_actionverb);
        EditText et_pluralnoun03 = (EditText) findViewById(R.id.edit_text_pluralnoun03);
        EditText et_pluralnoun04 = (EditText) findViewById(R.id.edit_text_pluralnoun04);
        EditText et_noun = (EditText) findViewById(R.id.edit_text_noun);

        String str_Actionverb = et_actionverb.getText().toString();
        String str_Pluralnoun03 = et_pluralnoun03.getText().toString();
        String str_Pluralnoun04 = et_pluralnoun04.getText().toString();
        String str_Noun = et_noun.getText().toString();

        EditText et_actionverb02 = (EditText) findViewById(R.id.edit_text_actionverb02);
        EditText et_actionverb03 = (EditText) findViewById(R.id.edit_text_actionverb03);
        EditText et_adj03 = (EditText) findViewById(R.id.edit_text_adj03);

        String str_Actionverb02 = et_actionverb02.getText().toString();
        String str_Actionverb03 = et_actionverb03.getText().toString();
        String str_Adj03 = et_adj03.getText().toString();



        String story = "Last Summer my mom and dad took me and " + str_Person + " on a trip to " + str_Place + ". The weather there is very " + str_Adj01 + "!" + " Northern " + str_Sameplace + "has many" + str_Pluralnoun + ", and they make " + str_Adj02 + " " + str_Pluralnoun02 + " there. " + "Many people also go to " + str_Place02 + "to " + str_Actionverb + " or see the " + str_Pluralnoun03 + ". The people that live there love to eat " + str_Pluralnoun04 + " and are very proud of their big " + str_Noun + "." + "They also like to " + str_Actionverb02 + " in the sun and swim in the " + str_Actionverb03 + "! It was a really " + str_Adj03 + " trip!";


        Intent i = new Intent(this, Main5Activity.class);
        i.putExtra("STORY_SO_FAR", story);

        startActivity(i);

    }





}
