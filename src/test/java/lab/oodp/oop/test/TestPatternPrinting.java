package lab.oodp.oop.test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import lab.oodp.control.PatternPrinting;
import static org.junit.Assert.assertEquals;


public class TestPatternPrinting {
    private PatternPrinting cr;

	    @Before
	    public void setup() {
	        cr = new PatternPrinting();
	    }

	    private ByteArrayOutputStream outContent;

	    @Before
	    public void setUpStreams() {
	        outContent = new ByteArrayOutputStream();
	        System.setOut(new PrintStream(outContent));
	    }

	    @After
	    public void cleanUpStreams() {
	        System.setOut(null);
	    }

        @Test
	    public void testPrintRowOfAmpersandsOneFor() {
	        cr.printRowOfStarsWithFor(1);
	        assertEquals("*", outContent.toString().trim());
	    }

	    @Test
	    public void testPrintRowOfAmpersandsFiveFor() {
	        cr.printRowOfStarsWithFor(6);
	        assertEquals("*****", outContent.toString().trim());
	    }

	    @Test
	    public void testPrintRowOfAmpersandsTenFor() {
	        cr.printRowOfStarsWithWhile(1);
	        assertEquals("*", outContent.toString().trim());
	    }
	    
	    @Test
	    public void testPrintRowOfAmpersandsTenWhile() {
	        cr.printRowOfStarsWithWhile(10);
	        assertEquals("*****", outContent.toString().trim());
	    }

	    @Test
	    public void testPrintRowOfAmpersandsFiveWhile() {
	        cr.printRowOfStarsWithWhile(5);
	        assertEquals("*****", outContent.toString().trim());
	    }

	   


}
