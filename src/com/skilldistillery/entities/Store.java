package com.skilldistillery.entities;

import java.util.HashSet;
import java.util.Set;

public class Store {
	private Set<Customer> customers = new HashSet<Customer>();
	private int id;
	
	public boolean addCustomer(Customer customer){
		for (Customer c : customers) {
			if (customer.getId() == c.getId()) {
				System.out.println("Customer is already registered");
				return false;
			}
		}
		return customers.add(customer);
	}
	
	public int getNumCustomer() {
		return customers.size();
	}
	
	public void displayData() {
		System.out.println("Store ID: " + id);
		System.out.println("Number of Customers: " + getNumCustomer());
		for (Customer customer : customers) {
			System.out.println(customer);
		}
	}

}
