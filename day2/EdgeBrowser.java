package week1.day2;

public class EdgeBrowser {
	public static void main(String[] args) {
		Browser TS =new Browser();
		String Browsername=TS.launchBrowser("EdgeBrowser");
		System.out.println(Browsername);
		TS.LoadUrl();
		
	}

}
