package auto_it;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FileUploadType1 extends Base{

	@Test
	public void fileUploadDemo() throws InterruptedException {
		
		WebElement fileUploadButton = driver.findElement(By.id("file-upload"));
		Thread.sleep(3000);
		fileUploadButton.sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Penguins.jpg");
		
		Thread.sleep(8000);
	}
}
