package tech.bfitzsimmons.higherlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Random random = new Random();
    int target = random.nextInt(20)+1;

    public void start(View view){
        EditText input = (EditText) findViewById(R.id.input);
        int guess = Integer.parseInt(input.getText().toString());
        if(guess < target){
            toast("Higher");
        } else if(guess > target){
            toast("Lower");
        } else if(guess == target){
            toast("Correct! Play again");
            target = random.nextInt(20)+1;
        } else {
            Toast.makeText(this, "Error. Please try again.", Toast.LENGTH_SHORT).show();
        }
    }

    public void toast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
