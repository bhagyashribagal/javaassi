package com.javaAss;

 class Constructor {

	public static void main(String[] args) {
	Constructor obj = new Constructor();
	System.out.println(obj);
	Constructor obj1 = new Constructor(4,5);

	}
	//No argument constructor
	Constructor()
	{
		System.out.println("constructor()");
	}
	//Parametrised Constructor
	Constructor(int a,int b)
	{
		System.out.println(a);
		System.out.println(b);
	}

}
