package org.meicode.coffeeap;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    int c1,c2,c3,c4,c5,c6=0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("SetTextI18n")
    private void display(int n)
    {
        TextView qu1=(TextView) findViewById(R.id.capicinno);
        qu1.setText(" "+c1);
        TextView qu2=(TextView) findViewById(R.id.espre);
        qu2.setText(" "+c2);
        TextView qu3=(TextView) findViewById(R.id.mach);
        qu3.setText(" "+c3);
        TextView qu4=(TextView) findViewById(R.id.americano);
        qu4.setText(" "+c4);
        TextView qu5=(TextView) findViewById(R.id.latte);
        qu5.setText(" "+c5);
        TextView qu6=(TextView) findViewById(R.id.mochaaa);
        qu6.setText(" "+c6);
    }
    public void incremnet1(View view)
    {
        c1=c1+1;
        display(c1);
    }
    public void decrement1(View view)
    {
        c1=c1-1;
        display(c1);
    }
    public void incremnet2(View view)
    {
        c2=c2+1;
        display(c2);
    }
    public void decrement2(View view)
    {
        c2=c2-1;
        display(c2);
    }
    public void incremnet3(View view)
    {
        c3=c3+1;
        display(c3);
    }
    public void decrement3(View view)
    {
        c3=c3-1;
        display(c3);
    }
    public void incremnet4(View view)
    {
        c4=c4+1;
        display(c4);
    }
    public void decrement4(View view)
    {
        c4=c4-1;
        display(c4);
    }
    public void incremnet5(View view)
    {
        c5=c5+1;
        display(c5);
    }
    public void decrement5(View view)
    {
        c5=c5-1;
        display(c5);
    }
    public void incremnet6(View view)
    {
        c6=c6+1;
        display(c6);
    }
    public void decrement6(View view)
    {
        c6=c6-1;
        display(c6);
    }
    public void submitOrder(View view)
    {
        EditText text = (EditText) findViewById(R.id.editext);
        String val = text.getText().toString();

        CheckBox whipped = (CheckBox) findViewById(R.id.whipped);
        boolean hasWhippedCream = whipped.isChecked();

        CheckBox chocoSyrup = (CheckBox) findViewById(R.id.chocosyrup);
        boolean hasChocoSyrup = chocoSyrup.isChecked();

        CheckBox chocoChips = (CheckBox) findViewById(R.id.chocochips);
        boolean hasChocoChips = chocoChips.isChecked();

        int price=calculate(hasWhippedCream, hasChocoSyrup, hasChocoChips);
        String mes = orderSummary(val, price,hasWhippedCream, hasChocoSyrup,hasChocoChips);
        displayPrice(mes);


    }
    private int calculate(boolean hasWhippedCream, boolean hasChocoSyrup, boolean hasChocoChips)
    {
        int rate=60;
        int n= c1+c2+c3+c4+c5+c6;

        if(hasWhippedCream)
        {
            rate += 10;
        }
        if(hasChocoSyrup)
        {
            rate += 10;
        }
        if(hasChocoChips)
        {
            rate += 10;
        }
        return n*rate;
    }
    private String orderSummary(String name, int price, boolean hasWhippedCream, boolean hasChocoSyrup, boolean hasChocoChips)
    {
        String mes="Name:"+name;
        mes += "\nAdded whipped Cream:" +hasWhippedCream;
        mes += "\nAdded Chocolate syrup:" +hasChocoSyrup;
        mes += "\nAdded Choco Chips:"+hasChocoChips;
        mes +="\nTotal: Rs."+price;
        return mes;
    }
    public void displayPrice(String message)
    {
        TextView price=(TextView) findViewById(R.id.price);
        price.setText(message);
    }
}