package Utilities;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class ConfigReader {
    //configuration.properties'ı dosya olarak sisteme gösterp key göndeeceğiz bize karşılığını getirecek.

    public static Properties properties;
    static {
        String dosyaYolu= "src/test/config.properties";
        try{
            FileInputStream fis=new FileInputStream(dosyaYolu); // fis dosyayolu tanımladğımız dosyayı okudu.
            properties=new Properties();
            properties.load(fis);//fisin okuduğu bilgiler propertiese eklenir.

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String getProperty(String key){
        //test metodundan yolladığımız string key değerini alıp properties classından getProperty metodunu kullanarak bu keye ait valuei bize getirdi.
        return properties.getProperty(key);
    }
    public String getBrowser() {
        return properties.getProperty("browser");
    }
    public String getUrl(){
        return properties.getProperty("url");
    }
    public String getEposta(){
        return properties.getProperty("eposta");
    }
    public String getSifre(){
        return properties.getProperty("sifre");
    }
    public String getExpected(){
        return properties.getProperty("expected");
    }


}
