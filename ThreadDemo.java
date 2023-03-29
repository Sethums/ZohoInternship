package Thread;

import java.util.ArrayList;
import java.util.Scanner;

class Browser{
    ArrayList<String> alist=new ArrayList<String>();

	public void visit(String u)
	{
		alist.add(u);
	}
	public ArrayList<String> getHistory() 
	{
      
        return alist;
    }
	public void clearHistory() 
	{

	alist.clear();	
    }
}
public class ThreadDemo
{
    
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String url;
		int choice=1;
		Browser bobj=new Browser();
		
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter url:");
        while(choice==1)
        {
         url=sc.nextLine() ;
         bobj.visit(url);
         System.out.println("Do you want to continue:: 1 for yes 0 for no");
         choice = Integer.parseInt(sc.nextLine());
       }
          Thread readThread = new Thread(new Runnable() {
		    @Override
		    public void run() 
		    {
		        ArrayList<String> history = bobj.getHistory();
		        System.out.println("Read thread: history = " + history);
		    }
		});

		  Thread deleteThread = new Thread(new Runnable() {
		    @Override
		     public void run() {
		        bobj.clearHistory();
		        System.out.println("Delete thread: history cleared");
		        ArrayList<String> history = bobj.getHistory();
		        System.out.println("Read thread: history = " + history);
		    
		    }
		});
		try {
		    readThread.start();
		    deleteThread.start();
		} catch (Exception e) {
		    System.err.println("Error: " + e.getMessage());
		}
	}
}