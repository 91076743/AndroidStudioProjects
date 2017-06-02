package org.palmdigital.madlibsummer02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.palmdigital.madlibsummer02.R;

public class Main2Activity extends AppCompatActivity
{
    // fields
    String newString;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        // reference
        if (savedInstanceState == null)
        {
            Bundle extras = getIntent().getExtras();
            if (extras == null)
            {
                newString = null;

            } else
            {
                newString = extras.getString("STORY_SO_FAR");
            }
        }
        else
        {
            newString = (String) savedInstanceState.getSerializable("STORY_SO_FAR");
        }



    }



    public void next02 (View view)
    {
        EditText et_pluralnoun = (EditText) findViewById(R.id.edit_text_pluralnoun);
        EditText et_adj02 = (EditText) findViewById(R.id.edit_text_adj02);
        EditText et_pluralnoun02 = (EditText) findViewById(R.id.edit_text_pluralnoun02);
        EditText et_place02 = (EditText) findViewById(R.id.edit_text_place02);

        String str_Pluralnoun = et_pluralnoun.getText().toString();
        String str_Adj02 = et_adj02.getText().toString();
        String str_Pluralnoun02 = et_pluralnoun02.getText().toString();
        String str_Place02 = et_place02.getText().toString();

        String story = str_Pluralnoun + ", and they make " + str_Adj02 + " " + str_Pluralnoun02 + " there. ";
        story += story + "Many people also go to " + str_Place02;

        Intent i = new Intent(this, Main3Activity.class);
        i.putExtra("STORY_SO_FAR", story);

        startActivity(i);
    }

}

