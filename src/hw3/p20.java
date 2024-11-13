package hw3;

public class p20 {
	public static void main(String[] args) {
		car car1 = new car();
		car1.num = 123455;
		car1.gas = -10.3;

		car1.show();
	}

}

class car {
	int num;
	double gas;

	void show() {
		System.out.println("車號是:" + this.num);
		System.out.print("汽油量是:" + this.gas);
	}
}
