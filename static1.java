class test
{
	static int i;
	static
	{
		System.out.println("static block");
	}
}
class static1 
{
	public static void main(String args[])
	{
		test a=new test();
}
}