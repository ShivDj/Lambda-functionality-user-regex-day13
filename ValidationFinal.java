package LambdaFunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ValidationFinal {

	Scanner sc= new Scanner(System.in);
	static boolean exit=false;
	
	void userFirstNameCheckLamda()
	{
		 String regex="[A-Z]{1}[a-z]{2,20}$";
	 	 ArrayList <String> First_Name=new ArrayList<String>();
		System.out.println("enter number of input you wanna to give");
		int n1=sc.nextInt();
		for(int i=0; i<n1 ; i++) {
			First_Name.add(sc.next());
		}
		System.out.println("your list of first name "+First_Name.toString());
		Pattern pt = Pattern.compile(regex);
	    List<String> a1= First_Name. stream(). filter(p -> pt. matcher(p). find()). collect(Collectors.<String>toList());
		System.out.println("your correct inputs are"+a1);
		
	}
	
	
	
	void userLastNameCheckLamda()
	{
		 String regex="[A-Z]{1}[a-z]{2,10}$";
	 	 ArrayList <String> Last_Name=new ArrayList<String>();

		 System.out.println("enter number of input you wanna to give");
		 int n1=sc.nextInt();
		 for(int i=0; i<n1 ; i++) {
			Last_Name.add(sc.next());
		}
		System.out.println("your contains are "+Last_Name.toString());
		Pattern pt = Pattern.compile(regex);
		
	    List<String> a1= Last_Name. stream(). filter(p -> pt. matcher(p). find()). collect(Collectors.<String>toList());
		System.out.println("correct name format are "+a1);
		
	}
	
	
	
	
	void userPhoneNumberCheckLamda()
	{
		String regex="^([+][9][1]|[9][1]|[0]){0,1}([7-9]{1})([0-9]{9})$";
	 	 ArrayList <String> phone_no=new ArrayList<String>();
		 System.out.println("enter number of input you wanna to give");
		 int n1=sc.nextInt();
		 for(int i=0; i<n1 ; i++) {
			phone_no.add(sc.next());
		}
		System.out.println("added contact number are "+phone_no.toString());
		Pattern pt = Pattern.compile(regex);
		List<String> a1= phone_no. stream(). filter(p -> pt. matcher(p). find()). collect(Collectors.<String>toList());
		System.out.println(a1);
		
	}
	
	
	
	
	void userPasswordCheckLamda()
	{
		 String regex="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#&$])(?=\\S+$).{4,10}$";
	 	 ArrayList <String> password=new ArrayList<String>();
		 System.out.println("enter number of input you wanna to give");
		 int n1=sc.nextInt();
		 for(int i=0; i<n1 ; i++) {
			password.add(sc.next());
		}
		System.out.println("your passwords are "+password.toString());
		Pattern pt = Pattern.compile(regex);
		List<String> a1= password. stream(). filter(p -> pt. matcher(p). find()). collect(Collectors.<String>toList());
		System.out.println(a1);
		
	}
	
	void userEmailCheckLamda()
	{
		 String regex="[a-zA-Z0-9_.]+@[a-zA-Z]+.[a-zA-Z]+$";
		ArrayList <String> mail=new ArrayList<String>();
		//String mail1=sc.next();
		System.out.println("enter number of input you wanna to give");
		int n1=sc.nextInt();
		for(int i=0; i<n1 ; i++) {
			mail.add(sc.next());
		}
		System.out.println("your mails are "+mail.toString());
		Pattern pt = Pattern.compile(regex);
		List<String> a1= mail. stream(). filter(p -> pt. matcher(p). find()). collect(Collectors.<String>toList());
		System.out.println("your correct mails are " +a1);
		
	}
	
	
	 static void end()
     {
		
  	System.out.println("thank you");
			exit=true;
     }
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			while(!exit)
			{
			Scanner s=new Scanner(System.in);
	         System.out.println("enter your choice to fill and check the details for registrartion");
	         System.out.println("1. Enter your first name to check through lamda=");
	         System.out.println("2. Enter your last name to check through lamda=");
	         System.out.println("3. Enter for Contact Number through lamda=");
	         System.out.println("4. Enter for Email Address through lamda=");
	         System.out.println("5. Enter for Password through lamda=");
	         System.out.println();
	         
	         System.out.println("6. Finish And Exit ");
	         int choice=s.nextInt();
	         
	         switch(choice)
	         
	         {
	         	        	 
	         case 1 :
	        	 new ValidationFinal().userFirstNameCheckLamda();
	        	 break;
	        	 
	         case 2 :
	        	 new ValidationFinal().userLastNameCheckLamda();
	        	 break;
	         
	         case 3:
	        	 new ValidationFinal().userPhoneNumberCheckLamda();
	        	 break;
	         case 4 :
	        	 new ValidationFinal().userEmailCheckLamda();
	        	 break;
	        	 
	         case 5 :
	             new ValidationFinal().userPasswordCheckLamda();
	        	 break;
	        	 
	         case 6:
	        	 end();
	        	 break;
	        
	        		  
	         }
			}
	  	}

}
