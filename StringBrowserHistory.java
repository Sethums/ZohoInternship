package StringDemo;
import java.util.Scanner;

class Browser{
	
	 String[] list = new String[10];

	public void VisitedCheck(String st) 
	{
		
		boolean urlPresentFlag = false;
		int i = 0;
		String[] splittedUrl;
		
		
		for(String url : list) {
			if(url == null)
				continue;

			splittedUrl = url.split("##");
			if(splittedUrl[0].equals(st)) {
				list[i] = st + "##" + (Integer.parseInt(splittedUrl[1]) + 1);
				urlPresentFlag = true;
			}
			i++;
		}
	
		if(!urlPresentFlag)
			list[i] = st + "##" + 1;
		
		
		for(String url : list) 
			if(url != null)
				System.out.println(url);
	      
	}
        
        
}


 

	

public class StringBrowserHistory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
Browser b=new Browser();
int i;
String url;
while(true)
{
System.out.println("Enter Url");
url = sc.nextLine();
b.VisitedCheck(url);
}
}
}