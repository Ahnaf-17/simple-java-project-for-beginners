package Final.message;

public class ErrorMessage extends Message {
	public ErrorMessage() {}

	public ErrorMessage(String em) {
		super(em);
	}
	public void showMsg() {
		System.out.println("*******************");
		System.out.println(super.getMsg());
		System.out.println("*******************");
	}
}