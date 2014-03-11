package inheritence;

public class Main {
	public SuperMan superM;
	
	public static void main(String[] args)
	{
		Main me = new Main();
		me.superM = new LexLuther();
		
		System.out.println(me.superM.getClass());
		
		me.superM = new SuperMan();
		
		System.out.println(me.superM.getClass());
	}

}
