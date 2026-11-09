package com.designpatern;

import com.FabriqueProduit;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        FabriqueProduit fabriqueProduit=new FabriqueProduit();
        Produit produit=null;

        produit=fabriqueProduit.createProduit(FabriqueProduit.typeA);
        produit.methodeproduit();

        produit=fabriqueProduit.createProduit(FabriqueProduit.typeB);
        produit.methodeproduit();

        produit=fabriqueProduit.createProduit(FabriqueProduit.typeC);
        produit.methodeproduit();

        String d="D";
        produit=fabriqueProduit.createProduit(d);
        produit.methodeproduit();




    }

}