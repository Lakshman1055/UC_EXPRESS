package com.example.lakshman.ucexpress;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ListOfRestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_restaurants);
    }

    public void subway(View view){
        Intent intent = new Intent(this, SubwayActivity.class);
        startActivity(intent);
    }
    public void chickfila(View view){
        Intent intent = new Intent(this, ChickfilaActivity.class);
        startActivity(intent);
    }
    public void sushic(View view){
        Intent intent = new Intent(this, SushicActivity.class);
        startActivity(intent);
    }
    public void moes(View view){
        Intent intent = new Intent(this, MoesActivity.class);
        startActivity(intent);
    }
    public void pandaExpress(View view){
        Intent intent = new Intent(this, PandaExpressActivity.class);
        startActivity(intent);
    }
}
