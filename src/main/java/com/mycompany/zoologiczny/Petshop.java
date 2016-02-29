/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.zoologiczny;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kornelia
 */
public class Petshop {
    private List<Pet> petlist = new ArrayList<>();
    
    /**
     *
     */
    public Petshop() {
        petlist.add(new Pet(Spacies.MARLIN, 250, 200));
        petlist.add(new Pet(Spacies.UNICORN, 60, 200));
        petlist.add(new Pet(Spacies.MARLIN, 250, 150));
        petlist.add(new Pet(Spacies.RABBIT, 5, 15));
        petlist.add(new Pet(Spacies.RABBIT, 5, 50));    
    }
    
    
}
