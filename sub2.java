package com.example.tycse_books;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

public class sub2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub2);
        clickListener();
    }

    private void clickListener() {
        CardView CD1 = findViewById(R.id.cc1);
        CardView CD2 = findViewById(R.id.cc2);
        CardView CD3 = findViewById(R.id.cc3);

        CD1.setOnClickListener(view -> openCd1());
        CD2.setOnClickListener(view -> openCd2());
        CD3.setOnClickListener(view -> openCd3());
    }

    public void openCd1() {
        startActivity(new Intent(this, cc1.class));
    }

    public void openCd2() {
        startActivity(new Intent(this, cc2.class));

    }

    public void openCd3() {
        startActivity(new Intent(this, cc3.class));

    }
}