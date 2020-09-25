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


public class MemberFileOperation extends FileOperation {
	public MemberFileOperation(){
		super(new File("C:/Users/Ahnaf Ahmed/Desktop/oop 1/Final Project/Final/file/mamber.txt"));
        //super(new File("C:/Users/Ahnaf Ahmed/Desktop/oop 1/Final Project/Final/file/bloodDonor.txt"));
		
	}
	public void insert(Member m){
		if(!super.exists()) {
			try {
				super.getFile().createNewFile();
			}
			catch(IOException io) {
				new ErrorMessage("IOException occurred while creating member.txt file");
			}
		}

		FileWriter fw = null;
		 try{
             fw = new FileWriter(super.getFile(), true);
             fw.write(m.getID()+" "+m.getName()+"\n");
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

    public void find(){


        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter member name :");
       //String name = scanner1.name;
        String name = scanner1.next();
         String line ="" ;
         try{
           File file = new File("C:/Users/Ahnaf Ahmed/Desktop/oop 1/Final Project/Final/file/mamber.txt");

           Scanner scanner = new Scanner(file);
           while(scanner.hasNextLine()){
                line = scanner.nextLine();
            
                if(line.endsWith(name))
                System.out.println("Member found : "+line);
            
           }
               // break;
           scanner.close();

         }catch(IOException ex){
            new ErrorMessage("");
        }
         
    }

    public void showAll(){
    	FileReader fr = null;
    	BufferedReader br = null;

    	try{
    		fr = new FileReader(super.getFile());
    		br = new BufferedReader(fr);

    		String line = "";
    		System.out.println("All Member Data :");
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

    

    /*public void bloodDonor(BloodDonor bm){
    //File file = new File("C:/Users/Ahnaf Ahmed/Desktop/oop 1/Final Project/Final/file/bloodDonor.txt");
        //super(new File("C:/Users/Ahnaf Ahmed/Desktop/oop 1/Final Project/Final/file/bloodDonor.txt"));
       //public void insert(Member bm){
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
    }*/
    



}
