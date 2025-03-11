package com;

public class Main {
	  public static void main(String[] args) {
	        Service service = new Service();
	        System.out.println("Testing valid email: " + service.validateEmail("user@example.com"));
	        System.out.println("Testing invalid email: " + service.validateEmail("userexample.com"));
	    }

}
