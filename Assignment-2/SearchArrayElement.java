import java.util.Scanner;
class SearchArrayElement{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int [] {11, 22, 33, 44, 55};  
        System.out.println("Enter element");
        int num=sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if(num==arr[i])
            {
                System.out.println("Element present at index "+i);
            }
        }
    }
}