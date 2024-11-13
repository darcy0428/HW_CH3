package hw3;

public class p47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car47 car1 = new car47();
		car1.show();

		int number = 12374;
		double gasoline = 26.3;
		String str = "凱迪拉克";

		car1.setCar(number, gasoline);
		car1.setName(str);
		car1.show();

	}

}

class car47 {
	private int num;
	private double gas;
	private String name;

	public car47() {
		num = 0;
		gas = 0.0;
		name = "沒有名稱";
		System.out.print("生產了車子，");
	}

	public void setCar(int n, double g) {

		num = n;
		gas = g;
		System.out.println("車號為" + num + "，汽油量為" + gas);
	}

	public void setName(String nm) {
		name = nm;
		System.out.println("將車名設為" + name);
	}

	public void show() {
		System.out.print("車號是:" + this.num);
		System.out.println(" 汽油量是:" + this.gas);
		System.out.println("車名是:" + this.name);
	}
}
