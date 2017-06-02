package org.palmdigital.madlibpuppy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void makeStory(View view)
    {
        EditText et_color = (EditText) findViewById(R.id.edit_text_color);
        EditText et_bodypart = (EditText) findViewById(R.id.edit_text_bodypart);
        EditText et_noun = (EditText) findViewById(R.id.edit_text_noun);
        EditText et_verb = (EditText) findViewById(R.id.edit_text_verb);
        EditText et_adj1 = (EditText) findViewById(R.id.edit_text_adj1);
        EditText et_adj2 = (EditText) findViewById(R.id.edit_text_adj2);


        TextView tv_story = (TextView) findViewById(R.id.text_view_story);


        String str_Color = et_color.getText().toString();
        String story = "Today I saw him again. When he looks at me with those ";
        String str_Bodypart = et_bodypart.getText().toString();
        String str_Noun = et_noun.getText().toString();
        String str_Verb = et_verb.getText().toString();
        String str_Adj1 = et_adj1.getText().toString();
        String str_Adj2 = et_adj2.getText().toString();

        story = story + str_Color + " eyes, it makes my " + str_Bodypart + " go pitterpat, and I feel as if I have " + str_Noun + " in my stomach. When he scrunches his nose I want to " + str_Verb + " him softly. He is so " + str_Adj1 + " and " + str_Adj2;


        tv_story.setText(story);



    }
}