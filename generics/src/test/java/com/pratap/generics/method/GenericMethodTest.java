package com.pratap.generics.method;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GenericMethodTest {
	
	private GenericMethod genericMethod;
	
	@BeforeEach
	void setUp() {
		genericMethod = new GenericMethod();
	}

	@Test
	void testShowItem() {
		assertEquals(genericMethod.showItem("Hello"), "Hello");
	}

	@Test
	void testAddStore(){
		List<Bucket<String>> list = genericMethod.addStore("Test", new ArrayList<Bucket<String>>());
		assertEquals(list.size(), 1);
	}
}
