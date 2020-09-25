package Final.operation;

import Final.member.Member;
import Final.member.BloodDonor;
import java.util.Scanner;
import Final.file.FileOperation;
import Final.file.MemberFileOperation;
//import Final.file.BloodFileOperation;
import java.io.File;

public class  MemberOperation implements BasicOperation{
	public void create(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter member id :");
		int id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter member name :");
		String name = scanner.nextLine();	
		Member m = new Member(id, name);		
		MemberFileOperation mfo = new MemberFileOperation();
		mfo.insert(m);
	}
	public void search(){
		
		MemberFileOperation mfo = new MemberFileOperation();
		mfo.find();
	}
	public void showAll(){
		MemberFileOperation mfo = new MemberFileOperation();
		mfo.showAll();
	}
	public void createB(){}
	public void showAllBD(){}

	/*public void createB(){
		Scanner blood = new Scanner(System.in);
		System.out.println("Enter blood donor's name :");
		String bName = blood.nextLine();
		blood.nextLine();
		System.out.println("Enter blood group :");
		String bGroup = blood.nextLine();
		BloodDonor bm = new BloodDonor(bName , bGroup);
		BloodFileOperation mfo = new BloodFileOperation();
		mfo.bloodDonor(bm);
	}*/
}