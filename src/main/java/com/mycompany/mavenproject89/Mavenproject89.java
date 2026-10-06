/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject89;

/**
 *
 * @author NDUVHO
 */import java.util.Scanner;
public class Mavenproject89 {

    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        String a;
        System.out.println("ENTER YOUR USERNAME");
        a=input.nextLine();
        double b;
        System.out.println("ENTER YOur password ");
        b=input.nextDouble();
        
        
        if(a.equals ("kyosk") && b==32){
            System.out.println("welcome back " + a);
        }
        else{
            System.out.println("invalid details");
        }
        

        
    }
}
