package pages;

import java.beans.IntrospectionException;
import java.security.PublicKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//li[@name='home']")
	WebElement home;
	
	@FindBy( xpath = "//li[@id='class_note']" )
	WebElement deshboard;

	@FindBy(name = "logo-link")
	WebElement logo;

	@FindBy(xpath = "//li[@name ='about us'and @ id='about us']")
	WebElement aboutUs;

	@FindBy(xpath = "//li[@id='alumni'and@name='alumni']")
	WebElement alumni;

	@FindBy(xpath = "//li[@id='mentors' and @name='mentors']")
	WebElement mentors;

	@FindBy(xpath = "//li[@id='courses' and @name='courses']")
	WebElement courses;
	
	@FindBy(xpath = "//li[@id='selenium']")
	WebElement selenium;
	
	@FindBy(xpath = "//li[@id='students']")
	WebElement students;
	
	@FindBy(xpath = "//li[@name='gallery']")
	WebElement gallery;

	public void clicklogo() throws InterruptedException {

		Thread.sleep(3000);
		logo.click();
		// Thread.sleep(3000);
		// logo.click();
	}
	public void clickhome()throws InterruptedException {
		Thread.sleep(4000);
		home.click();
	}
	
	public void clickdashdoard()throws InterruptedException {
		Thread.sleep(3000);
		deshboard.click();
	}

	public void clickaboutUs() throws InterruptedException{
Thread.sleep(4000);
		aboutUs.click();
	}

	public void clickalumni()throws InterruptedException {
		Thread.sleep(4000);
		alumni.click();

	}

	public void clickmentors()throws InterruptedException {
		Thread.sleep(4000);
		mentors.click();
	}

	public void clickcourses()throws InterruptedException {
		Thread.sleep(4000);
		courses.click();
	}
	public void clickselenium() throws InterruptedException{
		Thread.sleep(4000);
		selenium.click();
	}
	public void clickstudent() throws InterruptedException{
		Thread.sleep(4000);
		students.click();
	}
	public void clickgallery() throws InterruptedException {
		Thread.sleep(4000);
		gallery.click();
	}
}
