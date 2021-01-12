package com.pratap.generics.boundedtype;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BoundedTypeTest {

	@Test
	void testCalculateMinWithInteger() {
		BoundedType boundedType = new BoundedType();
		
		assertEquals(boundedType.calculateMin(10, 20), 10);
	}
	
	@Test
	void testCalculateMinWithString() {
		BoundedType boundedType = new BoundedType();
		
		assertEquals(boundedType.calculateMin("Ram", "Ajay"), "Ajay");
	}
	
	@Test
	void testCalculateMinWithLong() {
		BoundedType boundedType = new BoundedType();
		
		assertEquals(boundedType.calculateMin(10L, 20L), 10L);
	}

	@Test
	void testCalculateMinWithDecimal() {
		BoundedType boundedType = new BoundedType();
		
		assertEquals(boundedType.calculateMin(10.08, 10.10), 10.08);
	}
}
