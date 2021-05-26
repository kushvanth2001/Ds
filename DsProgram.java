import java.util.ArrayList;
import java.util.HashSet;

public class DsProgram {
  String name;
  int salary;
  float height;
  String id;
  DsProgram(String name,int salary,float height,String id){
	  this.name=name;
	this.salary=salary;
	 this.height=height;
	 this.id=id;
  }
  public String toString(){//overriding the toString() method  
	  return name+" "+salary+" "+height+" ,"+id;
	  
  }
	public static void main(String[] args) {
		ArrayList<DsProgram> list=new ArrayList<DsProgram>();
		DsProgram emp1=new DsProgram("kushvanth",0,5.8f,"nothing");
		DsProgram emp2=new DsProgram("ramesh",10,4.2f,"hajak");
		DsProgram emp3=new DsProgram("suresh",330,4.5f,"182h8g");
		DsProgram emp4=new DsProgram("mahesh",4550,5f,"jaoa43j");
		list.add(emp2);
		list.add(emp1);
		list.add(emp3);
		list.add(emp4);
		System.out.println(list);
		list.remove(emp2);
		System.out.println(list);
		 
	 
		HashSet<DsProgram> hs = new HashSet<DsProgram>();
		  
	        // add element in HashSet object
		hs.add(emp2);
		hs.add(emp1);
		hs.add(emp3);
		hs.add(emp4);
		System.out.println(hs);
		hs.remove(emp1);
		System.out.println(hs);
	  System.out.println( hs.isEmpty());
	     HashSet<DsProgram> hs1 = new HashSet<DsProgram>();
	     
	     hs1=(HashSet)hs.clone();
	     System.out.println(hs1);
		
		
		
		

	}

}
