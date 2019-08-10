package com.practical.factorial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class factorialTest {

    @Test
    public void positiveTest()
    {
    	//MyFactorial fct = new MyFactorial();
    	Assertions.assertEquals(120,  MyFactorial.factorial(5));
        //assertEquals("Result positive",120, MyFactorial.factorial(5));
    }
    
    @Test
    public void negativeTest()
    {
    	//MyFactorial fct = new MyFactorial(); 
    	Assertions.assertEquals(120,  MyFactorial.factorial(5));
        //assertEquals("Result positive",121, MyFactorial.factorial(5));
    }
	
}
