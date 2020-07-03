package com.example.beeradvisor;
import java.util.*;

class BeerExpert {
    List<String> getBrands(String color)
    {
        List<String> brands=new ArrayList<>();
        if(color.equals("amber"))
        {
            brands.add("jack Amber");
            brands.add("Red Mose");
        }
        else {
            brands.add("Gout stout");
        }
        return brands;

    }

}
