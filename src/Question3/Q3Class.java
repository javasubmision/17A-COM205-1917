/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Rasheedarh
 */
public class Q3Class {
    static String PurchasePrice, DownPayment, Years;

    public static String getYears() {
        return Years;
    }

    public static void setYears(String Years) {
        Q3Class.Years = Years;
    }

    public static String getPurchasePrice() {
        return PurchasePrice;
    }

    public static void setPurchasePrice(String PurchasePrice) {
        Q3Class.PurchasePrice = PurchasePrice;
    }

    public static String getDownPayment() {
        return DownPayment;
    }

    public static void setDownPayment(String DownPayment) {
        Q3Class.DownPayment = DownPayment;
    }
    public static void writeFile() throws IOException
    { 
       try(BufferedWriter stud= new BufferedWriter(new FileWriter("Java Mortage.txt",true))){ 
      stud.write(getPurchasePrice()+" "+getDownPayment());
       stud.newLine();
       }
    }
}

