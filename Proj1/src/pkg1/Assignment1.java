package pkg1;

public class Assignment1 
{
int age;  // variable, data type= integer, variable name is age, 
int roll_no;   // variable, data type= integer, variable name is roll_no, 
public void display1()   // 1st method
{
	System.out.println("Welcome to all of you");
}
public void display2()
{
	System.out.println("Automation is easy");   // 2nd method
}

public static void main(String[] args) 
{
	Assignment1 dheeraj=new Assignment1();  //object creation, here new is reference variable for class student
	dheeraj.display1(); // calling method
	dheeraj.display2();
	dheeraj.age=30;    // calling variable
	System.out.println(dheeraj.age);
	dheeraj.roll_no=11;
	System.out.println(dheeraj.roll_no);
}

}
