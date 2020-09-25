package Final.member;

public class BloodDonor{
	private String bName;
	private String bGroup;
	 public BloodDonor(){}
	 public BloodDonor(String bName,String bGroup){
	 	this.bName = bName;
	 	this.bGroup = bGroup;
	 }
	 public void setBName(String bName){
	 	this.bName = bName;
	 }
	 public void setBGroup(String bGroup){
	 	this.bGroup = bGroup;
	 }
	 public String getBName(){
	 	return bName;
	 }
	 public String getBGroup(){
	 	return bGroup;
	 }
	 public String toString(){
	 	return "name :"+bName+" , bGroup :"+bGroup;
	 }
}