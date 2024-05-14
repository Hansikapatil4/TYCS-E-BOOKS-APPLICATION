package com.example.tycse_books;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clickListener();

    }

    public void clickListener() {
        CardView CD1 = findViewById(R.id.sub1);
        CardView CD2 = findViewById(R.id.sub2);
        CardView CD3 = findViewById(R.id.sub3);
        CardView CD4 = findViewById(R.id.sub4);
        CardView CD5 = findViewById(R.id.sub5);
        
     
        CD1.setOnClickListener(view -> openCd1());
        CD2.setOnClickListener(view -> openCd2());
        CD3.setOnClickListener(view -> openCd3());
        CD4.setOnClickListener(view -> openCd4());
        CD5.setOnClickListener(view -> openCd5());
    }

    private void openCd5() {
        startActivity(new Intent(this, sub5.class));
    }

    private void openCd4() {
        startActivity(new Intent(this, sub4.class));
    }

    private void openCd3() {
        startActivity(new Intent(this, sub3.class));
    }

    private void openCd2() {
        startActivity(new Intent(this, sub2.class));
    }

    private void openCd1() {
        startActivity(new Intent(this, sub1.class));
    }
}