package hw3;

public class p17 {

	public static void main(String[] args) {
		car car1 = new car();
		car1.setNumGas(56156, 2.156);
		int number = car1.getNum();
		double gasoline = car1.getGas();
		System.out.println("調查樣品車時得知");
		System.out.println("車號是" + number + "\n汽油量是" + gasoline);

	}

}

class car {
	int num;
	double gas;

	int getNum() {
		System.out.println("調查車號");
		return num;
	}

	double getGas() {
		System.out.print("調查汽油量");
		return gas;
	}

	void setNumGas(int n, double g) {
		num = n;
		gas = g;
		System.out.println("將車號設為:" + this.num + "\n將汽油輛設為:" + this.gas);
	}
}
