import  org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Images {
    private String password;
    private String num;
    private String baseurl;

    public String getBaseurl() {
        return baseurl;
    }



    public void setPassword(String password) {
        this.password = password;
    }

    public void setUser(String num) {
        this.num = num;
    }

    public String finder(String user) {
//public  static  void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\2\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/" + user);

        try {
            driver.findElement(By.id("email")).sendKeys(user);
            driver.findElement(By.id("pass")).sendKeys(password);
            WebElement e = driver.findElement(By.cssSelector("input[value=\"התחבר/י\"]"));
            e.sendKeys(Keys.ENTER);
            System.out.println("succeed");
        } catch (Exception e) {
            try {
                Thread.sleep(9000);
            } catch (InterruptedException ex) {
                System.out.println("failed");
            }
        }
        try {
            Thread.sleep(19000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        baseurl="https://scontent.ftlv16-1.fna.fbcdn.net/v/t39.30808-1/289259039_5448926578480468_3460710400282640409_n.jpg?stp=dst-jpg_p200x200&_nc_cat=102&ccb=1-7&_nc_sid=7206a8&_nc_ohc=i1mywD3ShnEAX-TYMab&_nc_ht=scontent.ftlv16-1.fna&oh=00_AT8jMjTmAEJWdqcdZZqQaQZKNQyliZh-g0b8vnaUZ3vUcQ&oe=62C28434";
        driver.get(baseurl);

        try (InputStream in=new URL(baseurl).openStream()){
            String path="C:\\Users\\User\\Desktop\\myImage.jpg";
            if(!(new File(path).exists()))
                Files.copy(in, Paths.get(path));

        } catch (IOException e) {
            e.printStackTrace();
        }

        //try {
        //     File file=new File("C:\\Users\\User\\Desktop\\profile image\\imag.jpg");
//        if (file.exists()) {
//            System.out.println("ok");
        //     BufferedImage bufferedImage= ImageIO.read(file);

//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        return user;
    }
    //0544987232
    //0c72741b
}


