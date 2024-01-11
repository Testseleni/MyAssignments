package week1.day2;

public class Browser {

	public String launchBrowser(String browserName) {
		System.out.println("Browser launched successfully");
		return browserName ;
		
	}
	public void LoadUrl()
	{
		System.out.println("Application url loaded successfully");
	}

public static void main(String[] args) {
	Browser ST =new Browser();
	String Browsername=ST.launchBrowser("Firfox");
	System.out.println(Browsername);
	ST.LoadUrl();
	
}

}

