package com.example.eatup;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;
        import android.widget.Toast;

public class ItemsOrders extends AppCompatActivity {
    String user_name,user_email,user_address,user_ph,user_age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items_orders);


        Button proceed = (Button) findViewById(R.id.proceedOrder);
        proceed.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                SelectedItems();
            }
        });

        Intent intent = getIntent();
        user_name = intent.getStringExtra("name");
        user_email = intent.getStringExtra("email");
        user_age = intent.getStringExtra("age");
        user_address = intent.getStringExtra("address");
        user_ph = intent.getStringExtra("ph");

    }

    public static int quantity1 = 0;
    public static int quantity2 = 0;
    public static int quantity3 = 0;
    public static int quantity4 = 0;
    public static int quantity5 = 0;
    public static int quantity6 = 0;
    public static int quantity7 = 0;
    public static int quantity8 = 0;
    public static int quantity9 = 0;
    public static int quantity10 = 0;
    public static int quantity11 = 0;
    public static int quantity12 = 0;
    public static int quantity13 = 0;
    public static int quantity14 = 0;
    public static int quantity15 = 0;

    public void  SelectedItems(){

        if(quantity1 == 0 && quantity2 == 0 && quantity3 == 0 && quantity4 == 0&& quantity5 == 0&& quantity6 == 0
                && quantity7 == 0&& quantity8 == 0&& quantity9 == 0&& quantity10 == 0&& quantity11 == 0
                && quantity12 == 0&& quantity13 == 0&& quantity14 == 0&& quantity15 == 0){
            Toast.makeText(this,"You have to Select Item First",Toast.LENGTH_SHORT).show();
        }
        else{
            Intent myIntent = new Intent(this, SelectedItems.class);
            myIntent.putExtra("name",user_name);
            myIntent.putExtra("email",user_email);
            myIntent.putExtra("age",user_age);
            myIntent.putExtra("address",user_address);
            myIntent.putExtra("ph",user_ph);
            startActivity(myIntent);
        }
    }

    public void addItem1(View view){
        if(quantity1 <= 100) {
            quantity1 = quantity1 + 1;
            display(quantity1);
        }
        else{
            Toast.makeText(this,"You Cannot Add More",Toast.LENGTH_SHORT).show();
        }
    }
    public void removeItem1(View view){
        if(quantity1 >= 1) {
            quantity1 = quantity1 - 1;
            display(quantity1);
        }
        else
            Toast.makeText(this,"You Cannot have less than 0 Item",Toast.LENGTH_SHORT).show();
    }
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.foodQuantity1);
        quantityTextView.setText("" + number);
    }
