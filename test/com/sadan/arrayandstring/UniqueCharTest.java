package com.sadan.arrayandstring;

import static org.junit.Assert.*;

import org.junit.Test;

public class UniqueCharTest {

	@Test
	public void testIsUnique() {
		String tockens = "abc def ghi)";
		boolean unique = UniqueChar.isUnique(tockens);
		assertEquals(true, unique);
	}
	
	@Test
	public void testIsUnique_withNotUniqueValue() {
		String tockens = "abc def ghi value)";
		boolean unique = UniqueChar.isUnique(tockens);
		assertEquals(false, unique);
	}
	
	@Test
	public void testIsUnique_withUnicodeValue() {
		String tockens = "abc def ghi \\u01A9)";
		boolean unique = UniqueChar.isUnique(tockens);
		assertEquals(true, unique);
	}
	
	@Test
	public void testIsUnique_withNotUniqueUnicodeValue() {
		String tockens = "abc def ghi \\u00A9)";
		boolean unique = UniqueChar.isUnique(tockens);
		assertEquals(false, unique);
	} 
	
	@Test
	public void testIsUnique_NULL() {
		String tockens = null;
		assertEquals(false, UniqueChar.isUnique(tockens));
	}
	
	@Test
	public void testIsUnique_whitespace() {
		String tockens = "abc def ghi";
		boolean unique = UniqueChar.isUnique(tockens);
		assertEquals(true, unique);
	}
	
	@Test
	public void testIsUnique_empty() {
		String tockens = "";
		boolean unique = UniqueChar.isUnique(tockens);
		assertEquals(false, unique);
	}

}
