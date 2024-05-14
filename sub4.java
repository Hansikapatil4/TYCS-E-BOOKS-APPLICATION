package com.example.tycse_books;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

public class sub4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub4);
        clickListener();
    }

    private void clickListener() {
        CardView CD1 = findViewById(R.id.eh1);


        CD1.setOnClickListener(view -> openCd1());

    }

    public void openCd1() {
        startActivity(new Intent(this, eh1.class));
    }


}