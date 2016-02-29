/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.zoologiczny;


/**
 *
 * @author Jakub
 */
public class Request {
    public static enum OrderBy{
        NONE,
        SPECIES,
        WEIGHT,
        PRIZE
    }
    private Spacies spacies = null;
    private Integer minPrize = null;
    private Integer maxPrize = null;
    private Integer minWeight = null;
    private Integer maxWeight = null;
    
}
