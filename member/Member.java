package Final.member;

public class Member{
	private int id;
	private String name;
	 public Member(){}
	 public Member(int id,String name){
	 	this.id = id;
	 	this.name = name;
	 }
	 public void setID(int id){
	 	this.id = id;
	 }
	 public void setName(String name){
	 	this.name = name;
	 }
	 public int getID(){
	 	return id;
	 }
	 public String getName(){
	 	return name;
	 }
	 public String toString(){
	 	return "id :"+id+" , name :"+name;
	 }
}