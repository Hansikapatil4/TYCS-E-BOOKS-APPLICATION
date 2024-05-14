package com.example.tycse_books;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

public class sub5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub5);
        clickListener();
    }

    private void clickListener() {
        CardView CD1 = findViewById(R.id.crm1);
        CardView CD2 = findViewById(R.id.crm2);
        CardView CD3 = findViewById(R.id.crm3);

        CD1.setOnClickListener(view -> openCd1());
        CD2.setOnClickListener(view -> openCd2());
        CD3.setOnClickListener(view -> openCd3());
    }

    public void openCd1() {
        startActivity(new Intent(this, crm1.class));
    }

    public void openCd2() {
        startActivity(new Intent(this, crm2.class));

    }

    public void openCd3() {
        startActivity(new Intent(this, crm3.class));

    }
}