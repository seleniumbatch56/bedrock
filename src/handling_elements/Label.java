package handling_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Label {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Batch 56\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		
		WebElement facebookLabel = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]"));
		
		System.out.println("Facebook Label is displayed: "+facebookLabel.isDisplayed());
		
		System.out.println("The Label is: "+ facebookLabel.getText());
		
		String font_family = facebookLabel.getCssValue("font-family");
		
		String font_size = facebookLabel.getCssValue("font-size");
		
		String font_weight = facebookLabel.getCssValue("font-weight");
		
		String line_height = facebookLabel.getCssValue("line-height");
		
		String width = facebookLabel.getCssValue("width");
		
		String color = facebookLabel.getCssValue("color");
		
		String bg_color = facebookLabel.getCssValue("bg-color");
		
		System.out.println("font_family: "+font_family);
		
		System.out.println("font_size: "+font_size);
		
		System.out.println("font_weight: "+font_weight);
		
		System.out.println("line_height: "+line_height);
		
		System.out.println("width: "+width);
		
		System.out.println("color"+ color);
		
		System.out.println("bg_color"+ bg_color);

	}

}
