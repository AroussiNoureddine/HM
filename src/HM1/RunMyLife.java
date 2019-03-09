package HM1;

public class RunMyLife {
	public static void main (String[] args) {
		MyLife Life = new MyLife();
		Life.wikeUp();
		int N = Life.add(29, 20);
		System.out.println(N);
		N = Life.sub(29, 20);
		System.out.println(N);
		Life.printDate();
		Life.printTime();
	}

}
