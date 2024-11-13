package hw3;

public class p14 {

	public static void main(String[] args) {
		car car1 = new car();
		car1.num = 123455;
		car1.gas = 20.5;

		car1.setNum(15654);
		car1.setGas(20.6);
	}

}

class car {
	int num;
	double gas;

	void setNum(int n) {
		num = n;
		System.out.println("將車號設為:" + this.num);
	}

	void setGas(double g) {
		gas = g;
		System.out.print("將汽油設為:" + this.gas);
	}
}
