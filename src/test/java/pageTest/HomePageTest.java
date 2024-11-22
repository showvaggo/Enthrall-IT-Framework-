package pageTest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {
	
	
	@Test
	
	public void clickLogoTest() throws InterruptedException {
		homePage.clicklogo();
		
	}
	@Test
	public void clickhomeTest() throws InterruptedException {
		homePage.clickhome();
	}
	@Test
	public void clickdashboardTest() throws InterruptedException{
		homePage.clickdashdoard();
	}
	@Test
	public void clickaboutUsTest()throws InterruptedException {
		homePage.clickaboutUs();
	}
	@Test
	public void clickalumniTest()throws InterruptedException {
		homePage.clickalumni();
	}
	@Test
	public void clickmentorsTest() throws InterruptedException{
		homePage.clickmentors();
	}
	@Test
	public void clickcoursesTest()throws InterruptedException {
		homePage.clickcourses();
	}
	@Test
	public void clickseleniumTest() throws InterruptedException{
		homePage.clickselenium();
		
	}
	@Test
	public void clickstudentsTest()throws InterruptedException {
		homePage.clickstudent();
	}
	@Test
	public void clickgalleryTest()throws InterruptedException {
		homePage.clickgallery();
	}
	

}
