package Final.file;
 
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import Final.message.Message;
import Final.message.SuccessfulMessage;
import Final.message.ErrorMessage;
import Final.operation.BasicOperation;
import Final.member.Member;
import Final.member.BloodDonor;
import java.util.InputMismatchException;


public class BloodFileOperation extends BloodFile {
	public BloodFileOperation(){
		//super(new File("C:/Users/Ahnaf Ahmed/Desktop/oop 1/Final Project/Final/file/mamber.txt"));
        super(new File("C:/Users/Ahnaf Ahmed/Desktop/oop 1/Final Project/Final/file/bloodDonor.txt"));
		
	}
	public void showAllBD(){
	    FileReader fr = null;
    	BufferedReader br = null;

    	try{
    		fr = new FileReader(super.getBFile());
    		br = new BufferedReader(fr);

    		String line = "";
    		System.out.println("All Blood Donor Data :");
    		System.out.println("--------------");
    		while((line = br.readLine()) !=null){
    		     System.out.println(line);
            }
            System.out.println();
    	}catch(IOException io){
              new ErrorMessage("IOException occurred while reading member.txt file").showMsg();
    	}
    	finally{
    		try{
    			fr.close();
    		}catch(IOException io){
    		new ErrorMessage("IOException occurred while closing employee.txt file").showMsg();	

    		}
    		try {
    			br.close();
    		}catch(IOException io){
    			new ErrorMessage("IOException occurred while closing employee.txt file").showMsg();
    			
    		}
    	}
    }

		public void bloodDonor(BloodDonor bm){
    
        if(!super.exists()) {
            try {
                super.getBFile().createNewFile();
            }
            catch(IOException io) {
                new ErrorMessage("IOException occurred while creating bloodDonor.txt file");
            }
        }

        FileWriter fw = null;
         try{
             fw = new FileWriter(super.getBFile(), true);
             fw.write(bm.getBName()+" "+bm.getBGroup()+"\n");
             new SuccessfulMessage("Successful").showMsg();
         }catch(IOException io){
            //new ErrorMessage("Error");
                 new ErrorMessage("IOException occurred while writing member.txt file").showMsg();
         }
         finally{
              try{
                fw.close();
              }
              catch(IOException io){
                new ErrorMessage("Error when closing member.txt file").showMsg();
              }
         }
     }
 }