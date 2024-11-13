package hw3;

public class p31 {

	public static void main(String[] args) {
		car.showSum();
		car car1 = new car();
		car1.setCar(123444, 41.536);

		car.showSum();
		car car2 = new car();
		car2.setCar(4563, 33.55);
		;
	}

}

class car {
	public static int sum = 0;
	private int num;
	private double gas;

	public car() {
		num = 0;
		gas = 0.0;
		sum++;
		System.out.println("生產了車子");
	}

	public void setCar(int n, double g) {

		num = n;
		gas = g;
		System.out.println("生產了車號為" + num + "，汽油量為" + gas);
	}

	public static void showSum() {
		System.out.println("車子總共有" + sum + "台");
	}

	public void show() {
		System.out.println("車號是:" + this.num);
		System.out.println("汽油量是:" + this.gas);
	}
}
