/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.step.helloworld;

import java.util.*;

/**
 *
 * @author cyberbee
 */
public class StepHelloworld {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int pplCount=0,i=0;
        boolean firstW = true;
        System.out.println("Enter number of people: ");
        pplCount = sc.nextInt();

        sc.nextLine();//clear buffer

        StringBuilder names = new StringBuilder();

        for(i=0;i<pplCount;i++){
            System.out.println("Enter your names : ");
            if(firstW == true){
            names.append(sc.nextLine());
            firstW = false;
            }else{
            names.append(", ").append(sc.nextLine());
            }

        }

        if(pplCount>0){
            System.out.print("Hello ");
            System.out.println(names);
        }else{
            System.out.print("Hello World");
    }
        

    }
}
