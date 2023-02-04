package Exercise;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Browser {
//	String br[];
	private static String hist[];

//	public void setBr(String[] br) {
//		this.hist = br;
//	}

	public static String[] getHist() {
		return hist;
	}

	public static void setHist(String[] hist) {
		Browser.hist = hist;
	}

	Browser() {

	}

	Browser(String[] br1) {
		this.hist = br1;
	}



	
	
}
public class BrowserDemo {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		
		int n;
		ArrayList<String> list = new ArrayList<String>();
		
        System.out.println("Enter URLs:");
           String st = sc.nextLine();
            
            
            list.add(st+" ");
            
        
        n=list.size();
		  String arr[]=new String[n];
		  String arr1[]=new String[n];
		  String arr2[]=new String[n];
		  for (int i = 0; i <list.size(); i++)
	            arr[i] = list.get(i);
		Browser chrome = new Browser();
		chrome.setHist(arr);
		
		Browser edge = new Browser(arr);
		
		
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
