package com.MyExceptions;

public class IllegalStateExcep {
	public static void  print(int a,int b)
    {
                System.out.println("Addition of Positive Integers :"+(a+b));
    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n1= 7;
int n2=3;

if(n1>=0&& n2>=0) {
	IllegalStateExcep.print(n1, n2);
}
else {
	throw new IllegalStateException("Either one or two numbers are not greater than 0");
}
	}

}
