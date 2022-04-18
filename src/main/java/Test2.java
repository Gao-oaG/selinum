import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //get 到百度首页
        driver.get("https://www.baidu.com/");
        String baiduHandle = driver.getWindowHandle();
        System.out.printf("now accesss %s \n", driver.getCurrentUrl());
        Thread.sleep(2000);

        //点击“新闻” 链接
        driver.findElement(By.linkText("新闻")).click();
        System.out.printf("now accesss %s \n", driver.getCurrentUrl());
        Thread.sleep(2000);
//        Set<String> windowHandles = driver.getWindowHandles();
//        for(String string : windowHandles){
//            System.out.println(string);
//            if(string!=baiduHandle){
//                //进行窗口切换
//                driver.switchTo().window(string);
//            }
//        }

        //执行浏览器后退
        driver.navigate().back();
        System.out.printf("back to %s \n", driver.getCurrentUrl());
        Thread.sleep(2000);

        //执行浏览器前面
        driver.navigate().forward();
        System.out.printf("forward to %s \n", driver.getCurrentUrl());
        Thread.sleep(2000);
        driver.navigate().refresh();

//        driver.quit();






    }
}
