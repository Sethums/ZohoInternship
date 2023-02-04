package Exercise;

import java.util.Scanner;

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
		String arr[] = new String[20];
		String arr1[] = new String[20];
		String arr2[] = new String[20];
		System.out.println("Enter Url");
		for (int i = 0; i < 5; ++i) {
			arr[i] = sc.nextLine();

		}
		Browser chrome = new Browser();
		chrome.setHist(arr);
		
		Browser edge = new Browser(arr);
		
		System.out.println(chrome.getHist());
		System.out.println(edge.getHist());
		arr1=chrome.getHist();
		arr2=edge.getHist();
		System.out.println("In chrome object:");
		for(int i=0;i<5;i++)
		{
			System.out.println(arr1[i]);
		}
		System.out.println("In edge object:");
		for(int i=0;i<5;i++)
		{
			System.out.println(arr2[i]);
		}
	}
}
