package com.example.alensh.checkbox;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    CheckBox cb1, cb2;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cb1 = (CheckBox) findViewById(R.id.checkBox1);
        cb2 = (CheckBox) findViewById(R.id.checkBox2);
        context = getApplicationContext();
        cb2.setOnClickListener(onclick_cb2);
        cb1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        CheckBox cb = (CheckBox) v;
                        if (cb.isChecked()) {
                            Toast.makeText(context, "Google Checked", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(context, "Google unChecked", Toast.LENGTH_SHORT).show();
                        }
                    }
                });


    }

    View.OnClickListener onclick_cb2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            CheckBox cb = (CheckBox) v;
            if (cb.isChecked()) {
                Toast.makeText(context, "Facebook Checked", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(context, "FaceBook unChecked", Toast.LENGTH_SHORT).show();
            }
        }
    };
}



/* Not Anonymous

    @Override
    public void onClick(View v) {
        CheckBox c = (CheckBox) v;
        if(c.isChecked()){
            Toast.makeText(this, "Google checked", Toast.LENGTH_SHORT).show();
                        }
    else
        {
            Toast.makeText(this,"Google Unchecked",Toast.LENGTH_SHORT).show();
        }
  */

