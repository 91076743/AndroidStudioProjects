package org.palmdigital.intent_putextra01;

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

        TextView tv_story = (TextView) findViewById(R.id.text_view_story2);

        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                newString2 = null;

            } else {
                newString2 = extras.getString("STORY_SO_FAR_02");
            }
        }
        else
        {
            newString2 = (String) savedInstanceState.getSerializable("STORY_SO_FAR_02");
        }


        tv_story.setText(newString2);
    }

    public void next03 (View view)
    {
       // EditText et_nation = (EditText) findViewById(R.id.edit_text_nationality);

      //  String str_nation = et_nation.getText().toString();

       // String story = "Pizza was invented by a " + str_nation + " chef.";

      //  Intent i = new Intent(this, Main3Activity.class);
      //  i.putExtra("STORY_SO_FAR", story);

      //  startActivity(i);
    }
}
