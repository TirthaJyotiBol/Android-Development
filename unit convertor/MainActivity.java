package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);                 // the id having button is taken here
        textView  = findViewById(R.id.textView2);           // where we will get the output
        editText =findViewById(R.id.editTextTextPersonName2); // input would be given in here


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s = editText.getText().toString();                //took the edit text value into  string
               int kg_value = Integer.parseInt(s);                      // convert the string value into integer

                double pound_value = kg_value*2.205;
                textView.setText("The corresponding value for pound is "+pound_value);

            }
        });


    }
}