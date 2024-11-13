package hw3;

public class p51 {

	public static void main(String[] args) {
		cars[] car1 = new cars[3];

		for (int i = 0; i < car1.length; i++)
			car1[i] = new cars();

		car1[0].setCar(15445, 656.31);
		car1[1].setCar(1589, 6.99);
		car1[2].setCar(445, 45.81);

		for (int i = 0; i < car1.length; i++)
			car1[i].show();
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

	public void setCar(int n, double g) {

		num = n;
		gas = g;
		System.out.println("設車號為" + num + "，汽油量為" + gas);
	}

	public void show() {
		System.out.print("車號是:" + this.num);
		System.out.println(" 汽油量是:" + this.gas);
	}
}
