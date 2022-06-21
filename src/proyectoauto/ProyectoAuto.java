/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoauto;
 import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
         
         
         
public class ProyectoAuto {
    
    private static WebDriver driver = null;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLANK\\Desktop\\Proyecto de Automatizacion\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver ();
        driver.manage().window().maximize();
        driver.get("http://www.google.com/");    
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Swag Labs");     
        searchBox.submit();
        Thread.sleep(1500);
        driver.navigate().to("https://www.saucedemo.com");
        Thread.sleep(1500);
        driver.findElement(By.name("user-name")).sendKeys("Pedrito");
        Thread.sleep(1500);
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        Thread.sleep(1500);
        driver.findElement(By.name("login-button")).click();
        Thread.sleep(1500);
        driver.findElement(By.className("inventory_item_name")).click();
        Thread.sleep(1500);
        driver.findElement(By.name("back-to-products")).click();
        Thread.sleep(1500);
        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(1500);
        driver.findElement(By.id("logout_sidebar_link")).click();
        Thread.sleep(1500);
        driver.quit();
        


//        driver.navigate().to("http://automationpractice.com/");
//        driver.manage().window().maximize();
//        driver.findElement(By.className("login")).click();
//        driver.findElement(By.name("email_create")).sendKeys("suculento@gmail.com");
//        driver.findElement(By.name("SubmitCreate")).click();
//        driver.findElement(By.id("id_gender1")).click();
//        driver.findElement(By.className("radio active")).click();
        
//        driver.findElement(By.id("id_gender2")).isSelected();

        
//        driver.findElement(By.className("a.login")).click();
//        WebElement Busqueda = driver.findElement(By.name("a.login")).click();
//        Busqueda.sendKeys("");     
//        Busqueda.submit();
        
        

        String appTitle= driver.getTitle();
        
        System.out.println("Titulo de Aplicacion"+appTitle);
        
    }
    
}
