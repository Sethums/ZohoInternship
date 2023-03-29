package Collection;
import java.util.Scanner;
import java.util.*;
class BrowserHistory
{
	ArrayList<String> arrlist=new ArrayList<String>();
	LinkedList<String> llist=new LinkedList<String>();
	Vector<String> vect=new Vector<String>(); 
	Stack<String> stk=new Stack<String>();
	HashSet<String> hset=new HashSet<String>();
	LinkedHashSet<String> lhset=new LinkedHashSet<String>();  
	TreeSet<String> tset=new TreeSet<String>();  
	HashMap<String,ArrayList<String>> hmap=new HashMap<String,ArrayList<String>>();//Creating HashMap 
	LinkedHashMap<String,ArrayList<String>> lhmap=new LinkedHashMap<String,ArrayList<String>>();
	TreeMap<String,ArrayList<String>> tmap=new TreeMap<String,ArrayList<String>>();
	void visit(String url)
	{
		String ext[]=url.split("\\.");
		String extension = url.substring(url.lastIndexOf(".") + 1);
        // If the extension is not already present in the map, add it with an empty list
        if (!hmap.containsKey(extension)) {
            hmap.put(extension, new ArrayList<>());
            tmap.put(extension, new ArrayList<>());
            lhmap.put(extension, new ArrayList<>());
        }
        // Add the URL to the list of URLs with the given extension
        hmap.get(extension).add(url);
        tmap.get(extension).add(url);
        lhmap.get(extension).add(url);
    
	arrlist.add(url);
	llist.add(url);
	vect.add(url);
	stk.push(url);
	hset.add(url);
	lhset.add(url);
	tset.add(url);
	//hmap.put(ext[1],ext[0]);
	//lhmap.put(ext[1], ext[0]);
	//tmap.put(ext[1],ext[0]);
	}
    void sort()
    {//ArrayList sort
    	Collections.sort(arrlist);
    	System.out.println("Sorted urls in arraylist:");
    	for(String a:arrlist)
    		System.out.println(a+" ");
    	
    	Collections.sort(llist);
    	System.out.println("Sorted urls in linkedlist:");
    	for(String l:llist)
    		System.out.println(l+" ");
    	
    	Collections.sort(vect);
    	System.out.println("Sorted urls in vector:");
    	for(String v:vect)
    		System.out.println(v+" ");
    	
    	List<String> list = new ArrayList<String>(hset);
    	Collections.sort(list);
    	hset.clear();
    	
    	hset.addAll(list);
    	System.out.println("Sorted urls in Hashset:");
     	for(String h:list)
     		System.out.println(h+" ");
     	
     	List<String> list1 = new ArrayList<String>(lhset);
    	Collections.sort(list1);
    	lhset=new LinkedHashSet<String>(list1);
    	System.out.println("Sorted urls in LinkedHashset:");//maintain order
     	for(String h:lhset)
     		System.out.println(h+" ");
     	

    	System.out.println("Sorted urls in treeset:");
    	for(String t:tset)
    		System.out.println(t+" ");
    	
    	
    }

