package ExerciseException;
import java.util.Scanner;
class Student
{
	int roll,mark1,mark2,total;
	String name;
	float avg;
	Student(int r,String n,int m1,int m2)throws InvalidRollNoException
	{
		try {
		    if(r<1)
			{
				throw new InvalidRollNoException("Invalid roll no");
			}
			    roll=r;
			    total=m1+m2;
				avg=total/0;
				name=n;
			
	 // avg=3/0;//not in try catch
		    }
		      catch(IndexOutOfBoundsException i) 
		      {
			    System.out.println(i);
		      }
		      catch(Exception e) 
		      {
			    System.out.println(e);
		      }
			  finally 
			  {
				System.out.println("name"+n);
			  }
		System.out.println("roll no:"+roll);
		System.out.println("name:"+name);
		System.out.println("Average:"+avg);
		
	}
}
public class ExceptionExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter rollno,name,mark1,mark2");
     int r=Integer.parseInt(sc.nextLine());
     int m1=Integer.parseInt(sc.nextLine());
     int m2=Integer.parseInt(sc.nextLine());
     String n=sc.nextLine();
     try {
     Student s=new Student(r,n,m1,m2);
	}catch(InvalidRollNoException ie)
     {
		System.out.println(ie);
     }
	}

}
class InvalidRollNoException extends Exception 
{
	public InvalidRollNoException(String message)
	{
    super(message);
	}
}