package Final.layout.footer;

import java.util.Scanner;

public class Footer{

	public Footer(){}
	public int showFooter(){
		boolean isValiedInput = false;
		int i = 0;
		System.out.println();
		while(!isValiedInput) {
			System.out.print("Choose your option :");
			Scanner scanner = new Scanner(System.in);
			try{
				i = scanner.nextInt();
				isValiedInput = true;

			}catch(Exception e){
                 System.out.println("sorry...invalide input !!!");
                 isValiedInput = false;
			}
		}
		System.out.println();
		return i;
	}
}