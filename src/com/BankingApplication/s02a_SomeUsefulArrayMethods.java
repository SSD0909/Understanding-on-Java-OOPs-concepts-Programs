package com.BankingApplication;

import java.util.Scanner;

// a menu driven program to test a selection of useful array methods 

public class s02a_SomeUsefulArrayMethods
{
	public static void main (String[] args)
	{
		// 1 Array methods: s01a_ask_user_to_determine_size_of_array
		char choice;
		Scanner keyboard = new Scanner(System.in);

		// 2 declare an integer array
		int[] someArray;

		// 3 Enter a value for the size ....size the array
		System.out.print("How many elements would you like to store  in your array?: ");
		int size = keyboard.nextInt();
		someArray = new int [size];

		//4 the menu....... next

		System.out.println("Goodbye");
	}

	//5 ........next.........M1 method to fills someArray with values
	//check for tips s01Temperature
	static void fillArray(int[] arrayIn)
	{
		Scanner keyboard = new Scanner (System.in);
		for (int i = 0; i < arrayIn.length; i++)
		{
			System.out.print("enter value ");
			arrayIn[i] = keyboard.nextInt();
		}
	}
}

