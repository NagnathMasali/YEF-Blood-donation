package com.example.mann.blooddonationapp;

import android.content.Context;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;


public class
registerationActivity extends AppCompatActivity {


    Context context = registerationActivity.this;

    RadioGroup gender;
    RadioButton Male,Female;
    EditText name, mail, contact, contact2, password, bloodtype, uname, address,cpassword,state,bloodDonated,city;
    ArrayList<String> listAll = new ArrayList<>();
    String sname, smail, scontact, spassword, scontact2, suname, sbloodtype, scity, saddress,scpassword,sgender,sstate,sbloodDonated;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registeration);

        name = findViewById(R.id.name);
        mail = findViewById(R.id.mail);
        contact = findViewById(R.id.contact);
        password = findViewById(R.id.password);
        bloodtype = findViewById(R.id.bloodType);
        city = findViewById(R.id.city);
        contact2 = findViewById(R.id.contact2);
        uname = findViewById(R.id.uname);
        address = findViewById(R.id.address);
        state=findViewById(R.id.state);
        cpassword=findViewById(R.id.cpassword);
        bloodDonated=findViewById(R.id.lastTime);
        gender=findViewById(R.id.gender);
        Male=findViewById(R.id.male);
        Female=findViewById(R.id.female);

        register = findViewById(R.id.register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sname = name.getText().toString();
                smail = mail.getText().toString();
                scontact = contact.getText().toString();
                scontact2 = contact2.getText().toString();
                sbloodtype = bloodtype.getText().toString();
                scity = city.getText().toString();
                saddress = address.getText().toString();
                suname = uname.getText().toString();
                spassword = password.getText().toString();
                scpassword = cpassword.getText().toString();
                sstate = state.getText().toString();
                sbloodDonated = bloodDonated.getText().toString();
                int selectedId;
                RadioButton tempradiobutton;
                try {
                    selectedId = gender.getCheckedRadioButtonId();
                    tempradiobutton = findViewById(selectedId);
                    sgender = tempradiobutton.getText().toString().trim();
                } catch (Exception e) {
//
                }

                boolean isError = false;

                if (scontact.length() != 10) {
                    isError = true;
                    contact.setError("Enter valid contact");
                }
                if (scontact2.length() != 10) {
                    isError = true;
                    contact2.setError("Enter valid contact");
                }
                if(!smail.contains("@"))
                {
                    isError=true;
                    mail.setError("enter valid mail id");
                }
                if (spassword.length() < 6) {
                    isError = true;
                    password.setError("password must have atleast 5 characters");
                }
                if(!spassword.contentEquals(scpassword))
                {
                    isError=true;
                    cpassword.setError("enter correct password");
                }
                if (sbloodtype.length()<1) {
                    isError = true;
                    bloodtype.setError("enter blood type");
                }
              if(!isError)
                    onPostExecute(isError);



            }

            protected void onPostExecute(boolean r) {
                if (r == false)
                    Toast.makeText(context, "registered successfully", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(context, "retry", Toast.LENGTH_SHORT).show();

            }

            });
        }
    }

