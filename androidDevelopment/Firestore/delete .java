package com.example.firetut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;
import com.google.firebase.firestore.WriteBatch;

import java.util.List;

public class delete_data extends AppCompatActivity {
    public Button delete_btn;
    public EditText field;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_data);

        delete_btn = (Button)findViewById(R.id.delete_button);
        field = (EditText)findViewById(R.id.field);

        delete_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name_to_delete = field.getText().toString();

                FirebaseFirestore.getInstance().collection("vendor").whereEqualTo("name",name_to_delete).get().addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
                    @Override
                    public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                        WriteBatch b = FirebaseFirestore.getInstance().batch();
                        List<DocumentSnapshot> s = queryDocumentSnapshots.getDocuments();
                        for(DocumentSnapshot snapshot : s){
                            b.delete(snapshot.getReference());
                        }
                        b.commit().addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Toast.makeText(delete_data.this, "Successfully deleted", Toast.LENGTH_SHORT).show();
                            }
                        });
                    }
                });


            }
        });


    }
}
