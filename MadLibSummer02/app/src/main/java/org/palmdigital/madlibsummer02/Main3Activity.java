package org.palmdigital.madlibsummer02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity
{

    String newString2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        // reference
        if (savedInstanceState == null)
        {
            Bundle extras = getIntent().getExtras();
            if (extras == null)
            {
                newString2 = null;

            } else
            {
                newString2 = extras.getString("STORY_SO_FAR");
            }
        }
        else
        {
            newString2 = (String) savedInstanceState.getSerializable("STORY_SO_FAR");
        }


    }



    public void next03 (View view)
    {
        EditText et_actionverb = (EditText) findViewById(R.id.edit_text_actionverb);
        EditText et_pluralnoun03 = (EditText) findViewById(R.id.edit_text_pluralnoun03);
        EditText et_pluralnoun04 = (EditText) findViewById(R.id.edit_text_pluralnoun04);
        EditText et_noun = (EditText) findViewById(R.id.edit_text_noun);

        String str_Actionverb = et_actionverb.getText().toString();
        String str_Pluralnoun03 = et_pluralnoun03.getText().toString();
        String str_Pluralnoun04 = et_pluralnoun04.getText().toString();
        String str_Noun = et_noun.getText().toString();

        String story = "to " + str_Actionverb + " or see the " + str_Pluralnoun03 + ". The people that live there love to eat " + str_Pluralnoun04 + " and are very proud of their big " + str_Noun + ".";

        Intent i = new Intent(this, Main4Activity.class);
        i.putExtra("STORY_SO_FAR", story);

        startActivity(i);
    }

}

