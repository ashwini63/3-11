class evenOdd{
	public static void main(String args[]){
	int a[]={1,2,4,3,5,6};
	for(int i=0;i<6;i++)
	{
	if(a[i]%2==0)
	{
	System.out.println("num is even"  +a[i]);
	}
	else if(a[i]%2!=0)
	{
	System.out.println("num is odd" +a[i]);
	}
	}
}
}