class MathOperation{
	static void multiply(int i,int j)
	{
		int k=i*j;
		System.out.println(k);
	}

	static void multiply(float p,float q,float r)
	{
		float s=p*q*r;
		System.out.println(s);
	}

	static int multiply(int arr[]){
        int pro=1;
        for(int i=0;i<arr.length;i++){
            pro=pro*arr[i];
        }
        return pro;
   	}

	static void multiply(double a,int b)
	{
		double d=a*b;
		System.out.println(d);
	}

	
}

class ThirtySix{
	public static void main(String args[]){
	MathOperation.multiply(4,21);
	MathOperation.multiply(5.1f,3.7f,23.3f);

	int arr[]={1,2,3};
        int res=MathOperation.multiply(arr);
        System.out.println(res);
	
	MathOperation.multiply(8,3);
	 

	}
}
