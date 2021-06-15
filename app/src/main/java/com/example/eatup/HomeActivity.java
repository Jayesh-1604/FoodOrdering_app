package com.example.eatup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Intent myIntent;
    RestaurantAdapter adapter;
    ListView listView;
    ArrayList<Restaurants> obj;
    String user_name,user_email,user_address,user_ph,user_age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        navigationView = (NavigationView) findViewById(R.id.nav_view);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.nav_home:
                        Toast.makeText(getApplicationContext(), "Welcome to Home", Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.nav_profile:
                        Toast.makeText(getApplicationContext(), "Welcome To Profile", Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        myIntent = new Intent(HomeActivity.this, ProfileUser.class);
                        myIntent.putExtra("name",user_name);
                        myIntent.putExtra("email",user_email);
                        myIntent.putExtra("age",user_age);
                        myIntent.putExtra("address",user_address);
                        myIntent.putExtra("ph",user_ph);
                        startActivity(myIntent);

                        finish();
                        break;

                    case R.id.nav_order_history:
                        Toast.makeText(getApplicationContext(), "Welcome To History", Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        myIntent = new Intent(HomeActivity.this, PreviousOrders.class);
                        myIntent = new Intent(HomeActivity.this, ProfileUser.class);
                        myIntent.putExtra("name",user_name);
                        myIntent.putExtra("email",user_email);
                        myIntent.putExtra("age",user_age);
                        myIntent.putExtra("address",user_address);
                        myIntent.putExtra("ph",user_ph);
                        startActivity(myIntent);
                        finish();
                        break;
                    case R.id.nav_FAQ:
                        Toast.makeText(getApplicationContext(), "Welcome to FAQ", Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        myIntent = new Intent(HomeActivity.this, faq.class);
                        myIntent.putExtra("name",user_name);
                        myIntent.putExtra("email",user_email);
                        myIntent.putExtra("age",user_age);
                        myIntent.putExtra("address",user_address);
                        myIntent.putExtra("ph",user_ph);
                        startActivity(myIntent);
                        finish();
                        break;

                    case R.id.nav_contact:
                        Toast.makeText(getApplicationContext(), "Contact", Toast.LENGTH_LONG).show();
                        String add[] = {"eatupcustomercare@gmail.com"};
                        String sub="Don't Worry "+user_name+"....\n";
                        sub+="Just Send your Query Message on\n\n eatupcustomercare@gmail.com\n\n";
                        sub+="Our Technical Assistant will Contact Your Soon....#StayConnected";
                        sub+="\n\n\nTake care \nStay Safe \n#Go Corona";
                        composeEmail(add,"EatUp FeedBack",sub);
                        break;


                    case R.id.nav_signout:
                        Toast.makeText(getApplicationContext(), "Signout", Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        myIntent = new Intent(HomeActivity.this, loginpage.class);
                        startActivity(myIntent);
                        finish();
                        break;

                }
                return true;
            }
        });


        obj = new ArrayList<Restaurants>();
        obj.add(new Restaurants(R.drawable.idllisambhar, "Pind Tadka", "4.2", "Jalgaon"));
        obj.add(new Restaurants(R.drawable.rasgulla, "Baco Tell", "4.8", "Jalgaon"));
        obj.add(new Restaurants(R.drawable.eggfry, "Garbar Non-Veg", "4.5", "Jalgaon"));
        obj.add(new Restaurants(R.drawable.biryani, "Heera Mahal", "4.0", "Jalgaon"));
        obj.add(new Restaurants(R.drawable.badusha, "Swirley's Shack", "4.3", "Jalgaon"));
        obj.add(new Restaurants(R.drawable.tandoorichicken, "LFC", "3.8", "Jalgaon"));
        obj.add(new Restaurants(R.drawable.gulabjamun, "Central Terk", "3.9", "Jalgaon"));
        obj.add(new Restaurants(R.drawable.eggrole, "Hotel Central", "4.9", "Jalgaon"));
        obj.add(new Restaurants(R.drawable.milkbarfi, "Ashkin' Poppins", "3.9", "Jalgaon"));
        obj.add(new Restaurants(R.drawable.veg_pulao, "Hotel Sundar", "4.1", "Jalgaon"));
        obj.add(new Restaurants(R.drawable.noodles, "Vedants's Chienese", "4.5", "Jalgaon"));
        obj.add(new Restaurants(R.drawable.shahithali, "Murli Manohar", "4.1", "Jalgaon"));
        obj.add(new Restaurants(R.drawable.shahikabab, "Hotel Mahindra", "4.4", "Jalgaon"));
        obj.add(new Restaurants(R.drawable.biryani, "Hotel SilverPalace", "4.1", "Jalgaon"));
        obj.add(new Restaurants(R.drawable.manchuriyan, "Shejawaan Hotel", "3.5", "Jalgaon"));
        obj.add(new Restaurants(R.drawable.tandooriroti, "Hotel Tandoori", "4.6", "Jalgaon"));

        listView = (ListView) findViewById(R.id.list_restaurant);

        adapter = new RestaurantAdapter(this, obj);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(HomeActivity.this,"Jayesh Click",Toast.LENGTH_LONG).show();
                myIntent = new Intent(HomeActivity.this, ItemsOrders.class);
                myIntent.putExtra("name",user_name);
                myIntent.putExtra("email",user_email);
                myIntent.putExtra("age",user_age);
                myIntent.putExtra("address",user_address);
                myIntent.putExtra("ph",user_ph);
                startActivity(myIntent);
                finish();

            }
        });



        Intent intent = getIntent();
         user_name = intent.getStringExtra("name");
         user_email = intent.getStringExtra("email");
         user_age = intent.getStringExtra("age");
         user_address = intent.getStringExtra("address");
         user_ph = intent.getStringExtra("ph");




    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.search_menu, menu);
        MenuItem menuItem = menu.findItem(R.id.search);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setQueryHint("Search Restaurants....");
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                if (TextUtils.isEmpty(newText)) {
                    adapter.filter("");
                    listView.clearTextFilter();
                } else {
                    adapter.filter(newText);
                }
                return true;
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.search) {
            return true;
        }
        return super.onOptionsItemSelected(item);
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


