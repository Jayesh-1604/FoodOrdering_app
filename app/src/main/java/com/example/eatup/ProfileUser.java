package com.example.eatup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class ProfileUser extends AppCompatActivity {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    String user_name,user_email,user_address,user_ph,user_age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_user);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        navigationView = (NavigationView) findViewById(R.id.nav_view);

        drawerLayout =(DrawerLayout)findViewById(R.id.drawer);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,
                R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.nav_home:
                        Toast.makeText(getApplicationContext(),"Welcome to Home",Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        Intent myIntent = new Intent(ProfileUser.this, HomeActivity.class);
                        myIntent.putExtra("name",user_name);
                        myIntent.putExtra("email",user_email);
                        myIntent.putExtra("age",user_age);
                        myIntent.putExtra("address",user_address);
                        myIntent.putExtra("ph",user_ph);
                        startActivity(myIntent);
                        finish();
                        break;

                    case R.id.nav_profile:
                        Toast.makeText(getApplicationContext(),"Welcome To Profile",Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.nav_order_history:
                        Toast.makeText(getApplicationContext(),"Welcome To History",Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        myIntent = new Intent(ProfileUser.this, PreviousOrders.class);
                        myIntent.putExtra("name",user_name);
                        myIntent.putExtra("email",user_email);
                        myIntent.putExtra("age",user_age);
                        myIntent.putExtra("address",user_address);
                        myIntent.putExtra("ph",user_ph);
                        startActivity(myIntent);
                        finish();

                        break;
                    case R.id.nav_FAQ:
                        Toast.makeText(getApplicationContext(),"Welcome to FAQ",Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        myIntent = new Intent(ProfileUser.this, faq.class);
                        myIntent.putExtra("name",user_name);
                        myIntent.putExtra("email",user_email);
                        myIntent.putExtra("age",user_age);
                        myIntent.putExtra("address",user_address);
                        myIntent.putExtra("ph",user_ph);
                        startActivity(myIntent);
                        finish();

                        break;

                    case R.id.nav_contact:
                        Toast.makeText(getApplicationContext(),"Contact",Toast.LENGTH_LONG).show();
                        String add[] = {"eatupcustomercare@gmail.com"};
                        String sub="Don't Worry "+user_name+"....\n";
                        sub+="Just Send your Query Message on\n\n eatupcustomercare@gmail.com\n\n";
                        sub+="Our Technical Assistant will Contact Your Soon....#StayConnected";
                        sub+="\n\n\nTake care \nStay Safe \n#Go Corona";
                        composeEmail(add,"EatUp Feedback",sub);
                        break;


                    case R.id.nav_signout:
                        Toast.makeText(getApplicationContext(),"Signout",Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        myIntent = new Intent(ProfileUser.this, loginpage.class);
                        startActivity(myIntent);
                        finish();
                        break;
                }
                return true;
            }
        });


        Intent intent = getIntent();
        user_name = intent.getStringExtra("name");
        user_email = intent.getStringExtra("email");
        user_age = intent.getStringExtra("age");
        user_address = intent.getStringExtra("address");
        user_ph = intent.getStringExtra("ph");

        TextView textView = (TextView)findViewById(R.id.profile_name);
        textView.setText(user_name);
        TextView textView1 = (TextView)findViewById(R.id.profile_email);
        textView1.setText(user_email);
        TextView textView2 = (TextView)findViewById(R.id.profile_age);
        textView2.setText(user_age);
        TextView textView3 = (TextView)findViewById(R.id.profile_add);
        textView3.setText(user_address);
        TextView textView4 = (TextView)findViewById(R.id.profile_ph);
        textView4.setText(user_ph);





    }
    public void composeEmail(String[] addresses, String subject,String body) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, addresses);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, body);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }




}