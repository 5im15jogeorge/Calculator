package ch.bbw.jg.modul426.calculator;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 5im15jogeorge
 */
public class CalculatorApp{
    
    public static void main(String[] args) {
        System.out.println("Summand 1: ");
        Scanner scan = new Scanner(System.in);
        int summand1 = scan.nextInt();
        System.out.println("Summand 2: ");
        int summand2 = scan.nextInt();
        Calculator calc = new Calculator();
        System.out.println("Sum: " + calc.addition(summand1, summand2));
    }
    
}
