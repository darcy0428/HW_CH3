package hw3;

public class p26 {

	public static void main(String[] args) {
		cars car1 = new cars();
		car1.show();
	}

}

class cars {
	private int num;
	private double gas;

	public cars() {
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}

	public void show() {
		System.out.println("車號是:" + this.num);
		System.out.print("汽油量是:" + this.gas);
	}
}
