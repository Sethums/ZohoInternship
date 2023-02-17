package Exercise2;

class Browser {
	String b;

	Browser(String b1) {
		b = b1;
		System.out.println("Inside" + b + "class");
	}

	void whoAmI() {
		System.out.println("I am a browser");
	}
}

class GoogleChrome extends Browser {
	boolean isLocationAccessible, isCameraAccessible, isMicrophoneAccessible;
	final double versionNumber = 1.0;
	String c;

	GoogleChrome(String b1, String c1) {
		super(b1);
		c = c1;
		System.out.println("Inside" + c + "class");
	}

	void whoAmI() {
		System.out.println("I am a chrome");

	}

	void setPermission(boolean value1, boolean value2, boolean value3) {
		isLocationAccessible = value1;
		isCameraAccessible = value2;
		isMicrophoneAccessible = value3;
	}

	void setPermission(boolean value) {
		isLocationAccessible = value;
		isCameraAccessible = value;
		isMicrophoneAccessible = value;
	}
}

interface MultipleAccountContainers {
	public void addContainer(String c);

	public void leaveContainer(String c);

	public String[] viewAllContianers();
}

class Firefox extends Browser implements MultipleAccountContainers {
	String f;
	String container[] = new String[5];

	Integer i = 0;

	Firefox(String b1, String f1) {
		super(b1);
		f = f1;
		System.out.println("Inside" + f + "class");
	}

	void whoAmI() {
		System.out.println("I am a firefox");
	}

	public void addContainer(String c) {
		container[i++] = c;
	}

	public void leaveContainer(String l) {
		
		int j = 0;
		for (int i = 0;  i < container.length; i++) 
			if (container[i] == l)
				for( j=i;j<container.length - 1;j++) 
					container[j] = container[j+1];
				
		
		container[j] = null;
		
	}

	public String[] viewAllContianers() {
		return container;
	}
}

public class OopsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] containers = new String[30];
		Integer chromecount = 0;
		GoogleChrome gc = new GoogleChrome("Browser", "Chrome");
		Firefox fx = new Firefox("Browser", "Firefox");
		gc.whoAmI();
		fx.whoAmI();
		gc.setPermission(true);
		gc.setPermission(true, false, false);

		Browser tabOne = new GoogleChrome("Browser", "Chrome");

		Browser tabTwo = new Firefox("Browser", "Firefox");

		Browser tabThree = new Firefox("Browser", "Firefox");
		Browser tabFour = new GoogleChrome("Browser", "Chrome");
		Browser tabFive = new GoogleChrome("Browser", "Chrome");
		Browser[] allBrowsers = new Browser[5];
		allBrowsers[0] = tabOne;
		allBrowsers[1] = tabTwo;
		allBrowsers[2] = tabThree;
		allBrowsers[3] = tabFour;
		allBrowsers[4] = tabFive;
		for (int i = 0; i < 5; ++i) {
			if (allBrowsers[i] instanceof GoogleChrome) {
				chromecount++;
			}
		}

		System.out.println("Instance of google chrome" + chromecount);

		Browser browser = new Firefox("Browser", "Firefox");
		((Firefox) browser).addContainer("facebookContainer");
		((Firefox) browser).addContainer("Mails");
		((Firefox) browser).addContainer("PrivateBrowsing");

		containers = ((Firefox) browser).viewAllContianers();
		for (int i = 0; i < containers.length; i++) {
			if (containers[i] == null)
				continue;
			System.out.println(containers[i]);
		}
		((Firefox) browser).leaveContainer("PrivateBrowsing");
		containers = ((Firefox) browser).viewAllContianers();
		for (int i = 0; i < containers.length; i++) {
			if (containers[i] == null)
				continue;
			System.out.println(containers[i]);
		}
	}

}
