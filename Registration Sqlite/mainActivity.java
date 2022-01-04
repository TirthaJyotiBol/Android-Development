package com.example.register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText name_signup,password_signup;
    Button signup,login;
    dbHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       name_signup = (EditText)findViewById(R.id.signup_name);
       password_signup = (EditText)findViewById(R.id.password);
       signup = (Button)findViewById(R.id.button);
       login = (Button)findViewById(R.id.login_button);
       db = new dbHelper(this);
       
       
       signup.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String username = name_signup.getText().toString();
               String password = password_signup.getText().toString();

               if(username.equals("")|| password.equals("")){
                   Toast.makeText(MainActivity.this, "Empty", Toast.LENGTH_SHORT).show();
               }

               else{
                   boolean checkUsername = db.checkUserName(username);              // checks if username is already present
                   if(checkUsername){
                       Toast.makeText(MainActivity.this, "username already taken try something else", Toast.LENGTH_SHORT).show();
                   }
                   else{
                      boolean isInserted =  db.insertData(username,password);
                      if(isInserted){
                          // move to a page after insertion
                          Intent intent = new Intent(MainActivity.this,moveafterreg.class);
                          startActivity(intent);
                          Toast.makeText(MainActivity.this, "Data Inserted Successfully", Toast.LENGTH_SHORT).show();
                      }
                   }
               }

           }
       });

       login.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(MainActivity.this,loginDatabase.class);
               startActivity(intent);
               Toast.makeText(MainActivity.this,"Login Button Clicked",Toast.LENGTH_SHORT).show();
           }
       });
       
       
    }
}
