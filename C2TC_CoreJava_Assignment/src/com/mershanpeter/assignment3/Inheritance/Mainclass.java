package com.mershanpeter.assignment3.Inheritance;

import com.mershanpeter.assignment3.composition.*;

public class Mainclass {
	
	public static void main(String[] args) {
        Book book = new Book(101, "Java Basics", "James Gosling");
        Magazine magazine = new Magazine(201, "Tech Today", 45);
       
        
        
        book.displayInfo();
        magazine.displayInfo();
        
       

       
    }

}