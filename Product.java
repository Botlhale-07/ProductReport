/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.printproduct;

/**
 *
 * @author Student
 */
public class Product implements IProducts{
    // Elements that will be used
    private int sum;
    private double average;
    private String topProduct;
    
    // Constructor
    public Product(int sum, double average, String topProduct){
        this.sum = sum;
        this.average = average;
        this. topProduct = topProduct;
    }
    
    @Override
    public int GetTotalProductSold(){
        int sum = 0;
        return sum;
    }
    
    public void setTotalProductSold(int[] productSales){
        int sum = 0;
        for(int i = 0; i < productSales.length; i++){
        sum += productSales[i];
        }
    }
    
    @Override
    public  double GetAverageProductSold(){
        int total = GetTotalProductSold();
        return (double) total / average;
    }
    
    public void setAverageProductSold(){
        this.average = average;
    }
    
    @Override
    public String GetMostPopularProduct(){
        return topProduct;
    }
    
    public void setMostPopularProduct(String[] mattress, int[] totalSales){
        int maxSale = totalSales[0];
        int topProduct = 0;
        
        //Loops and finds the maxSale and compares all elements
        for(int i = 0; i < totalSales.length; i++){
            if(totalSales[i] > maxSale){
                maxSale = totalSales[i];
                topProduct = i;
            }
        }
    }
}
