package hw3;

public class p15 {

	public static void main(String[] args) {
		car car1 = new car();
		int number = 156156;
		double gasoline = 2.156;

		car1.setNumGas(number, gasoline);
	}

}

class car {
	int num;
	double gas;

	void setNumGas(int n, double g) {
		num = n;
		gas = g;
		System.out.println("將車號設為:" + this.num + "\n將汽油輛設為:" + this.gas);
	}
}
