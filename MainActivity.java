package com.example.lenovo.guessgame;

        import android.app.ActionBar;
        import android.app.Activity;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import java.util.Random;

        import android.text.Editable;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int num;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Establish_Random( View view){
        Random r = new Random();
        num = r.nextInt(1000);
        EditText txtNum = (EditText) findViewById(R.id.editText);
        Toast.makeText(this,"Start Now",Toast.LENGTH_LONG).show();
        txtNum.setText("");
    }
    public void Check_Num(View view ){
        int numberEntered;
        EditText txtNum = (EditText) findViewById(R.id.editText);
        numberEntered = Integer.parseInt(txtNum.getText().toString());

        if (numberEntered == num){
            Toast.makeText(this, "Good",Toast.LENGTH_LONG).show();
            Toast.makeText(this, "Tab Start to Play Again",Toast.LENGTH_LONG).show();

        }
        else if (numberEntered - num > 5){
            Toast.makeText(this, "This Number is Greater, Please Enter Smaller",Toast.LENGTH_LONG).show();
        }
        else if (num - numberEntered >5){
            Toast.makeText(this, "This Number is Smaller, Please Enter Greater",Toast.LENGTH_LONG).show();

        }
        else {
            Toast.makeText(this, "This Number is Very Close",Toast.LENGTH_LONG).show();
        }


    }

}
