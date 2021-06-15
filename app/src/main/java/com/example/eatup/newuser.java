package com.example.eatup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.core.Tag;

import java.util.zip.DataFormatException;



public class newuser extends AppCompatActivity {
    EditText tname,temail,tadd,tph,tage,tpass,tconfpass;
    RadioGroup rg;
    RadioButton male,female,other;
    String gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newuser);

        tname = (EditText) findViewById(R.id.user_name);
        temail = (EditText) findViewById(R.id.user_email);
        tadd = (EditText) findViewById(R.id.user_Address);
        tage = (EditText) findViewById(R.id.user_age);
        tpass = (EditText) findViewById(R.id.user_pass);
        tconfpass = (EditText) findViewById(R.id.user_confirm_pass);
        tph = (EditText) findViewById(R.id.user_ph);
        male = (RadioButton)findViewById(R.id.gender_male);
        female = (RadioButton)findViewById(R.id.gender_female);
        other = (RadioButton)findViewById(R.id.gender_other);
        rg = (RadioGroup) findViewById(R.id.radioGrp);

        if(male.isChecked()){
            gender = "male";
        }
        if(female.isChecked()){
            gender = "female";
        }
        if(other.isChecked()){
            gender = "other";
        }



    }





    public void addRe(View view){


        String name=tname.getText().toString().trim();
        String email = temail.getText().toString().trim();
        String address = tadd.getText().toString().trim();
        String ph = tph.getText().toString().trim();
        String age =tage.getText().toString().trim();
        String pass = tconfpass.getText().toString().trim();
        String passt = tpass.getText().toString().trim();



        if(name.isEmpty()&&email.isEmpty()&&address.isEmpty()&&ph.isEmpty()&&age.isEmpty()&&pass.isEmpty()){
            Toast.makeText(getApplicationContext(),"Please fill all sections...",Toast.LENGTH_LONG).show();
        }
        else {

            if(pass.equals(passt)) {

                DataHolder obj1 = new DataHolder(name, email, address, pass, age,ph);
                //   System.out.println(obj1);
                //     Log.v("my acticity", obj1.getAddress() + "" + obj1.getPass() + "" + obj1.getAge());

                final FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference ref = database.getReference("user");
//        System.out.println(obj1);
                ref.child(ph).setValue(obj1);


                Toast.makeText(getApplicationContext(), "Your Registration Complete Successfully", Toast.LENGTH_LONG).show();
                tname.setText("");
                temail.setText("");
                tadd.setText("");
                tage.setText("");
                tpass.setText("");
                tconfpass.setText("");
                tph.setText("");
                rg.clearCheck();

                senEmail(email,name,ph,pass);
                Intent myIntent = new Intent(newuser.this, loginpage.class);
                startActivity(myIntent);
                finish();
            }
            else{
                Toast.makeText(getApplicationContext(),"Please Confirm your password",Toast.LENGTH_LONG).show();
            }
        }

     }



    private void senEmail(String email,String name,String ph,String pass) {
        String mSubject = "Welcome To Eatup";
        String mMessage = "» Eatup\n" +
                "\t\tHi " +name+"\n"+
                "\t\t Thanks for signing up to Eatup, the food\n" +"\t\tdelivery app.\n" +
                "\n\t\tHere are your login details\n" +
                "\t\tPhone Number:\t " +
                ph+"\n\n" +
                "\t\tPassword:\t " +
                pass+"\n\n" +
                "\t\tLog in to Eatup\n" +
                "\t\tLet me know if you have any questions,\n"+"\t\tfeedback or ideas—just reply" +
                "to this email :)\n\n\n\n" +
                "\tJayesh Wani\n" +
                "\tCo-founder & CEO\n\t(wrkc.pvt.ltd)" +
                "\n\n\t* wrkc on Twitter\n" +
                "\tGet more tips on using Eatup in our Help Centre.\n" +
                "\tFollow Eatup on Twitter, Facebook, Instagram.\n" +
                "\twrkc Pty Ltd,289 Andheri West, Mumbai, India\n" +
                "\n\n\t#Stay Safe &\n"+
                "\t#Stay Healthy\n";

        JavaMailAPI javaMailAPI = new JavaMailAPI(this, email, mSubject, mMessage);

        javaMailAPI.execute();
    }
}