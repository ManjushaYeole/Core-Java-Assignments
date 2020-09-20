import java.util.Scanner;
class Series{
	public static void main(String args[]){
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no:");
	int num=sc.nextInt();
	int res=12;
	int sum=0;
	
	for(int i=1;i<num;i++)
	{
		System.out.println(res+" ");
		res=res+10;
		sum=sum+res;
		
	}
	System.out.println("");
	System.out.println("Sum of series :"+sum);
    }
}
	
	

	
