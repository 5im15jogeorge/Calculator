package ch.bbw.jg.modul426.calculator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author 5im15jogeorge
 */
public class TestCalculator {
    
    private Calculator calc;
    
    @Before
    public void setUp() throws Exception {
        calc = new Calculator();
    }
    
    @Test
    public void testSummeZweiPositive() {    
        System.out.println("Summe Zwei Positive");
        Assert.assertTrue(12 == calc.addition(4, 8));
    }
    
    @Test
    public void testSummeZweiNegative() { 
        System.out.println("Summe Zwei Negative");
        Assert.assertTrue(-30 == calc.addition(-23, -7));
    }
    
    @Test
    public void testSummeZweiNull() {        
        System.out.println("Summe Zwei Null");
        Assert.assertTrue(0 == calc.addition(0, 0));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
