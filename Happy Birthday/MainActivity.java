package com.example.happybirthday;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText editText;
    TextView textView;
    TextView tv2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        * get the id of all the elements
        * */
        textView = textView.findViewById(R.id.textView1);
       editText = editText.findViewById(R.id.editTextTextPersonName);
       button = button.findViewById(R.id.button2);
       tv2= textView.findViewById(R.id.textView3);

       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(MainActivity.this, "Wishing You A warming Happy Birthday", Toast.LENGTH_SHORT).show();
               String message = editText.toString();  //convert the text value into string
               tv2.setText("Happy Birthday "+message);
           }
       });



    }

}
