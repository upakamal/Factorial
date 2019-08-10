package com.practical.factorial;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class MyFactorial 
{
    public static void main( String[] args )
    {
        System.out.println( "This is a factorial program" );
        System.out.println( "Enter any number greater than 1:" );
        try {
        	BufferedReader reader =  
                    new BufferedReader(new InputStreamReader(System.in)); 
          
         // Reading data using readLine 
         int x = Integer.parseInt(reader.readLine());

         System.out.println(String.valueOf(factorial(x)));
        	//int x = Integer.parseInt(System.console().readLine());
        }
        catch(Exception ex) {
        	System.out.println("Not a valid number.");
        }
    }
    
    public static int factorial( int x) {
    	if(x==1) {
    		return x;
    	}
    	return x * factorial(x-1);
    }
    
}
