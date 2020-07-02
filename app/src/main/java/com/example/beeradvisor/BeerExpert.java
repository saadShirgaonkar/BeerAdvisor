package com.example.beeradvisor;
import java.util.*;

public class BeerExpert {
    List<String> getBrands(String color)
    {
        List<String> brands=new ArrayList<>();
        if(color.equals("amber"))
        {
            brands.add("jack Amber");
        }
        else {
            brands.add("Gout stout");
        }
        return brands;

    }

}
