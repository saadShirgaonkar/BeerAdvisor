package com.example.beeradvisor;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;
public class MainActivity extends Activity{
    private BeerExpert expert=new BeerExpert();
    @Override

    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickFindBeer(View view)
    {
        TextView brands= findViewById(R.id.brands);
        Spinner color= findViewById(R.id.color);
        String beerType=String.valueOf(color.getSelectedItem());
        List<String> brandList=expert.getBrands(beerType);
        StringBuilder brandsFormatted=new StringBuilder();
        for(String brand:brandList)
        {
           brandsFormatted.append(brand).append("\n");
        }

        brands.setText(brandsFormatted);
    }

}
