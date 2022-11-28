
package actionclass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class pgm1 {

	public void click(WebDriver driver, WebElement ele) 
	{

		Actions act = new Actions(driver);
		act.moveToElement(ele).click().build().perform();
	}

	public boolean selectBySendkeys(String value,WebElement ele) {
			boolean flag = false;
			try {
				ele.sendKeys(value);
				flag = true;
				return true;
			} catch (Exception e) {

				return false;
			} finally {
				if (flag) {
					System.out.println("Select value from the DropDown");		
				} else {
					System.out.println("Not Selected value from the DropDown");
					// throw new ElementNotFoundException("", "", "")
				}
			}
		}

	public boolean moveToElement(WebDriver driver, WebElement ele) {
			boolean flag = false;
			try {
				// WebElement element = driver.findElement(locator);
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("arguments[0].scrollIntoView(true);", ele);
				Actions actions = new Actions(driver);
				// actions.moveToElement(driver.findElement(locator)).build().perform();
				actions.moveToElement(ele).build().perform();
				flag = true;
			} catch (Exception e) {
				e.printStackTrace();
			}
			return flag;
		}

	public static void selectByVisibleText(String size1, WebElement size) {
		// TODO Auto-generated method stub

	}
}
