class Calculator
{
	public int add(int a,int b)
	{
		return a+b;
	}
	public int sub(int a,int b)
	{
		return a-b;
	}
	public int mult(int a,int b)
	{
		return a*b;
	}
	public int div(int a,int b)
	{
		return a/b;
	}
	public static void main (String args[])
	{
		Calculator c1 = new Calculator();
		int sum = c1.add(10,20);
		System.out.println(sum);
		int sub = c1.sub(20,10);
		System.out.println(sub);
		int mult = c1.mult(10,20);
		System.out.println(mult);
		int div = c1.div(20,10);
		System.out.println(div);
	}
}