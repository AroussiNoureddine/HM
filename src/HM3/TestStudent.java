package HM3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestStudent {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("Enter The Number Of The Sudents: "); 
		int nbrStd = stdIn.nextInt();
		Student[] arrayStd= new Student[nbrStd];
		for (int i = 0; i < nbrStd; i++) {
			System.out.print("Enter The Name of the "+(i+1)+" Student: ");String name = stdIn.next();
			System.out.print("Enter The date od birth of the "+(i+1)+" Student: ");String dob = stdIn.next();
			System.out.print("Enter The email of the "+(i+1)+" Student: ");String email = stdIn.next();
			System.out.print("Enter The major of the "+(i+1)+" Student(Math,Physique,Science,Technology,Literary):");String major = stdIn.next();
			arrayStd[i] = Student.getInstanst(i,name, dob, email, major);
		}
		DateFormat dateFormat = new SimpleDateFormat("yyyy MM dd HH mm");
		Date date = new Date();
		
		String S= "Database Updated :"+dateFormat.format(date)+"\n"
		+"|id|\t|name\t|dob\t|email\t|major \n";
		for (int i = 0; i < arrayStd.length; i++) {
			S+=("|"+arrayStd[i].getId()+" |\t|"+arrayStd[i].getName()+"\t|"+arrayStd[i].getDob()+"\t|"
					
		    + arrayStd[i].getEmail()+"\t|"+arrayStd[i].getMajor()+"\n");			
		}
		SaveFile.saveFile(S);
		SaveFile.saveFile(S, dateFormat.format(date));
		System.out.println(S);
		stdIn.close();
	}
	public static class SaveFile{
		private static void saveFile(String S) {
			try {
                BufferedWriter writer =
                        new BufferedWriter(new FileWriter("./StudentDB.txt"));

                writer.write(S+ "\n");

                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
			
		}
		private static void saveFile(String S,String nameFile) {
			try {
                BufferedWriter writer =
                        new BufferedWriter(new FileWriter("./Students"+nameFile+"DB.txt"));

                writer.write(S+ "\n");

                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
			
		}
	}
}
