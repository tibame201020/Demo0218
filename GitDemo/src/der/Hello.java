package der;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Ver.1
		System.out.println("Ver.1");
		System.out.println();
		Math cMath = new Math();
		System.out.println("cMath.add(5, 6)="+ cMath.add(5, 6));
	}

}

class Math{
	int add(int a, int b) {
		return a+b;
	}
}
