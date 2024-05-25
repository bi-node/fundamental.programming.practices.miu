import java.util.Scanner;

public class SwitchStatements {
	public static void main(String[] args) {
		System.out.println("Enter you choice! between 1 to 5: ");
		Scanner scanner=new Scanner(System.in);
		int choice=scanner.nextInt();
		switch(choice) {
		case  1:
					System.out.println("A+");
					break;
		case 2:
					System.out.println("A");
					break;
		case 3: 
					System.out.println("B+");
					break;
		case 4: 
					System.out.println("B");
					break;
		case 5: 
					System.out.println("C+");
					break;
		default:
					System.out.println("Failed");
			
		}
		scanner.close();
		
	}

}
