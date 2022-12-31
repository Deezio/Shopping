package corejava.assignments;

class Ex11_6 {
	public int a, b;
	public int c = 2;
	public static int x = 6;
}

public class Ex11_6Test {
	public static void main(String[] args) {
		Ex11_6 instanceA = new Ex11_6();
		Ex11_6 instanceB = new Ex11_6();
		instanceA.a = 8;
		instanceB.b = instanceA.x;
		instanceA.x++;
		instanceB.a = 10;
		instanceB.c = 90;
		instanceB.x++;
		instanceA.x++;
		System.out.println(instanceA.a+" "+instanceA.b+" "+instanceA.c+" "+instanceA.x);
		System.out.println(instanceB.a+" "+instanceB.b+" "+instanceB.c+" "+instanceB.x);
	}
}
