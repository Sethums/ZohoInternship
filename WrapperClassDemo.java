package WrapperClass;

class Browser{
	
	
	int no_of_tabs;
	Integer tabs;

	Browser(int n){
	this.no_of_tabs=n;
	 
	}
	public Integer getNo_of_tabs() {
		Integer t=no_of_tabs;
		  return (t); 
		
	}
	
	public String toString() {  
		  return Integer.toString(no_of_tabs);  
		}  
}


public class WrapperClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Browser b=new Browser(10);
Integer i=8;
int c=i;	
System.out.println(b);//WrapperClass.Browser@1d251891-not using wrapperclass
//normal method invoking
System.out.println(c);
int c1 =b.getNo_of_tabs();
System.out.println(c1);
	}

}







