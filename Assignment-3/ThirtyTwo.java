class Student{
    private int rno;
    private String name;
    public static int counter=0;

    Student(int rno,String name){
        this.rno=rno;
	this.name=name;
        counter++;
    }
}
class ThirtyTwo{
    public static void main(String args[]){
        Student s1=new Student(1,"Manju");
        Student s2=new Student(2,"Anju");
        Student s3=new Student(3,"parchi");
        Student s4=new Student(4,"Aishu");
        Student s5=new Student(5,"Pooja");

        System.out.println("Total objects count "+Student.counter);
    }
}