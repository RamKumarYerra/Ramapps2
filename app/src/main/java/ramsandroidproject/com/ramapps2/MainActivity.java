package ramsandroidproject.com.ramapps2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText et1;
    EditText et2;
    EditText et3;
    EditText et4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.b1);
        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);
        et3 = (EditText)findViewById(R.id.et3);
        et4 = (EditText)findViewById(R.id.et4);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String name = et1.getText().toString();
                final String phonenumber = et2.getText().toString();
                final String email = et3.getText().toString();
                final String password = et4.getText().toString();
                Toast.makeText(MainActivity.this,"Clicked",Toast.LENGTH_LONG).show();
                System.out.println("Name" + name + "\n Phone Number" + phonenumber + "\n Email" + email + "\n Password" + password);

                Intent i = new Intent(MainActivity.this,enudemo.class);
                startActivity(i);

            }
        });
    }
}
