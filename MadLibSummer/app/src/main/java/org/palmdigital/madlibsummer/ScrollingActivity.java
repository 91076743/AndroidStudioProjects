package org.palmdigital.madlibsummer;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class ScrollingActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                EditText et_adj1 = (EditText) findViewById(R.id.edit_text_adj01);
                EditText et_nationality = (EditText) findViewById(R.id.edit_text_nation);
                EditText et_name = (EditText) findViewById(R.id.edit_text_name);
                EditText et_noun = (EditText) findViewById(R.id.edit_text_noun);
                EditText et_adj2 = (EditText) findViewById(R.id.edit_text_adj02);
                EditText et_noun2 = (EditText) findViewById(R.id.edit_text_noun02);
                

                TextView tv_story = (TextView) findViewById(R.id.text_view_story);


                String str_Adj1 = et_adj1.getText().toString();
                String story = "Pizza was invented by a ";
                String str_Nationality = et_nationality.getText().toString();
                String str_Name = et_name.getText().toString();
                String str_Noun = et_noun.getText().toString();
                String str_Adj2 = et_adj2.getText().toString();
                String str_Noun2 = et_noun2.getText().toString();

                story = story + str_Adj1 + " " + str_Nationality + " chef named " + str_Name;
                story += ". To make a pizza, you need to take a lump of " + str_Noun + "and make a thin, round " + str_Adj2 + " " + str_Noun2 + ". ";


                tv_story.setText(story);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
