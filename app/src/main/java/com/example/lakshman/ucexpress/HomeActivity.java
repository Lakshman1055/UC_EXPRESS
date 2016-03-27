package com.example.lakshman.ucexpress;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

    public void restaurantDetails(View view){
        Intent intent = new Intent(this,RestaurantDetailsActivity.class);
        startActivity(intent);
    }
    public void events(View view){
        Intent intent = new Intent(this,EventsActivity.class);
        startActivity(intent);
    }
    public void utility(View view){
        Intent intent = new Intent(this,UtilityActivity.class);
        startActivity(intent);
    }
    public void otherFacilities(View view){
        Intent intent = new Intent(this,OtherFacilitiesActivity.class);
        startActivity(intent);
    }
}
