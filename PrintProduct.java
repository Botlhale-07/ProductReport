/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.printproduct;

/**
 *
 * @author Student
 */
public class PrintProduct {

    public static void main(String[] args) {
        String[] month = {"month 1", "month 2", "month 3"};
        String[] mattresses = {"Cozy Nights Monarch mattress: ", "Restonic Barbados mattress: ", "Sealy Phuket mattress: "};
        int[][] sales = {{25, 15, 18}, {18, 10, 15}, {20, 12, 20}};
        
        for(int i = 0; i < mattresses.length; i++){
            for(int j = 0; j < sales[i].length; j++){
                System.out.println("Enter number of sales for " + month[i] + " for " + mattresses[0] + sales[i][0]);
            }
        }
        System.out.println(" ");
        //System.out.println("Enter number of sales for " + month[1] + " Cozy Nights Monarch mattress " + sales[0][0]);
        for(int i = 0; i < mattresses.length; i++){
            for(int j = 0; j < sales[i].length; j++){
                System.out.println("Enter number of sales for " + month[i] + " for " + mattresses[1] + sales[i][1]);
            }
        }
        
        System.out.println(" ");
        for(int i = 0; i < mattresses.length; i++){
            for(int j = 0; j < sales[i].length; j++){
                System.out.println("Enter number of sales for " + month[i] + " for " + mattresses[2] + sales[i][2]);
            }
        }
        
        System.out.println(" ");
        System.out.println("PRODUCT SALES REPORT - 2026 ");
        System.out.println(" ");
        System.out.println("************************************************");
        int sum = 0;
        double average = 0;
        String topProduct = "";
        // Create the object
        Product process = new Product(sum, average, topProduct);
        
        int total = process.GetTotalProductSold();
        System.out.println("TOTAL PRODUCT SALES: " + total);
        
        double avg = process.GetAverageProductSold();
        System.out.println("AVERAGE PRODUCT SALES: " + avg);
        
        String top = process.GetMostPopularProduct();
        System.out.println("MOST POPULAR PRODUCT: " + top);
    }
}
