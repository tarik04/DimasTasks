package com.tarik.armer.activityexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityForGenerationText extends Activity {

    TextView textView;
    Button button1;
    EditText editText1;
    EditText editText2;
    EditText editText3;

    protected void onCreate (Bundle savedInstantState) {
        super.onCreate(savedInstantState);
        setContentView(R.layout.first_task_from_dima);

        textView = (TextView) findViewById(R.id.tVMain);
        button1 = (Button) findViewById(R.id.btn_g);
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);

    }

    public void onClick(View view) {
        String text1 = editText1.getText().toString();
        String text2 = editText2.getText().toString();
        String text3 = editText3.getText().toString();
        textView.setText(text1+" "+text2+" "+text3);
    }
}
