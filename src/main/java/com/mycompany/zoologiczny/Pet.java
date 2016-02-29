/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.zoologiczny;

import java.util.Objects;

/**
 *
 * @author kornelia
 */
public class Pet {
    private Spacies type;
    private int weight;
    private int cost;

    public Spacies getType() {
        return type;
    }

    public void setType(Spacies type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Pet() {
    }

    @Override
    public String toString() {
        return "Pet{" + "type=" + type + ", weight=" + weight + ", cost=" + cost + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.type);
        hash = 67 * hash + this.weight;
        hash = 67 * hash + this.cost;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pet other = (Pet) obj;
        if (this.weight != other.weight) {
            return false;
        }
        if (this.cost != other.cost) {
            return false;
        }
        if (this.type != other.type) {
            return false;
        }
        return true;
    }

    public Pet(Spacies type, int weight, int cost) {
        this.type = type;
        this.weight = weight;
        this.cost = cost;
    }
   
    
}
