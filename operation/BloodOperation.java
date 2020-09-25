package Final.operation;

import Final.member.Member;
import Final.member.BloodDonor;
import java.util.Scanner;
import Final.file.FileOperation;
//import Final.file.MemberFileOperation;
import Final.file.BloodFileOperation;
import java.io.File;

public class BloodOperation implements BasicOperation{
	public void create(){}
	public void search(){}
	public void showAll(){}
public void createB(){
		Scanner blood = new Scanner(System.in);
		System.out.println("Enter blood donor's name :");
		String bName = blood.nextLine();
		//blood.nextLine();
		System.out.println("Enter blood group :");
		String bGroup = blood.nextLine();
		BloodDonor bm = new BloodDonor(bName , bGroup);
		BloodFileOperation mob = new BloodFileOperation();
		mob.bloodDonor(bm);
	}



	public void showAllBD(){
		BloodFileOperation mob = new BloodFileOperation();
		mob.showAllBD();
	
	}
}