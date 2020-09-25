package Final.file;
import java.io.IOException;
import Final.operation.BasicOperation;
import java.io.File;

public abstract class BloodFile{
	File bfile;


	public BloodFile(){}
	public BloodFile(File bfile){
		this.bfile = bfile;
	}
	public void setBFile(File bfile){
		this.bfile = bfile;
	}
	public File getBFile(){
		return bfile;
	}
	public boolean exists(){
        return bfile.exists();
	}
}