    void deleteHistory(int index,String url)
    {
    	System.out.println("Deleted url at "+index+"th position"+arrlist.get(index));
    	arrlist.remove(index);
    	System.out.println("Urls in arraylist after deletion:");
    	for(String a:arrlist)
    		System.out.println(a+" ");
    	
    	
    	arrlist.remove(url);
    	System.out.println("Urls in arraylist after deletion of"+url);
    	for(String a:arrlist)
    		System.out.println(a+" ");
    	
    	
    	System.out.println("Deleted url at "+index+"th position"+llist.get(index));
    	llist.remove(index);
    	System.out.println("Urls in linkedlist after deletion:");
    	for(String l:llist)
    		System.out.println(l+" ");
    	

    	llist.remove(url);
    	System.out.println("Urls in linkedlist after deletion of"+url);
    	for(String l:llist)
    		System.out.println(l+" ");
    	
    	System.out.println("Deleted url at "+index+"th position"+vect.get(index));
    	vect.remove(index);
    	System.out.println("Urls in vector after deletion:");
    	for(String v:vect)
    		System.out.println(v+" ");
    	
    	List<String> list = new ArrayList<String>(hset);
    	System.out.println("Deleted url at "+index+"th position"+list.get(index));
    	list.remove(index);
    	hset = new HashSet<>(list);
    	System.out.println("Urls in hashset after deletion:");
    	for(String h:hset)
    		System.out.println(h+" ");
    	

    	hset.remove(url);
    	System.out.println("Urls in hashset after deletion of"+url);
    	for(String h:hset)
    		System.out.println(h+" ");
    	
    	List<String> list1 = new ArrayList<String>(hset);
    	System.out.println("Deleted url at "+index+"th position"+list1.get(index));
    	list1.remove(index);
    	lhset=new LinkedHashSet<String>(list1);
    	System.out.println("Urls in linkedhashset after deletion:");
    	for(String h:lhset)
    		System.out.println(h+" ");
    	

    	lhset.remove(url);
    	System.out.println("Urls in linked hashset after deletion of"+url);
    	for(String lh:lhset)
    		System.out.println(lh+" ");
    	
    	List<String> list2 = new ArrayList<String>(tset);
    	System.out.println("Deleted url at "+index+"th position"+list2.get(index));
    	list2.remove(index);
    	tset = new TreeSet<>(list2);
    	System.out.println("Urls in treeset after deletion:");
    	for(String t:tset)
    		System.out.println(t+" ");
    	

    	tset.remove(url);
    	System.out.println("Urls in treeset after deletion of "+url);
    	for(String t:tset)
    		System.out.println(t+" ");
    	
    }

    void fetchHistory()
    {   System.out.println(" urls in arraylist:");
    	Iterator itr=arrlist.iterator();//getting the Iterator  
    	  while(itr.hasNext()){//check if iterator has the elements  
    	   System.out.println(itr.next());
    	  }
    	  System.out.println("urls in linkedlist:");
    	  Iterator itr1=llist.iterator();//getting the Iterator  
    	  while(itr1.hasNext()){//check if iterator has the elements  
    	   System.out.println(itr1.next());
    	  }
    	  System.out.println("urls in vector:");
    	  Iterator itr2=vect.iterator();//getting the Iterator  
    	  while(itr2.hasNext()){//check if iterator has the elements  
    	   System.out.println(itr2.next());
    	  }
    	  
    	  System.out.println("urls in hashset:");
    	  Iterator itr3=hset.iterator();//getting the Iterator  
    	  while(itr3.hasNext()){//check if iterator has the elements  
    	   System.out.println(itr3.next());
    	  }
    	  
    	  System.out.println("urls in linkedhashset:");
    	  Iterator itr4=lhset.iterator();//getting the Iterator  
    	  while(itr4.hasNext()){//check if iterator has the elements  
    	   System.out.println(itr4.next());
    	  }
    	  
    	  System.out.println("urls in Treeset:");
    	  Iterator itr5=tset.iterator();//getting the Iterator  
    	  while(itr5.hasNext()){//check if iterator has the elements  
    	   System.out.println(itr5.next());
    	  }
    }
    void search(String e)
    {   
      String ext="."+e;
      System.out.println(" urls in arraylist:");
    	for(String a:arrlist)
    		if(a.contains(ext))
    		System.out.println(a+" ");
    	System.out.print(" urls in linkedlist:");
    	for(String l:llist)
    		if(l.contains(ext))
    		System.out.println(l+" ");
    	System.out.print(" urls in vector:");
    	for(String v:vect)
    		if(v.contains(ext))
    		System.out.println(v+" ");
    	System.out.print(" urls in hashset:");
    	for(String h:hset)
    		if(h.contains(ext))
    		System.out.println(h+" ");
    	System.out.print(" urls in linkedhashset:");
    	for(String h:lhset)
    		if(h.contains(ext))
    		System.out.println(h+" ");
    	System.out.print(" urls in treeset:");
    	for(String t:tset)
    		if(t.contains(ext))
    		System.out.println(t+" ");
    }
   void historySize()
   {
	  System.out.println("Size of arraylist History:"+arrlist.size()); 
	  System.out.println("Size of History:"+llist.size()); 
	  System.out.println("Size of History:"+vect.size()); 
	  System.out.println("Size of History:"+hset.size()); 
	  System.out.println("Size of History:"+hset.size()); 
	  System.out.println("Size of History:"+tset.size()); 
   }
 
