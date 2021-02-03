package com.hfad.beeradvisor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onFindBeerClicked(View view) {
        Spinner mBeerColors = findViewById(R.id.beer_colors);
        TextView mBeerBrand = findViewById(R.id.beer_brand);

        String mSelectedBeerColor = String.valueOf(mBeerColors.getSelectedItem());
        List<String> brandsList = BeerExpert.getBrands(mSelectedBeerColor);
        StringBuilder brandsFormatted = new StringBuilder();
        for(String brand: brandsList) {
            brandsFormatted.append(brand).append('\n');
        }

        mBeerBrand.setText(brandsFormatted);
    }
}