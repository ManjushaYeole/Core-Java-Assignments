class Employee{  
	private int id;  
	private String name;  
	private float salary;  
	Employee(int id,String name,float salary){  
	this.id=id;  
	this.name=name;  
	this.salary=salary;  
	}  
	
	void show(){
	System.out.println(id+" "+name+" "+salary);
	}  
}  
  
	class ThirtyThree{  
	public static void main(String args[]){  
	Employee e1=new Employee(10,"ankita",5000f);  
	
	e1.show();  
	}
}  
