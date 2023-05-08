package com.collections;

import java.util.List;
import java.util.LinkedList;

class Company{
	
	int id;
	String name, type,CEO;
	
	public Company(int id, String name, String type, String CEO) {
		this.id=id;
		this.name=name;
		this.type=type;
		this.CEO=CEO;
	}
	
}
public class linkedlistex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Company> a=new LinkedList<Company>();

		a.add(new Company(1,"CGI","service based","Geroge Schindler"));  //list
		a.add(new Company(2,"Google","service based","Sundar pichai"));
		a.add(new Company(3,"TCS","service","rajesh gopinathan"));
		a.add(new Company(4,"amazon","cloud computing","andy jassy"));
		a.add(new Company(5,"infosys","MIT","salil parekh"));
for(Company c:a)
{
	System.out.println(c.id+","+c.name+","+c.type+","+c.CEO);
}
	}

}
