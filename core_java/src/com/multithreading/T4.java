package com.multithreading;

import java.io.*;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

// A class 'Movie' that implements Comparable
class Movies implements Comparable<Movies>
{
	private double rating;
	private String name;
	private int year;

	// Used to sort movies by year
	public int compareTo(Movies m)
	{
		return this.year - m.year;
	}

	// Constructor
	public Movies(String nm, double rt, int yr)
	{
		this.name = nm;
		this.rating = rt;
		this.year = yr;
	}

	// Getter methods for accessing private data
	public double getRating() { return rating; }
	public String getName() { return name; }
	public int getYear()	 { return year; }
}

// Class to compare Movies by ratings
class RatingCompare implements Comparator<Movie>
{
	public int compare(Movie m1, Movie m2)
	{
		if (m1.getRating() < m2.getRating()) return -1;
		if (m1.getRating() > m2.getRating()) return 1;
		else return 0;
	}
}

// Class to compare Movies by name
class NameCompare implements Comparator<Movies>
{
	public int compare(Movies m1, Movies m2)
	{
		return m1.getName().compareTo(m2.getName());
	}
}


public class T4 {
	//A Java program to demonstrate Comparator interface
			public static void main(String[] args)
		{
			ArrayList<Movie> list = new ArrayList<Movie>();
			list.add(new Movie("Force Awakens", 8.3, 2015));
			list.add(new Movie("Star Wars", 8.7, 1977));
			list.add(new Movie("Empire Strikes Back", 8.8, 1980));
			list.add(new Movie("Return of the Jedi", 8.4, 1983));

			// Sort by rating : (1) Create an object of ratingCompare
			//				 (2) Call Collections.sort
			//				 (3) Print Sorted list
			System.out.println("Sorted by rating");
			//RatingCompare ratingCompare = new RatingCompare();
			Collections.sort(list);
			for (Movie movie: list)
				System.out.println(movie.getRating() + " " +
								movie.getName() + " " +
								movie.getYear());

		}
	}