//Second Item

    public void addItem2(View view){
        if(quantity2 <= 100) {
            quantity2 = quantity2 + 1;
            display2(quantity2);
        }
        else{
            Toast.makeText(this,"You Cannot Add More",Toast.LENGTH_SHORT).show();
        }
    }
    public void removeItem2(View view){
        if(quantity2 >= 1) {
            quantity2 = quantity2 - 1;
            display2(quantity2);
        }
        else
            Toast.makeText(this,"You Cannot have less than 0 Item",Toast.LENGTH_SHORT).show();
    }
    private void display2(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.foodQuantity2);
        quantityTextView.setText("" + number);
    }


    //3rd Item

    public void addItem3(View view){
        if(quantity3 <= 100) {
            quantity3 = quantity3 + 1;
            display3(quantity3);
        }
        else{
            Toast.makeText(this,"You Cannot Add More",Toast.LENGTH_SHORT).show();
        }
    }
    public void removeItem3(View view){
        if(quantity3 >= 1) {
            quantity3 = quantity3 - 1;
            display3(quantity3);
        }
        else
            Toast.makeText(this,"You Cannot have less than 0 Item",Toast.LENGTH_SHORT).show();
    }
    private void display3(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.foodQuantity3);
        quantityTextView.setText("" + number);
    }



    //4th Item

    public void addItem4(View view){
        if(quantity4 <= 100) {
            quantity4 = quantity4 + 1;
            display4(quantity4);
        }
        else{
            Toast.makeText(this,"You Cannot Add More",Toast.LENGTH_SHORT).show();
        }
    }
    public void removeItem4(View view){
        if(quantity4 >= 1) {
            quantity4 = quantity4 - 1;
            display4(quantity4);
        }
        else
            Toast.makeText(this,"You Cannot have less than 0 Item",Toast.LENGTH_SHORT).show();
    }
    private void display4(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.foodQuantity4);
        quantityTextView.setText("" + number);
    }


    //5th Item

    public void addItem5(View view){
        if(quantity5 <= 100) {
            quantity5 = quantity5 + 1;
            display5(quantity5);
        }
        else{
            Toast.makeText(this,"You Cannot Add More",Toast.LENGTH_SHORT).show();
        }
    }
    public void removeItem5(View view){
        if(quantity5 >= 1) {
            quantity5 = quantity5 - 1;
            display5(quantity5);
        }
        else
            Toast.makeText(this,"You Cannot have less than 0 Item",Toast.LENGTH_SHORT).show();
    }
    private void display5(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.foodQuantity5);
        quantityTextView.setText("" + number);
    }


    //6th Item

    public void addItem6(View view){
        if(quantity6 <= 100) {
            quantity6 = quantity6 + 1;
            display6(quantity6);
        }
        else{
            Toast.makeText(this,"You Cannot Add More",Toast.LENGTH_SHORT).show();
        }
    }
    public void removeItem6(View view){
        if(quantity6 >= 1) {
            quantity6 = quantity6 - 1;
            display6(quantity6);
        }
        else
            Toast.makeText(this,"You Cannot have less than 0 Item",Toast.LENGTH_SHORT).show();
    }
    private void display6(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.foodQuantity6);
        quantityTextView.setText("" + number);
    }


    //7th Item

    public void addItem7(View view){
        if(quantity7 <= 100) {
            quantity7 = quantity7 + 1;
            display7(quantity7);
        }
        else{
            Toast.makeText(this,"You Cannot Add More",Toast.LENGTH_SHORT).show();
        }
    }
    public void removeItem7(View view){
        if(quantity7 >= 1) {
            quantity7 = quantity7 - 1;
            display7(quantity7);
        }
        else
            Toast.makeText(this,"You Cannot have less than 0 Item",Toast.LENGTH_SHORT).show();
    }
    private void display7(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.foodQuantity7);
        quantityTextView.setText("" + number);
    }


    //8th Item

    public void addItem8(View view){
        if(quantity8 <= 100) {
            quantity8 = quantity8 + 1;
            display8(quantity8);
        }
        else{
            Toast.makeText(this,"You Cannot Add More",Toast.LENGTH_SHORT).show();
        }
    }
    public void removeItem8(View view){
        if(quantity8 >= 1) {
            quantity8 = quantity8 - 1;
            display8(quantity8);
        }
        else
            Toast.makeText(this,"You Cannot have less than 0 Item",Toast.LENGTH_SHORT).show();
    }
    private void display8(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.foodQuantity8);
        quantityTextView.setText("" + number);
    }


    //9th Item

    public void addItem9(View view){
        if(quantity9 <= 100) {
            quantity9 = quantity9 + 1;
            display9(quantity9);
        }
        else{
            Toast.makeText(this,"You Cannot Add More",Toast.LENGTH_SHORT).show();
        }
    }
    public void removeItem9(View view){
        if(quantity9 >= 1) {
            quantity9 = quantity9 - 1;
            display9(quantity9);
        }
        else
            Toast.makeText(this,"You Cannot have less than 0 Item",Toast.LENGTH_SHORT).show();
    }
    private void display9(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.foodQuantity9);
        quantityTextView.setText("" + number);
    }


    //10th Item

    public void addItem10(View view){
        if(quantity10 <= 100) {
            quantity10 = quantity10 + 1;
            display10(quantity10);
        }
        else{
            Toast.makeText(this,"You Cannot Add More",Toast.LENGTH_SHORT).show();
        }
    }
    public void removeItem10(View view){
        if(quantity10 >= 1) {
            quantity10 = quantity10 - 1;
            display10(quantity10);
        }
        else
            Toast.makeText(this,"You Cannot have less than 0 Item",Toast.LENGTH_SHORT).show();
    }
    private void display10(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.foodQuantity10);
        quantityTextView.setText("" + number);
    }


    //11th Item

    public void addItem11(View view){
        if(quantity11 <= 100) {
            quantity11 = quantity11 + 1;
            display11(quantity11);
        }
        else{
            Toast.makeText(this,"You Cannot Add More",Toast.LENGTH_SHORT).show();
        }
    }
    public void removeItem11(View view){
        if(quantity11 >= 1) {
            quantity11 = quantity11 - 1;
            display11(quantity11);
        }
        else
            Toast.makeText(this,"You Cannot have less than 0 Item",Toast.LENGTH_SHORT).show();
    }
    private void display11(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.foodQuantity11);
        quantityTextView.setText("" + number);
    }


    //12th Item

    public void addItem12(View view){
        if(quantity12 <= 100) {
            quantity12 = quantity12 + 1;
            display12(quantity12);
        }
        else{
            Toast.makeText(this,"You Cannot Add More",Toast.LENGTH_SHORT).show();
        }
    }
    public void removeItem12(View view){
        if(quantity12 >= 1) {
            quantity12 = quantity12 - 1;
            display12(quantity12);
        }
        else
            Toast.makeText(this,"You Cannot have less than 0 Item",Toast.LENGTH_SHORT).show();
    }
    private void display12(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.foodQuantity12);
        quantityTextView.setText("" + number);
    }



    //13th Item

    public void addItem13(View view){
        if(quantity13 <= 100) {
            quantity13 = quantity13 + 1;
            display13(quantity13);
        }
        else{
            Toast.makeText(this,"You Cannot Add More",Toast.LENGTH_SHORT).show();
        }
    }
    public void removeItem13(View view){
        if(quantity13 >= 1) {
            quantity13 = quantity13 - 1;
            display13(quantity13);
        }
        else
            Toast.makeText(this,"You Cannot have less than 0 Item",Toast.LENGTH_SHORT).show();
    }
    private void display13(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.foodQuantity13);
        quantityTextView.setText("" + number);
    }


    //14th Item

    public void addItem14(View view){
        if(quantity14 <= 100) {
            quantity14 = quantity14 + 1;
            display14(quantity14);
        }
        else{
            Toast.makeText(this,"You Cannot Add More",Toast.LENGTH_SHORT).show();
        }
    }
    public void removeItem14(View view){
        if(quantity14 >= 1) {
            quantity14 = quantity14 - 1;
            display14(quantity14);
        }
        else
            Toast.makeText(this,"You Cannot have less than 0 Item",Toast.LENGTH_SHORT).show();
    }
    private void display14(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.foodQuantity14);
        quantityTextView.setText("" + number);
    }

    //15th Item

    public void addItem15(View view){
        if(quantity15 <= 100) {
            quantity15 = quantity15 + 1;
            display15(quantity15);
        }
        else{
            Toast.makeText(this,"You Cannot Add More",Toast.LENGTH_SHORT).show();
        }
    }
    public void removeItem15(View view){
        if(quantity15 >= 1) {
            quantity15 = quantity15 - 1;
            display15(quantity15);
        }
        else
            Toast.makeText(this,"You Cannot have less than 0 Item",Toast.LENGTH_SHORT).show();
    }
    private void display15(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.foodQuantity15);
        quantityTextView.setText("" + number);
    }

}