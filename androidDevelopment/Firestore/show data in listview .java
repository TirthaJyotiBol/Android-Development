package com.example.firetut;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

public class showData extends AppCompatActivity {

    public Button button;
    public ListView listView;
    public List<String> namelist = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);

        button = (Button)findViewById(R.id.showdata_button);
        listView = (ListView) findViewById(R.id.list_view_data);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseFirestore.getInstance().collection("vendor").addSnapshotListener(new EventListener<QuerySnapshot>() {
                    @Override
                    public void onEvent(@Nullable  QuerySnapshot value, @Nullable  FirebaseFirestoreException error) {
                        namelist.clear();
                        for(DocumentSnapshot snapshot:value)
                        {
                            namelist.add(snapshot.getString("name")+ "    :   "+snapshot.getString("age"));
                        }
                        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(showData.this, android.R.layout.simple_selectable_list_item,namelist);
                        arrayAdapter.notifyDataSetChanged();
                        listView.setAdapter(arrayAdapter);

                    }
                });
            }
        });

    }
}
