// TextLab08st.java
// This is the student, starting file for the TextLab08 assignment.


import java.util.Scanner;


public class TextLab08st
{
	public static void main(String args[])
	{
		System.out.println("TextLab08\n\n");
		FullName fn = new FullName();
		System.out.println("\nFirst Name First: " + fn.firstNameFirst());
		System.out.println("\nLast  Name First: " + fn.lastNameFirst());
		System.out.println();
	}
}

class FullName
{
	String name;

	public FullName()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your full name, first name first.  -->  ");
		name = input.nextLine();
	}

	public String firstNameFirst()
	{
		return name;
	}

	public String lastNameFirst()
	{
		String n = name;
		int index = n.lastIndexOf(" ");
		String lastName = n.substring(index);
		String firstName = n.substring(0, index);
		return lastName + ", " + firstName;






	}
}
