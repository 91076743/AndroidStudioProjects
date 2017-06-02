package org.palmdigital.madlibpizza;

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
        EditText et_adj1 = (EditText) findViewById(R.id.edit_text_adj01);
        EditText et_nationality = (EditText) findViewById(R.id.edit_text_nation);
        EditText et_name = (EditText) findViewById(R.id.edit_text_name);
        EditText et_noun = (EditText) findViewById(R.id.edit_text_noun);
        EditText et_adj2 = (EditText) findViewById(R.id.edit_text_adj02);
        EditText et_noun2 = (EditText) findViewById(R.id.edit_text_noun02);
        //EditText et_adj3 = (EditText) findViewById(R.id.edit_text_adj03);
        //EditText et_adj4 = (EditText) findViewById(R.id.edit_text_adj04);
        //EditText et_pluralnoun = (EditText) findViewById(R.id.edit_text_pluralnoun);

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
}

// String str_Adj3 = et_adj3.getText().toString();
//String str_Adj4 = et_adj4.getText().toString();
// String str_Pluralnoun = et_pluralnoun.getText().toString();

// story +=  ". Then you cover it with " + str_Adj3 + "sauce, " + str_Adj4 + " chesse, and fresh chopped" + str_Pluralnoun;