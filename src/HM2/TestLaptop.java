package HM2;

public class TestLaptop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Laptop laptop1 = new	Laptop();
       laptop1.setMark("Hp");laptop1.setscrnSize(15);laptop1.setType("Gaming Pc");
       System.out.println("The Value of the ScrnSize after the first Constrator:" + Laptop.scrnSize);
       laptop1.displyInfo();
       Laptop laptop2 =new Laptop("Dell", 13, "Thin PC");
       System.out.println("The Value of the ScrnSize after the Second Constrator:" + Laptop.scrnSize);
       System.out.println("The Size of the new Screen is: "+ Laptop.calcSecondScrnSize());
       System.out.println("The Value of the ScrnSize after the method :" + Laptop.scrnSize);
       
       
	}

}
