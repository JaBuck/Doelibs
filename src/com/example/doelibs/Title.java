package com.example.doelibs;

public class Title {
	public String name;
	public String author;
	public String isbn;
	
	public Title(){
		super();
	}
	
	public Title(String name, String author, String isbn){
		super();
		this.name = name;
		this.author = author;
		this.isbn = isbn;
	}
	
	@Override
	public String toString(){
		return this.name;
	}

}
