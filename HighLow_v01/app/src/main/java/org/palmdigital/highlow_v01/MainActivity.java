package org.palmdigital.highlow_v01;

import android.icu.text.NumberingSystem;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;

import java.util.Random;

import static android.R.attr.value;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random answer = new Random();
        int value = answer.nextInt();
    }

    public void guess(View view)
    {
        EditText et_input = (EditText) findViewById(R.id.editText_input);
        String str_Input = et_input.getText().toString();
        TextView tv_result = (TextView) findViewById(R.id.textView_result);
        int Input = Integer.parseInt(str_Input);
        int value = 89;
        for (int i = 0; i < 9; i++)
        {

            if (Input > 100 || Input < 1)
            {
                tv_result.setText("Not a valid number.");
            }

            if (value == Input)
            {
                tv_result.setText("You Win!");
            }

            else if (value < Input)
            {
                tv_result.setText("Too High!");
            }
            else if (value > Input)
            {
                tv_result.setText("Too Low!");
            }
    }

    }

}