   void updateHistory(int index,String st) 
   {
	 arrlist.set(index, st);
	 System.out.println("Arraylist urls");
	 for(String a:arrlist)
 		System.out.println(a+" ");
	 llist.set(index, st);
	 System.out.println("Linkedlist urls");
	 for(String l:llist)
 		System.out.println(l+" ");
	vect.set(index, st);
	 System.out.println("Vector urls");
	 for(String v:vect)
 		System.out.println(v+" ");
	 
	 List<String> list = new ArrayList<String>(hset);
	 list.set(index, st);
	 HashSet<String> hset=new HashSet<String>(list);//by converting it to hashset the order will again change
	 System.out.println("Hashset urls");
	 for(String h:hset)
 		System.out.println(h+" ");//updation made in different pos
	 
	 List<String> list1 = new ArrayList<String>(lhset);
	 list1.set(index, st);
	 lhset=new LinkedHashSet<String>(list1);
	 System.out.println("LinkedHashset urls");
	 for(String h:lhset)
 		System.out.println(h+" ");
	 
	 List<String> list2 = new ArrayList<String>(tset);
	 list2.set(index, st);
	 tset=new TreeSet<String>(list2);
	 System.out.println("Treeset urls");
	 for(String t:tset)
 		System.out.println(t+" ");
   }
   
   
   void mapFetchHistory(String e)
   {
	   System.out.println("Hashmap urls:");
	   
	   List<String> values = hmap.get(e);
       if(values==null)
       {
    	   System.out.println("No urls found");
       }
       // Iterate over the list and print each value
       else {
       for (String value : values) {
           System.out.println(value);
       }
	   //for (Collection<List<String>> values : hmap.values()) {
          // if (u.equals(hmap.get(e))) {
            //   System.out.println(u);
   //}
       }
    
	   System.out.println("LinkedHashmap urls:");
	   List<String> values1 = lhmap.get(e);
	   if(values1==null)
       {
    	   System.out.println("No urls found");
       }
       // Iterate over the list and print each value
	   else {
       for (String value : values1) {
           System.out.println(value);
       }
	  
	   }
       
	   System.out.println("Treemap urls:");
	   List<String> values2 = hmap.get(e);
	   if(values2==null)
       {
    	   System.out.println("No urls found");
       }
       // Iterate over the list and print each value
	   else {
       for (String value : values2) {
           System.out.println(value);
       }
	   }
	  // for (String u : tmap.values()) {
         //  if (u.equals(tmap.get(e))) {
            //   System.out.println(u);
   //}
   // } 
   }
   void mapDelete(String e)
   {
	   System.out.println("Deleted url of "+e+"th key"+hmap.get(e));
	   hmap.remove(e);
	   System.out.println("Urls after removal:");
	  
	   for(Map.Entry<String, ArrayList<String>> entry : hmap.entrySet()) {
		    String key = entry.getKey();
		    ArrayList<String> valueList = entry.getValue();
		    System.out.println("Key: " + key + ", Value List: " + valueList);
		}
	   
	   System.out.println("Deleted url of "+e+"th key"+lhmap.get(e));
	   lhmap.remove(e);
	   System.out.println("Urls after removalin linkedhash map:");
	   for(Map.Entry<String, ArrayList<String>> entry : lhmap.entrySet()) {
		    String key = entry.getKey();
		    ArrayList<String> valueList = entry.getValue();
		    System.out.println("Key: " + key + ", Value List: " + valueList);
		}
	   System.out.println("Deleted url of "+e+"th key"+tmap.get(e));
	   tmap.remove(e);
	   System.out.println("Urls after removal in tree map:");
	   for(Map.Entry<String, ArrayList<String>> entry : tmap.entrySet()) {
		    String key = entry.getKey();
		    ArrayList<String> valueList = entry.getValue();
		    System.out.println("Key: " + key + ", Value List: " + valueList);
		}
	   
   }

void mapSize(String e)
{
	
	 List<String> count1 = hmap.get(e);
	 
     System.out.println("Number of urls with"+ e+ "extensions"+count1.size());
     List<String> count2 = lhmap.get(e);

System.out.println("Number of urls with"+ e+ "extensions"+count2.size());
    
List<String> count3 = tmap.get(e);
System.out.println("Number of urls with "+ e+ " extensions: "+count3.size());
}

void mapSearch(String url) {
	Set<String> keys = hmap.keySet();
	ArrayList<String> alist=new ArrayList<String>();
	for(String k:keys)
	{
		ArrayList<String> valuesList=hmap.get(k);
		for(String u:valuesList)
		{
	    if(u.contains(url))
	    	alist.add(u);
		}
	}
	
	Set<String> keys1 = lhmap.keySet();
	ArrayList<String> alist1=new ArrayList<String>();
	for(String k:keys1)
	{
		ArrayList<String> valuesList1=lhmap.get(k);
		for(String u:valuesList1)
		{
	    if(u.contains(url))
	    	alist1.add(u);
		}
	}
	
	Set<String> keys2 = hmap.keySet();
	ArrayList<String> alist2=new ArrayList<String>();
	for(String k:keys2)
	{
		ArrayList<String> valuesList2=hmap.get(k);
		for(String u:valuesList2)
		{
	    if(u.contains(url))
	    	alist2.add(u);
		}
	}
	

	
		 System.out.println("Urls of hashmap"+alist);
	 System.out.println("Urls of linkedhashmap"+alist1);
	 System.out.println("Urls of treemap"+alist2);
} 
}
public class CollectionExercise 
{
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String url;
      int ch,choice,c=1;
      ArrayList[] alist=new ArrayList[3];
	  Scanner sc=new Scanner(System.in);
	  BrowserHistory bobj=new BrowserHistory();
	  
