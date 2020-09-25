package Final.message;

public class ThankYouMessage extends Message{
	public ThankYouMessage(){}

	public ThankYouMessage(String tm){
		super(tm);
	}
	public void showMsg(){
        System.out.println("----------");
		System.out.println(super.getMsg());
		System.out.println("----------");
	}
}