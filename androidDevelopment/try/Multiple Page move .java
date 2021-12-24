public class MainActivity extends AppCompatActivity {
    public boolean flag = true;
private   Button button,button2;
private EditText editText1,editText2,editText3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        editText1 = findViewById(R.id.editTextTextPersonName);
        editText2 = findViewById(R.id.editTextPhone);
        editText3 = findViewById(R.id.editTextNumberPassword);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = editText1.getText().toString();
                String pass = editText3.getText().toString();

            if(name.equals("T") && pass.equals("k")) {
                open();
            }
            else{
                Toast.makeText(MainActivity.this, "something went wrong", Toast.LENGTH_SHORT).show();
            }
            }
        });

        // click button 2 to move to new screen 3
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    openScreen3();
            }
        });

    }
// Method to open screen 2 from this screen
    public void open(){
        Intent intent = new Intent(this,screen2.class);
        startActivity(intent);
    }

    public void openScreen3(){
        Intent intent = new Intent(this,screen3.class);
        startActivity(intent);
    }
