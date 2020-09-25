package Final;


import Final.layout.footer.Footer;
import Final.layout.header.Header;
import Final.layout.menu.Menu;
import Final.operation.MemberOperation;
import Final.message.WelcomeMessage;
import Final.message.ThankYouMessage;
import Final.operation.BloodOperation;
import Final.message.Message;

public class Main{
	 public static void main(String[] args) {

		Message welcome = new WelcomeMessage("Welcome to youngstar social organization");
		Header h = new Header();
		Menu m = new Menu();
		Footer f = new Footer();
		Message thankYou = new ThankYouMessage("Thank's for visit");
		welcome.showMsg();
		boolean exit = false;
		while(!exit){
			h.showHeader();
			m.createMenu(new String[]{"1 : Member", "2 : Blood Donor" , "3 : Exit"});
			int choice = f.showFooter();
			
			switch (choice){
				case 1:
				     h.showHeader("Member");
				     m.createMenu(new String[]{"1 : Add member","2 : Search Member","3 : Show All Member","4 : Go Back"});
				     choice = f.showFooter();
				     MemberOperation mo = null;
				     switch(choice){
				     	case 1:
				     	     mo = new MemberOperation();
				     	     mo.create();
				     	     break;
				     	case 2:
				     	     mo = new MemberOperation();
				     	     mo.search();
				     	     break;
				     	case 3:
				     	     mo = new MemberOperation();
				     	     mo.showAll();
				     	     break;
				     	case 4:
				     	     break; 
				     	default:
				     	     System.out.println("Invalid Input") ;       
				     }
				     break;

				case 2: 
        			h.showHeader("Blood donor");
        			m.createMenu(new String[]{"1 : Add donor" ,"2 : show all blood donor", "3 : Go back"});
        			choice = f.showFooter();
        			BloodOperation mob = null;
        			switch(choice){
        			    case 1:
				     	   mob = new BloodOperation();
				     	   mob.createB();
        			       break;
        			    case 2:
        			       mob = new BloodOperation();
        			       mob.showAllBD();
        			       break;   
        			    case 3:
				     	  break; 
				     default:
				     	     System.out.println("Invalid Input") ;       
				     }
				 break;
        		case 3: 
        			exit = true;
        			break;
        		default: 
        			System.out.println("Invalid Option Selected");     

			}
		}
		thankYou.showMsg();
	}
}

