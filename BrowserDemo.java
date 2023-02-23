package Exercise;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Browser 
{//method1
	interface Short{
		public void dis();
	}
//method 2
    public class Shortcut1
    {
    	void details() 
    	{
    		System.out.println("Inside Anonymous class1");
    	}
    }
    static int a;
	void addShortcuts()//for invoking anonymous inner class Shortcuts
	{
		Shortcuts sobj=new Shortcuts();
		sobj.display();
	}
	 class Shortcuts//Anonymous inner class
	{
		void display() 
		{
	    System.out.println("Inside Anonymous class");
		}
	}
	class Bookmarks//Member Inner class
	{
		void display(ArrayList<String> book1)
		{System.out.print("ArrayList: ");
	    for(String b :book1)
	    {
	        System.out.println(b);
	      }
		}
	}
	static class History
	{
		void display(int a1)
		{
			a=a1;
			System.out.println("Value of a inside static Inner class"+a);
		}

	}
//	static variable- single copy for all objects
	private static String hist[];

	public String[] getHist() 
	{
		return hist;
	}
//non static fields or methods cannot use inside static method.
	public static void setHist(String[] hist)
	{
		Browser.hist = hist;//this.hist cannot use in static context
	}

	Browser() 
	{
     //empty constructor
	}

	Browser(String[] br1)
	{
		this.hist = br1;
	}

}
public class BrowserDemo 
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		
		
		int n1,n;
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("Enter URLs:");
        String st = sc.nextLine();
        list.add(st+" ");
        n=list.size();
       
        Browser bobj=new Browser();
		Browser.Bookmarks mobj=bobj.new Bookmarks();
		mobj.display(list);
		Browser.Shortcut1 s= bobj.new Shortcut1();
		s.details();
		bobj.addShortcuts();
		Browser.History hobj=new Browser.History();
		hobj.display(8);
		Browser.Short s1=new Browser.Short() {
		public void dis() {
			System.out.println("Anonymous inner class demo");
		}
		};
		s1.dis();
        n1=list.size();
		String arr[]=new String[n];
		String arr1[]=new String[n];
		String arr2[]=new String[n];
		  
		
		
		Browser chrome = new Browser();
		chrome.setHist(new String[]{"chrome"});
		
		Browser edge = new Browser(new String[] {"edge"});
		
		
		arr1=chrome.getHist();
		arr2=edge.getHist();
		System.out.println("In chrome object:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr1[i]);
		}
		System.out.println("In edge object:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr2[i]);
		}
	}
}
