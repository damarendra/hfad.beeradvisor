package com.hfad.beeradvisor;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    public static List<String> getBrands(String mSelectedBeerColor) {
        List<String> brands = new ArrayList<>();
        if(mSelectedBeerColor.equals("amber")) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
        } else {
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }
        return brands;
    }
}
