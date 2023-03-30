package Thread;


import java.util.*;

class Browser{
    ArrayList<String> alist=new ArrayList<String>();

	 public void visit(String url)
	{  synchronized(alist) {
		alist.add(url);
	}
	}
	 public synchronized ArrayList<String> getHistory() 
	{  synchronized(alist) {
		System.out.println("readArray Size :" + alist.size());
        return alist;
    }
	}
  public synchronized void clearHistory() 
	{synchronized(alist) {
		int sizeAlist=alist.size();
		Iterator<String> iter = alist.iterator();
	    while (iter.hasNext()) {
	        iter.next();
	        iter.remove();
	        System.out.println("delete Array Size :" + alist.size());
	       
	    }
	  System.out.println("delete thread: history = " + alist);    
    }
}
}
	
public class ThreadDemo
{
    
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String url;
		int choice = 1;
		Browser bobj = new Browser();
		
        Scanner sc = new Scanner(System.in);
        
//        System.out.println("Enter url:");
//        while(choice==1)
//        {
//	         url=sc.nextLine() ;
//	         bobj.visit(url);
//	         System.out.println("Do you want to continue:: 1 for yes 0 for no");
//	         choice = Integer.parseInt(sc.nextLine());
//        }
        
        for(int i = 0; i < 500; i ++)
        	bobj.visit(String.valueOf(i));
     
        synchronized(bobj){
        Thread readThread = new Thread(new Runnable() {
            @Override
            public void run() 
            {
                ArrayList<String> history1 = bobj.getHistory();
                System.out.println("Read thread: history = " + history1);
            }
        });
         
          Thread deleteThread = new Thread(new Runnable() {
            @Override
             public void run() {
                bobj.clearHistory();
                System.out.println("Delete thread: history cleared");
                ArrayList<String> history = bobj.getHistory();
                System.out.println("delete thread: history = " + history);
            
            }
        });
        
       

	        try {
	        	readThread.start();
	        	
			    deleteThread.start();
			    
			    
			    
	        } catch (Exception e) {
	            System.out.println(e);
	        }  
		
	}
}
}
