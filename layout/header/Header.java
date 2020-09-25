package Final.layout.header;

public class Header{
public  Header(){}
public void showHeader(){
        System.out.println("MyApp");
		System.out.println();
	}

	public void showHeader(String pageTitle) {
		System.out.println("MyApp: " + pageTitle);
		System.out.println();
	}
}