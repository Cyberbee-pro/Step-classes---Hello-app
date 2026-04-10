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
        String name = new String();
        System.out.println("Enter your name : ");
        name = sc.nextLine();
        System.out.print("Hello ");
        System.out.print(name);
    }
}
