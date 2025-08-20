package com.mershanpeter.assignment3.composition;

import com.mershanpeter.assignment3.composition.*;

public class Mainclass {
	
	public static void main(String[] args) {
        Book book = new Book(101, "Java Basics", "James Gosling");
        Magazine magazine = new Magazine(201, "Tech Today", 45);
        Library lib = new Library();
       
        
        lib.addBaseclass(book);
        lib.addMagazine(magazine);

        lib.showAllItems();
    }

}