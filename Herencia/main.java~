import java.util.Scanner;


public class main{
	
	public static String[] menu(){
		String [] array = new String[6];
		Scanner scan = new Scanner(System.in);
		System.out.println("Instert title:");
		array[3] = scan.nextLine();
		System.out.println("Insert author:");
		array[4] = scan.nextLine();
		System.out.println("Insert theme:");
		array[0] = scan.nextLine();
		System.out.println("Insert editorial:");
		array[1] = scan.nextLine();
		System.out.println("Insert edition:");
		array[2] = scan.nextLine();
		System.out.println("Insert pages:");
		array[5] = scan.nextLine();
		
		return array;
	}

	public static void main(String[] args){
		Book onebook = new Book(menu());
		System.out.println(onebook.getData());

	}
}
