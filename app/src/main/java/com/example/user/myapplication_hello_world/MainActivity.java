package com.example.user.myapplication_hello_world;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView textLonch1;
    Button button;
    private boolean p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textLonch1 =(TextView) findViewById(R.id.textLonch1);
        textLonch1.setTextColor(Color.RED);
        textLonch1.setText("Это первый текст в Android Studio");
        button = findViewById(R.id.button);
    }


    public void optionClick (View view) {
        if (p = !p){
            textLonch1.setText("Первое нажатие");
            button.setText("Вы нажали эту кнопку");
            button.setBackgroundColor(Color.RED);
        } else {

            textLonch1.setText("Второе нажатие");
            button.setText("Вы нажали второй раз на эту кнопку");
            button.setBackgroundColor(Color.YELLOW);
        }



    }

}
