package week1.day2;

public class EdgeBrowser 
{

	public static void main(String[] args) 
		{
		Browser br = new Browser();
		String browserName = br.launchBrowser("Edge");
		System.out.println(browserName);
		br.loadUrl();
		}

}
