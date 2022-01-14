package com.javaAss;
class Methods{
public static void add()
{
	System.out.println("Addition method");
}
public static int Add1(int a,int b)
{
	return a+b;
}
void met() {
	this.func();
//	func();//this.func();
	System.out.println("Inside met...");//2
}

void func() {
	System.out.println("Inside func...");//1
}

public static void main(String[]args)
{
	add();
	Add1(2,3);
	System.out.println(Add1(2,3));
	Methods ref = new Methods();
	
	ref.met();
	

	
	System.out.println("Back inside main..");//3

	
}
}