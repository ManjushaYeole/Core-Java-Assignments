class Employee{
    private static int empNo=0;
    private int salary;
    private static int totalSal=0;

    Employee(int salary){
        empNo++;
        this.salary=salary;
        totalSal=totalSal+salary;
    }
    void show(){
        System.out.println(empNo+" "+totalSal);
    }
}
class ThirtyEight{
    public static void main(String args[]){
        Employee e=new Employee(1500);
        Employee e1=new Employee(6600);
        Employee e2=new Employee(12387);
        e2.show();

    }
    
}