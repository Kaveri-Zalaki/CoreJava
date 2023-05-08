 package com.collections;

import java.util.ArrayList;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Iterator;
import java.util.LinkedHashMap;

class School{
	
	String name;
	String medium;
	
	public School( String name, String medium) {
	
		this.name=name;
		this.medium=medium;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMedium() {
		return medium;
	}
	public void setMedium(String medium) {
		this.medium = medium;
	}
	
}
public class Arraylist {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		List<School> a=new ArrayList<School>();

a.add(new School("BIET","English"  ));  //list
a.add(new School("RNSIT","English"));
a.add(new School("VHD","Kannada"));
a.add(new School("KNK","Both"));
a.add(new School( "PRH","English"));


Map<String, String> mp = a.stream().collect(Collectors.toMap(School::getName, School::getMedium,(k, v)->k+" : "+v, LinkedHashMap::new));

mp.forEach((k,v) ->System.out.println(k+"  "+v));

	}}


