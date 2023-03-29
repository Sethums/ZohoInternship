package Hack;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
class Browser 
{
	ArrayList<String> alist=new ArrayList<String>();
	
	public void visit(String u)
	{
		alist.add(u);
	}
	public ArrayList<String> getUrl()
	{
		return alist;
	}
}
class BrowserHistory
{
	ArrayList<String> alist1=new ArrayList<String>();
	public void visit(String u)
	{
		alist1.add(u);
	}
	public ArrayList<String> getUrl()
	{
		return alist1;
	}
}
public class Hacker {
	public static void main(String[] args) throws IOException,FileNotFoundException
	{
		// TODO Auto-generated method stub
	    int c=1,choice=1;
	    String url,u;
	    ArrayList<String> urllist=new ArrayList<String>();
	    ArrayList<String> urllist1=new ArrayList<String>();
	    
        Browser bobj=new Browser();
        BrowserHistory bhobj=new BrowserHistory();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter url:");
        while(c==1)
        {
          url=sc.nextLine() ;
          bobj.visit(url);
          System.out.println("Do you want to continue:: 1 for yes 0 for no");
          c = Integer.parseInt(sc.nextLine());
        }
        try
        {
          FileWriter writer = new FileWriter("D:\\history.txt",true); 
          BufferedWriter buffer = new BufferedWriter(writer);   
          urllist=bobj.getUrl();
          for (String str : urllist)
          {buffer.newLine();
            buffer.write(str);
          }
     
	      buffer.close();
	    
	
	      }catch(Exception e)
          {
		    System.out.println(e);
          }
        try 
        {
          FileReader fr=new FileReader("D:\\history.txt");  
          BufferedReader br=new BufferedReader(fr);    
      
          String line= br.readLine();
        while (line != null) 
        {
        	System.out.println(line);
        	line= br.readLine();
        }
        br.close();    
        fr.close();
        }catch(Exception e) {System.out.println(e);}
        try 
        {
           FileWriter fileWriter=new FileWriter("D:\\history.txt",true);
      
           BufferedWriter br1=new BufferedWriter(fileWriter);
           while(choice==1)
            {
               System.out.println("Enter other urls:");
               u=sc.nextLine();
               br1.newLine();
               br1.write(u);
              
               bhobj.visit(u);
               System.out.println("Do you want to continue:1 for yes 0 for no!!!!");
               choice=Integer.parseInt(sc.nextLine());
      
            }
            br1.close();
            fileWriter.close();
            urllist1=bhobj.getUrl();
            System.out.println(urllist1);
            FileReader fr2=new FileReader("D:\\history.txt");  
            BufferedReader br2=new BufferedReader(fr2);    
  
            String line= br2.readLine();
          while (line != null) 
           {
        	  System.out.println(line);
              line=br2.readLine();
           
           }
           br2.close();    
           fr2.close();
      
       }catch(Exception e) {System.out.println(e);}
      
}
}
