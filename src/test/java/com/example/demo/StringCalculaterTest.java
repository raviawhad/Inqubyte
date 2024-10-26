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
		 @Test
		    public void testMultipleDigitNumbers() {
		        StringCalculater calculator = new StringCalculater();
		        assertEquals(25, calculator.calculater("10+20-5"));
		    }
		 
		 @Test
		    public void testExpressionWithParentheses() {
		        StringCalculater calculator = new StringCalculater();
		        assertEquals(6, calculator.calculater("(3+5)-2"));
		    }
}
