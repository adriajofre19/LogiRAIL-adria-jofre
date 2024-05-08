// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class BotonescalculadoraTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() throws MalformedURLException {
    driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void botonescalculadora() {
    driver.get("http://localhost:8181/");
    driver.manage().window().setSize(new Dimension(1178, 814));
    driver.findElement(By.linkText("Calculadora")).click();
    assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("Calculadora"));
    driver.findElement(By.cssSelector(".btnDigito:nth-child(8)")).click();
    driver.findElement(By.cssSelector(".btnDigito:nth-child(7)")).click();
    driver.findElement(By.cssSelector(".btnDigito:nth-child(6)")).click();
    driver.findElement(By.cssSelector(".btnDigito:nth-child(12)")).click();
    driver.findElement(By.cssSelector(".btnDigito:nth-child(11)")).click();
    driver.findElement(By.cssSelector(".btnDigito:nth-child(10)")).click();
    driver.findElement(By.cssSelector(".btnDigito:nth-child(16)")).click();
    driver.findElement(By.cssSelector(".btnDigito:nth-child(15)")).click();
    driver.findElement(By.cssSelector(".btnDigito:nth-child(14)")).click();
    driver.findElement(By.cssSelector(".btnDigito:nth-child(19)")).click();
    assertThat(driver.findElement(By.id("txtPantalla")).getText(), is("9876543210"));
    driver.findElement(By.cssSelector(".btnDigito:nth-child(18)")).click();
    assertThat(driver.findElement(By.id("txtPantalla")).getText(), is("-9876543210"));
    driver.findElement(By.cssSelector(".btnDigito:nth-child(18)")).click();
    assertThat(driver.findElement(By.id("txtPantalla")).getText(), is("9876543210"));
    driver.findElement(By.cssSelector(".btnDigito:nth-child(20)")).click();
    driver.findElement(By.cssSelector(".btnDigito:nth-child(19)")).click();
    assertThat(driver.findElement(By.id("txtPantalla")).getText(), is("9876543210,0"));
    driver.findElement(By.id("btnBorrar")).click();
    driver.findElement(By.id("btnBorrar")).click();
    driver.findElement(By.id("btnBorrar")).click();
    driver.findElement(By.id("btnBorrar")).click();
    driver.findElement(By.id("btnBorrar")).click();
    assertThat(driver.findElement(By.id("txtPantalla")).getText(), is("9876543"));
    driver.findElement(By.id("btnIniciar")).click();
    assertThat(driver.findElement(By.id("txtPantalla")).getText(), is("0"));
  }
}
