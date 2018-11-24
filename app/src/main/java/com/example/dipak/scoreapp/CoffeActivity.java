package com.example.dipak.scoreapp;

import android.content.Context;
import android.icu.util.ValueIterator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CoffeActivity extends AppCompatActivity {

    Button ok;
    TextView check, name, coffequantity, thank, coffeprice, order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffe);
        ok = findViewById(R.id.ok_btn);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputnumber();
            }
        });

        check = findViewById(R.id.check_Tv);

    }

    int number = 6;

    public void ordercoffee(View view) {
        TextView quality = findViewById(R.id.quantity_tv);
        quality.setText("" + number);
        displayprice(number * 10);
        dislayenjoy();
        createsummery();

    }

   /* private int displayquality()
    {
        return number;
    }*/

    public void displayprice(int prize) {
        TextView price = findViewById(R.id.price_tv);
        price.setText("" + prize);
    }

    public void increment(View view) {
        number++;
        TextView quality = findViewById(R.id.quantity_tv);
        quality.setText("" + number);
        displayprice(number * 10);
    }

    /*public void displaysix(int number) {
        if (number == 6) {
            int prize = number * 10;
            TextView price = findViewById(R.id.price_tv);
            price.setText(" That would be $" +prize+"Please");
        }
    }*/

    public void decrement(View view) {
        number--;
        TextView quality = findViewById(R.id.quantity_tv);
        quality.setText("" + number);
        displayprice(number * 10);
    }

    public void dislayenjoy()

    {
        String var;
        var = "Dipak";
        var = var + " Dinesh";
        var = var + " Brother";
        TextView enjoy = findViewById(R.id.thankyou_Tv);
        enjoy.setText("Thank You \n and Enjoy the Coffe" + var);
    }

    public void inputnumber() {
        EditText inputnumber_Et = findViewById(R.id.input_Et);
        String num = inputnumber_Et.getText().toString();
        TextView textView = findViewById(R.id.input_Tv);
        textView.setText(String.valueOf(num));
        TextView check = findViewById(R.id.check_Tv);
        check.setText(returnfunction("Dipak", "2018"));

    }

    public void hidekeyboard(View view) {
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    private String returnfunction(String name, String year) {

        return "Copyright" + name + "Year" + year + "BC";
    }

    public void createsummery() {
        String A = "Dipak Pant";
        String B = "Thank You";
        int p = number * 10;
        String C = "Order Summery";
        name = findViewById(R.id.name_Tv);
        name.setText("" + A);
        coffequantity = findViewById(R.id.coffequantity_Tv);
        coffequantity.setText("" + number);
        coffeprice = findViewById(R.id.coffeprice_Tv);
        coffeprice.setText("" + p);
        thank = findViewById(R.id.thank_Tv);
        thank.setText("" + B);
        order = findViewById(R.id.orderSummerry_Tv);
        order.setText(String.valueOf(C));
    }

}
