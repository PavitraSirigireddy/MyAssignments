package week1Assignments;

public class Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser b= new Browser();
		b.launchBrowser("Browser launched successfully");
		b.loadUrl();
	}
	
	public void launchBrowser(String browserName)
	{
		System.out.println(browserName);
	}
	
	public void loadUrl()
	{
		System.out.println("Application url loaded successfully");
	}

	}


