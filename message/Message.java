package Final.message;
 
 public abstract class Message{
 	private String msg;

 	public Message(){}

 	public Message(String msg){
 		this.msg = msg;
 	}
 	public void setMsg(String msg){
 		this.msg = msg;
 	}
 	public String getMsg(){
 		return msg;
 	}
 	public abstract void showMsg();
 }
