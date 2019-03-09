package HM2;

public class Laptop {
	public String mark;
	public static int scrnSize;
	public String type;
	public Laptop() {}
	public void setMark(String mark){
		this.mark = mark;
	}
	public void setscrnSize(int scrnSize) {
		this.scrnSize = scrnSize;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void displyInfo() {
		System.out.println("your Laptop info is: " + mark +", "+ scrnSize + ", "+ type);
	}
	public Laptop(String mark,int scrnSize,String type)
	{
		this.mark=mark;
		this.scrnSize=scrnSize;
		this.type=type;
		System.out.println("your Laptop info is: " + mark +", "+ scrnSize + ", "+ type);
	}
	public static int calcSecondScrnSize() {
		int cAge = scrnSize +10;
		scrnSize = cAge+10;
		return cAge;
	}

}
