import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuVerifierTest {

//implement tests to test Sudokuverifier with boundary values.  Use templates from Task 1 to derive and document test cases.
	
// A correct Sudoku string: 417369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string: 123456789912345678891234567789123456678912345567891234456789123345678912234567891
String c = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
String i = "123456789912345678891234567789123456678912345567891234456789123345678912234567891";
String s = "a17369825632158947958724316825437169791586432346912758289643571573291684164875293";
String d = "9417369825632158947958724316825437169791586432346912758289643571573291684164875293";
String f = "17369825632158947958724316825437169791586432346912758289643571573291684164875293";
String g = "41736982563215894795872431682543716979158643234691275828964357157329168416487529!";
String h = "017369825632158947958724316825437169791586432346912758289643571573291684164875293";
SudokuVerifier v = new SudokuVerifier();

	@Test
	public void testCorrectString() {
		int a = v.verify(c);
		assertEquals("correct string", a, 0);
	}

	@Test
	public void testIncorrectString() {
		int a = v.verify(i);
		assertEquals("incorrect string", a, -2);
		
	}
	
	@Test
	public void testStringWithLetter () {
		int a = v.verify(s);
		assertEquals("incorrect string", a, 1);
	}

	@Test
	public void testStringTooLong () {
		int a = v.verify(d);
		assertEquals("incorrect string", a, -1);
	}

	@Test
	public void testStringTooShort () {
		int a = v.verify(f);
		assertEquals("incorrect string", a, -1);
	}

	@Test
	public void testHasSpecialCharacter () {
		int a = v.verify(g);
		assertEquals("incorrect string", a, 1);
	}

	@Test
	public void testEmptyString () {
		int a = v.verify("");
		assertEquals("incorrect string", a, -1);
	}

	@Test 
	public void testStringHasZero () {
		int a = v.verify(h);
		assertEquals("incorrect string", a, -1);
	}
}
