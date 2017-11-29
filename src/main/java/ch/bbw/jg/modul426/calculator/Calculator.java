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
public class Calculator {
    
    private int result;

    public Calculator() {
        result = 0;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
    
    public int addition(int summand1, int summand2){
        result = summand1 + summand2;
        return result;
    }  
        
}
