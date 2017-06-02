package org.palmdigital.madlibsummer02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void next01 (View view)
    {
        // references
        EditText et_person = (EditText)findViewById(R.id.edit_text_person);
        EditText et_place = (EditText) findViewById(R.id.edit_text_place);
        EditText et_adj01 = (EditText) findViewById(R.id.edit_text_adj01);
        EditText et_sameplace = (EditText) findViewById(R.id.edit_text_sameplace);

        String str_Person = et_person.getText().toString();
        String str_Place = et_place.getText().toString();
        String str_Adj01 = et_adj01.getText().toString();
        String str_Sameplace = et_sameplace.getText().toString();

        String story = "Last Summer my mom and dad took me and " + str_Person + " on a trip to " + str_Place + ". The weather there is very " + str_Adj01 + "!" + " Northern " + str_Sameplace + "has many";

        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra("STORY_SO_FAR", story);

        startActivity(i);
    }

}
