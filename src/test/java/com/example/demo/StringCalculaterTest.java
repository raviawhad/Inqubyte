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
		 
		  @Test
		    public void testNestedParentheses() {
		        StringCalculater calculator = new StringCalculater();
		        assertEquals(23, calculator.calculater("(1+(4+5+2)-3)+(6+8)"));
		    }
		  
		  @Test
		    public void testLeadingNegativeSign() {
		        StringCalculater calculator = new StringCalculater();
		        assertEquals(-3, calculator.calculater("-5+2"));
		    }
		  
		  @Test
		    public void testMultipleOperationsAndParentheses() {
		        StringCalculater calculator = new StringCalculater();
		        assertEquals(9, calculator.calculater("((2+3)-(4-1)+7)"));
		    }
		  
		  @Test
		    public void testComplexExpression() {
		        StringCalculater calculator = new StringCalculater();
		        assertEquals(3, calculator.calculater("3+(6-(8+2))+4"));
		    }
		  
		  @Test
		    public void testExpressionWithZero() {
		        StringCalculater calculator = new StringCalculater();
		        assertEquals(-1, calculator.calculater("0+1-2"));
		    }
}
