package org.palmdigital.madlibsummer02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main4Activity extends AppCompatActivity
{

    String newString3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        if (savedInstanceState == null)
        {
            Bundle extras = getIntent().getExtras();
            if (extras == null)
            {
                newString3 = null;

            } else
            {
                newString3 = extras.getString("STORY_SO_FAR");
            }
        }
        else
        {
            newString3 = (String) savedInstanceState.getSerializable("STORY_SO_FAR");
        }


    }



    public void next04 (View view)
    {
        EditText et_actionverb02 = (EditText) findViewById(R.id.edit_text_actionverb02);
        EditText et_actionverb03 = (EditText) findViewById(R.id.edit_text_actionverb03);
        EditText et_adj03 = (EditText) findViewById(R.id.edit_text_adj03);

        String str_Actionverb02 = et_actionverb02.getText().toString();
        String str_Actionverb03 = et_actionverb03.getText().toString();
        String str_Adj03 = et_adj03.getText().toString();

        String story = "They also like to " + str_Actionverb02 + " in the sun and swim in the " + str_Actionverb03 + "! It was a really " + str_Adj03 + " trip!";

        Intent i = new Intent(this, Main5Activity.class);
        i.putExtra("STORY_SO_FAR", story);

        startActivity(i);
    }

}

