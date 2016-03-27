package com.example.lakshman.ucexpress;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RestaurantDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_details);
    }

    public void foodCourt(View view){
        Intent intent = new Intent(this,ListOfRestaurantsActivity.class);
        startActivity(intent);
    }

    public void connectionCafe(View view){
        Intent intent = new Intent(this, CCMenuActivity.class);
        startActivity(intent);
    }
}