      System.out.println("Enter url:");
      while(c==1)
      {
      url=sc.nextLine() ;
      bobj.visit(url);
      System.out.println("Do you want to continue:: 1 for yes 0 for no");
      c = Integer.parseInt(sc.nextLine());
      }
      do {
      System.out.println("Enter choice");
      System.out.println("1.Sort");
      System.out.println("2.Delete History");
      System.out.println("3.Fetch History");
      System.out.println("4.Search");
      System.out.println("5.Size");
      System.out.println("6.Update History");
      System.out.println("7.Fetch Map details");
      System.out.println("8.Map Remove extension");
      System.out.println("9.Map Count extension");
      System.out.println("10.Map search extension");
      System.out.println("11.Exit");
      ch=Integer.parseInt(sc.nextLine());
      switch(ch)
      {
      case 1:
    	  bobj.sort();
    	  break;
      case 2:
    	  System.out.println("Enter index to be deleteed:");
    	  int ind=Integer.parseInt(sc.nextLine());
    	  System.out.println("Enter url to be deleteed:");
    	  String durl=sc.nextLine();
    	  bobj.deleteHistory(ind,durl);
    	  break;
      case 3:
    	  bobj.fetchHistory();
    	  break;
      case 4:
    	  System.out.println("Enter extension to be search:");
    	  String ext=sc.nextLine();
    	  bobj.search(ext);
    	  break;
      case 5:
    	  bobj.historySize();
    	  break;
      case 6:
    	  System.out.println("Enter index to be updated:");
    	  int index=Integer.parseInt(sc.nextLine());
    	  System.out.println("Enter string to be updated:");
    	  String ustring=sc.nextLine();
    	  bobj.updateHistory(index,ustring);
    	  break;
      case 7:
    	  System.out.println("Enter extension to be fetch:");
    	  String fext=sc.nextLine();
    	  bobj.mapFetchHistory(fext);
    	  break;
      case 8:
    	  System.out.println("Enter extension to be remove:");
    	  String dext=sc.nextLine();
    	  bobj.mapDelete(dext);
    	  break;
      case 9:
    	  System.out.println("Enter extension to be count:");
    	  String sext=sc.nextLine();
    	  bobj.mapSize(sext);
    	  break;
      case 10:
    	  System.out.println("Enter url to be search:");
    	  String u=sc.nextLine();
    	  bobj.mapSearch(u);
    	 
    	  
    	  
    	  break;
      case 11:
    	  System.out.println("~~~~End of program~~~~");
		  System.exit(0);
	  default:
		  System.out.println("Invalid choice!!!!");
		  break;
    	  }
      System.out.println("Do you want to continue:: 1 for yes 0 for no");
      choice = Integer.parseInt(sc.nextLine());
      }while(choice==1);
	}

}
//hashmap=list of urls
//delete with url
//hashset use 