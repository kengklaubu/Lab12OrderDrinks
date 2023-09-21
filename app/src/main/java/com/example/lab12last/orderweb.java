package com.example.lab12last;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class orderweb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.orderweb);

        CardView waterCard = findViewById(R.id.waterCard);

        waterCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(orderweb.this, water.class);
                startActivity(intent);
            }
        });

        CardView bubbleCard = findViewById(R.id.bubbleCard);

        bubbleCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(orderweb.this, bubble.class);
                startActivity(intent);
            }
        });

        CardView energyCard = findViewById(R.id.energyCard);

        energyCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(orderweb.this, energy.class);
                startActivity(intent);
            }
        });

        CardView fruitCard = findViewById(R.id.fruitCard);

        fruitCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(orderweb.this, fruit.class);
                startActivity(intent);
            }
        });

        CardView sodaCard = findViewById(R.id.sodaCard);

        sodaCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(orderweb.this, soda.class);
                startActivity(intent);
            }
        });

        CardView coffeCard = findViewById(R.id.coffeCard);

        coffeCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(orderweb.this, coffee.class);
                startActivity(intent);
            }
        });
    }
}
