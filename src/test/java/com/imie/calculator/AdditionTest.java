package com.imie.calculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class AdditionTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddition() {
		Addition add = new Addition(1);
		
		Assert.assertNotNull(add);
		Assert.assertEquals(1, add.value);
	}

	@Test
	public void testMake() {
		Addition add = new Addition(1);
		add.make(2);
		
		Assert.assertNotNull(add);
		Assert.assertEquals(3, add.value);
	}

	@Test
	public void testGetValue() {
		Addition add = new Addition(1);
		add.make(2);
		
		Assert.assertNotNull(add);
		Assert.assertEquals(3, add.getValue());
	}

}
