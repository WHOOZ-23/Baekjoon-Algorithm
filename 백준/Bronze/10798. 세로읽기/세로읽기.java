import java.util.Scanner;

public class Main {

	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		
		char[][] arr = new char[5][15];
		
		for(int i=0; i<5; i++) {
			String str = scanner.next();
			for(int j=0; j<str.length(); j++) {
				arr[i][j] = str.charAt(j);			
			}
		}
		
		for(int j=0; j<15; j++) {
			for(int i=0; i<5; i++) {
				if(arr[i][j] != '\0') {
					System.out.print(arr[i][j]);
				}
			}
		}
		scanner.close();
	}
}