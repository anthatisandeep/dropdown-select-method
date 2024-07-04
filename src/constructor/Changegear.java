package constructor;

public class Changegear {
	
	public Changegear()
	{
		System.out.println("hold clutch");
	}
	public void first()
	{
		System.out.println("first gear");
	}
	public void second() {
		System.out.println("second gear");
	}
	public void third() {
		System.out.println("third gear");
	}
	public static void main(String[] args) 
	{
		new Changegear().first();
		new Changegear().second();
		new Changegear().third();
}
}