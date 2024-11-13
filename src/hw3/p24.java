package hw3;

public class p24 {

	public static void main(String[] args) {
		cars car1 = new cars();
		car1.setCar(556, 45.2);
		car1.show();
		System.out.println("只變更車號");
		car1.setCar(45895, 45.2);
		car1.show();

		System.out.println("變更汽油量");
		car1.setCar(456.882);
		car1.show();
	}

}

class cars {
	private int num;
	private double gas;

	public void setCar(int n) {
		num = n;
		System.out.println("將車號設為:" + this.num);
	}

	public void setCar(double g) {
		gas = g;
		System.out.println("將汽油輛設為:" + this.gas);
	}

	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("將車號設為:" + this.num + "\n將汽油輛設為:" + this.gas);
	}

	public void show() {
		System.out.println("車號是:" + this.num);
		System.out.println("汽油量是:" + this.gas);
	}
}
