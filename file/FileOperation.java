package Final.file;
import java.io.IOException;
import Final.operation.BasicOperation;
import java.io.File;

public abstract class FileOperation{
	File file;


	public FileOperation(){}
	public FileOperation(File file){
		this.file = file;
	}
	public void setFile(File file){
		this.file = file;
	}
	public File getFile(){
		return file;
	}
	public boolean exists(){
        return file.exists();
	}
}