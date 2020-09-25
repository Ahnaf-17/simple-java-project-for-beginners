package Final.message;

public class SuccessfulMessage extends Message{
	public SuccessfulMessage(){}

	public SuccessfulMessage(String sm){
		super(sm);
	}
	public void showMsg(){
		System.out.println("..........................");
		System.out.println(super.getMsg());
		System.out.println("..........................");
	}
}