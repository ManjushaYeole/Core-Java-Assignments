class Person{
    
    private String name;
    private int age;
    Person(String name,int age){
        this.name=name;
	this.age=age;
    }
    void display(){
        System.out.println(name+" "+age);
    }

}
class ThirtySeven{
    public static void main(String args[]){
        Person p1=new Person("XYZ",53);
        p1.display();
    }
}