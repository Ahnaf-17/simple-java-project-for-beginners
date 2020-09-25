package Final.message;

public class WelcomeMessage extends Message{
	public WelcomeMessage(){}

	public WelcomeMessage(String wm){
		super(wm);
	}
	public void showMsg(){
		System.out.println("------------");
		System.out.println(super.getMsg());
		System.out.println("------------");
	}
}