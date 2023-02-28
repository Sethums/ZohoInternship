package ExceptionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class BrowserHistory {
	String home;
	int c;
	ArrayList<String> urllist = new ArrayList<String>();

	BrowserHistory(String homepage) {
		home = homepage;
		System.out.println("In the homepage of " + home);
	}

	void visit(String url) {
		urllist.add(url);
		c=urllist.size()-1;
		
	}

	String back(int steps) throws NoHistoryFoundException {

		if (c<steps) {
			c = 0;
            
		} else {
			
			c=c-steps;
		}

		if (urllist.get(c).isEmpty()) {
			throw new NoHistoryFoundException("No History Found");
		}

		else {
			System.out.println(c);
			return urllist.get(c);
		}

	}

	String front(int steps) throws NoHistoryFoundException {
		
		c = steps + c;
		if (c >= urllist.size()) {
			c = urllist.size()-1;
		}
		
		if (urllist.get(c).isEmpty()) {
			throw new NoHistoryFoundException("No History Found");
		} else
			return urllist.get(c);
	}

	String get(int position) {
		
			return urllist.get(position);
		
	}
}

public class ExceptionClass {
	public static void main(String args[]) {
		int choice,urlsize=0;
		
		Scanner sc = new Scanner(System.in);
		BrowserHistory bobj = new BrowserHistory("browser");
		do {
			System.out.println("----Enter choice:-----");
			System.out.println("1.Input visit url");
			System.out.println("2.Step back");
			System.out.println("3.Step forward");
			System.out.println("4.Get url");
			System.out.println("5.Exit");
			int ch = Integer.parseInt(sc.nextLine());
			switch (ch) {
			case 1:
				try {
					System.out.println("Enter url");
					String url = sc.nextLine();
					String[] validExtensions = { ".com", ".in", ".org" };
					String extension = url.substring(url.lastIndexOf('.'));

					if (!Arrays.asList(validExtensions).contains(extension)) {
						throw new InvalidURLException("Invalid url extension");
					}

					// Do something with the valid URL
					// ...
					else
						bobj.visit(url);
					urlsize++;
				} catch (InvalidURLException e1) {
					System.out.println(e1);
				}
				break;

			case 2:
				try {
					System.out.println("Enter steps to move backward");
					int bsteps =Integer.parseInt(sc.nextLine());
					String bcurrenturl = bobj.back(bsteps);

					System.out.println("Currenturl:" + bcurrenturl);
				} catch (NoHistoryFoundException e) {
					System.out.println(e);
				}
				break;
			case 3:
				try {
					System.out.println("Enter steps to move forward");
					int fsteps = Integer.parseInt(sc.nextLine());
					String fcurrenturl = bobj.front(fsteps);
					System.out.println("Currenturl:" + fcurrenturl);
				} catch (NoHistoryFoundException e) {
					System.out.println(e);
				}
				break;
			case 4:
				System.out.println("Enter position");
				int pos = Integer.parseInt(sc.nextLine());
				try {
					if (pos > urlsize-1) {
						throw new IndexOutOfBoundsException();
					}
					if (pos < 0) {
						throw new InvalidPositionException("Provide only positive values");
					}
				String geturl = bobj.get(pos);
                System.out.println("Url at "+pos+"th position:"+geturl);
				} catch (IndexOutOfBoundsException e) {
					System.out.println(e);
				}
				catch (InvalidPositionException e1) {
					System.out.println(e1.getMessage());
				}
				break;
			case 5:
				System.out.println("---End of program---");
				System.exit(0);
			default:
				System.out.println("Invalid choice!!!!");

			}
			System.out.println("Do you want to continue:: 1 for yes 0 for no");
			choice = Integer.parseInt(sc.nextLine());
		} while (choice == 1);

	}
}

class NoHistoryFoundException extends Exception {
	public NoHistoryFoundException(String errorMessage) {
		super(errorMessage);
	}
}

class InvalidURLException extends Exception {
	public InvalidURLException(String errorMessage) {
		super(errorMessage);
	}
}

class InvalidPositionException extends Exception {
	public InvalidPositionException(String message) {
		super(message);
	}
}