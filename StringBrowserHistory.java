package StringDemo;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
class Browser{
	HashMap<String,Integer> Hmap = new HashMap<String,Integer>();
	
public void VisitedCheck(String url) {
	
	 int count=0,i;

      if (Hmap.containsKey(url)) 
      {
 count = Hmap.get(url);
 Hmap.put(url, count+1);
      }
      else 
      {
        Hmap.put(url, 1);
      }
      StringBuilder sb = new StringBuilder();
      
      for (Map.Entry<String, Integer> url1: Hmap.entrySet()) {
      	//int c=0;
          sb.append(url1.getKey()).append(" ## ").append(url1.getValue()).append(", ");
         
    }
      System.out.println(sb);
    
    
        
        
    }


 }

	

public class StringBrowserHistory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
Browser b=new Browser();
int i;
//ArrayList<String> arr=new ArrayList<String>();
String url;
while(true)
{
System.out.println("Enter Url");
url = sc.nextLine();
b.VisitedCheck(url);
}
}
}