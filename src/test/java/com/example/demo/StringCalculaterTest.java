package com.example.demo;

import com.example.demo.StringCalculater;
import org.junit.Test;
import static org.junit.Assert.assertEquals;



public class StringCalculaterTest {
		 @Test
		    public void testSimpleAdditionAndSubtraction() {
		        StringCalculater calculator = new StringCalculater();
		        Assert.assertEquals(6, calculator.calculater("3+5-2"));
		    }
	    
}
