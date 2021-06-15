package com.example.eatup;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.net.Uri;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

public class SelectedItems extends AppCompatActivity {
    String user_name,user_email,user_address,user_ph,user_age;
    String order1;
    int total = 0;
    ItemsOrders q = new ItemsOrders();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected_items);

        Intent intent = getIntent();
        user_name = intent.getStringExtra("name");
        user_email = intent.getStringExtra("email");
        user_age = intent.getStringExtra("age");
        user_address = intent.getStringExtra("address");
        user_ph = intent.getStringExtra("ph");
        calculate();

    }


    public void viewOrderSummery(View view){
        calculate();
    }

    public String  calculate() {
        String foodName = "";
        String message = "";
        if (q.quantity1 >= 1) {
            total = total + q.quantity1 * 120;
            foodName = foodName + "Paneer Masala : ";
            foodName = foodName + q.quantity1 + " X 120 = " + q.quantity1 * 120 + "\n";
            //display1(foodName);
        }
        if (q.quantity2 >= 1) {
            total = total + q.quantity2 * 125;
            foodName = foodName + "Paneer Tikka : ";
            foodName = foodName + q.quantity2 + " X 125 = " + q.quantity2 * 125 + "\n";
            //display2(foodName);
        }
        if (q.quantity3 >= 1) {
            total = total + q.quantity3 * 80;
            foodName = foodName + "Chana Masala : ";
            foodName = foodName + q.quantity3 + " X 80 = " + q.quantity3 * 80 + "\n";
            //display3(foodName);
        }
        if (q.quantity4 >= 1) {
            total = total + q.quantity4 * 90;
            foodName = foodName + "Alu Mutter : ";
            foodName = foodName + q.quantity4 + " X 90 = " + q.quantity4 * 90 + "\n";
            //display4(foodName);
        }
        if (q.quantity5 >= 1) {
            total = total + q.quantity5 * 60;
            foodName = foodName + "Shev Bhaji : ";
            foodName = foodName + q.quantity5 + " X 60 = " + q.quantity5 * 60 + "\n";
            //display5(foodName);
        }
        if (q.quantity6 >= 1) {
            total = total + q.quantity6 * 95;
            foodName = foodName + "Bhindi Fry : ";
            foodName = foodName + q.quantity6 + " X 95 = " + q.quantity6 * 95 + "\n";
            //display6(foodName);
        }
        if (q.quantity7 >= 1) {
            total = total + q.quantity7 * 80;
            foodName = foodName + "Methi Masala : ";
            foodName = foodName + q.quantity7 + " X 80 = " + q.quantity7 * 80 + "\n";
            //display7(foodName);
        }
        if (q.quantity8 >= 1) {
            total = total + q.quantity8 * 140;
            foodName = foodName + "Malai Kofta: ";
            foodName = foodName + q.quantity8 + " X 140 = " + q.quantity8 * 140 + "\n";
            //display8(foodName);
        }
        if (q.quantity9 >= 1) {
            total = total + q.quantity9 * 95;
            foodName = foodName + "Dam Aloo : ";
            foodName = foodName + q.quantity9 + " X 95 = " + q.quantity9 * 95 + "\n";
            //display9(foodName);
        }
        if (q.quantity10 >= 1) {
            total = total + q.quantity10 * 60;
            foodName = foodName + "Plain Rice : ";
            foodName = foodName + q.quantity10 + " X 60 = " + q.quantity10 * 60 + "\n";
            //display10(foodName);
        }
        if (q.quantity11 >= 1) {
            total = total + q.quantity11 * 80;
            foodName = foodName + "Fried Rice : ";
            foodName = foodName + q.quantity11 + " X 80 = " + q.quantity11 * 80 + "\n";
            //display11(foodName);
        }
        if (q.quantity12 >= 1) {
            total = total + q.quantity12 * 10;
            foodName = foodName + "Plain Roti : ";
            foodName = foodName + q.quantity12 + " X 10 = " + q.quantity12 * 10 + "\n";
            //display12(foodName);
        }
        if (q.quantity13 >= 1) {
            total = total + q.quantity13 * 15;
            foodName = foodName + "Butter Roti : ";
            foodName = foodName + q.quantity13 + " X 15 = " + q.quantity13 * 15 + "\n";
            //display13(foodName);
        }
        if (q.quantity14 >= 1) {
            total = total + q.quantity14 * 5;
            foodName = foodName + "Plain Papad : ";
            foodName = foodName + q.quantity14 + " X 5 = " + q.quantity14 * 5 + "\n";
            //display14(foodName);
        }
        if (q.quantity15 >= 1) {
            total = total + q.quantity15 * 10;
            foodName = foodName + "Masala Papad : ";
            foodName = foodName + q.quantity15 + " X 10 = " + q.quantity15 * 10 + "\n";
            //display15(foodName);
        }

        order_user(foodName);
        return foodName;
    }
//
//    private void display1(String foodName1) {
//        TextView quantityTextView = (TextView) findViewById(
//                R.id.displayItem1);
//        quantityTextView.setText("" + foodName1);
//    }
//    private void displayTotal(int foodName1) {
//        TextView quantityTextView = (TextView) findViewById(
//                R.id.displayTotal);
//        quantityTextView.setText("" + foodName1);
//    }
//
//    private void orderFood(View view){
//        String mail = calculate();
//        Intent intent = new Intent(Intent.ACTION_SENDTO);
//        intent.setData(Uri.parse("mailto:"));
//        intent.putExtra(Intent.EXTRA_SUBJECT,"EatUp Order Form Customer ");
//        intent.putExtra(Intent.EXTRA_TEXT,mail);
//        if(intent.resolveActivity(getPackageManager())!= null){
//            startActivity(intent);
//        }
//    }

    public void orderSummary(View view) {
        TextView textView = (TextView)findViewById(R.id.order_summary);
        order1 = order1+"\nTotal Bill : "+total;
        textView.setText(order1);

    }


     public String order_user(String order){
        order1=order;
        return order1;
     }

    public void placeOrder(View view) {
        String add[] = {user_email};
        String sub=order1;
        sub+="\n\n You Need to Send This email on \n\neatupcustomercare@gmail.com\n\n";
        sub+="Payment Only Through Cash On Delivery \n\n\n\n";
        sub+="\n\n\nTake care \nStay Safe \n#Go Corona";
        composeEmail(add,"EatUp Place Order",sub);
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

