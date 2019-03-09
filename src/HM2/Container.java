package HM2;

public class Container {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayint = new int[20] ;
	       for (int i = 0; i < arrayint.length; i++) {
	    	   arrayint[i]= 100-(i*2);
			}
	       for (int i = 0; i < arrayint.length; i++) {
			System.out.print(arrayint[i]+ ", ");
		}
	}

}
