package com.example.nagnathmasali.bda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class Signup extends AppCompatActivity {

    EditText nm, address, city, p1, p2, email, un, pwd;
    RadioGroup bg;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        nm=(EditText)findViewById(R.id.name);
        address=(EditText)findViewById(R.id.address);
        city=(EditText)findViewById(R.id.city);
        p1=(EditText)findViewById(R.id.p1);
        p2=(EditText)findViewById(R.id.p2);
        email=(EditText)findViewById(R.id.email);
        bg=(RadioGroup)findViewById(R.id.bg);
        un=(EditText)findViewById(R.id.username);
        pwd=(EditText)findViewById(R.id.password);
        submit=(Button)findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });
    }
}
