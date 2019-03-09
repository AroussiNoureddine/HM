package HM2;

public class UseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String inStr1= "This Is Just a Test1";
				String inStr2= "This Is just a Test2";
				String inStr3= inStr1.toUpperCase();
				String inStr4= " best of PeopleNtech Class";	
				System.out.println(inStr1.toUpperCase());
				System.out.println(inStr2.toLowerCase());
				System.out.println(inStr1.charAt(5));
				System.out.println(inStr1.matches(inStr3));
				System.out.println(inStr1.concat(inStr4));
				System.out.println("Length: "+inStr1.length());
				System.out.println("Compare To Case Sensative:   "+inStr1.compareTo(inStr3));
				System.out.println("Compare To ignore Case Sensative:   "+inStr1.compareToIgnoreCase(inStr3));
				System.out.println("Replace: "+ inStr4.replace('s', '$'));
				System.out.println(inStr1.startsWith("is the"));
				System.out.println(inStr2.startsWith("Is", 5));
				System.out.println(inStr2.substring(7));
				System.out.println(inStr1.lastIndexOf(inStr1));
				System.out.println(inStr2.contains("Is J"));
				System.out.println(inStr2.isEmpty());
				System.out.println(inStr2.endsWith("2"));
				System.out.println(inStr2.hashCode());
				System.out.println(inStr2.replace("Is just", "&&&&&&&&"));
				System.out.println(inStr2.toCharArray());
				System.out.println(inStr2.valueOf(5));
				System.out.println(inStr2.replaceFirst("This", "%%%%%"));
				System.out.println(inStr4.replaceAll("Peo", "&&&&&&&"));
				System.out.println(inStr2.intern());
				System.out.println(inStr2.offsetByCodePoints(1, 6));
				System.out.println(inStr2.regionMatches(0, "This", 3, 0));
	}

}
