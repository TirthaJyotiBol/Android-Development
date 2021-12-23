package com.example.tirtha_learn;

import androidx.appcompat.app.AppCompatActivity;

public class screen3 extends AppCompatActivity {

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);

        listView = findViewById(R.id.lv);

        ArrayList<String>list = new ArrayList<>();
        list.add("Apple");
        list.add("Mango");
        list.add("Grapes");
   


        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    open1();
                }
                else if(i==1){
                    open2();
                }
                else if(i==2){
                   open3();
                }
            }
        });

    }

    public void open1(){
        Intent intent = new Intent(this,screen2.class);
        startActivity(intent);
    }

    public void open2(){
        Intent intent = new Intent(this,screen3.class);
        startActivity(intent);
    }

    public void open3(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}
