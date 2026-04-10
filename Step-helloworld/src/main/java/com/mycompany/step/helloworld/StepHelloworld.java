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
        System.out.println("Enter number of people: ");
        pplCount = sc.nextInt();

        sc.nextLine();//clear buffer

        String[] names= new String[pplCount];
        for(i=0;i<pplCount;i++){
            System.out.println("Enter your name : ");
            names[i] = sc.nextLine();
        }

        if(pplCount>0){
        for(i=0;i<pplCount;i++){
            System.out.print("Hello ");
            System.out.println(names[i]);
        }
    }else{
            System.out.print("Hello World");
    }
        

    }
}
