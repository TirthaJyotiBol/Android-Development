package com.example.register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginDatabase extends AppCompatActivity {

    Button button;
    EditText username,password;
    dbHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText)findViewById(R.id.login_name);
        password = (EditText)findViewById(R.id.password);
        button = (Button)findViewById(R.id.button);
        db = new dbHelper(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uname = username.getText().toString();
                String pass = password.getText().toString();

                if(username.equals("")|| password.equals("")){
                    Toast.makeText(loginDatabase.this, "Empty", Toast.LENGTH_SHORT).show();
                }else{
                    boolean checkBoth = db.checkUsernamePassword(uname,pass);
                    if(checkBoth){
                        Intent intent = new Intent(loginDatabase.this,moveafterreg.class);
                        startActivity(intent);
                    }else{
                        Toast.makeText(loginDatabase.this, "Login Failed might be wrong password ", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });

    }
}
