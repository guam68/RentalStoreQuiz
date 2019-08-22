package com.skilldistillery.entities;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RentalStoreTests {
	private Store store;

	@BeforeEach
	void setUp() throws Exception {
		store = new Store();
	}

	@AfterEach
	void tearDown() throws Exception {
		store = null;
	}

	@Test
	@DisplayName("test you can not register a duplicate customer")
	void testCustomers() {
		Customer c1 = new Customer(1, "First", "Last");
		Customer c2 = new Customer(1, "First2", "Last2");
		
		store.addCustomer(c1);
		store.addCustomer(c2);
		assertEquals(1, store.getNumCustomer());
	}

}
