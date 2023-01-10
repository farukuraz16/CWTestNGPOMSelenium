package clarusway.test;

import clarusway.utilities.ConfigReader;
import clarusway.utilities.Driver;
import org.testng.annotations.Test;

public class Day01_C02_ConfigReader {

    @Test
    public void readConfig(){

        Driver.getDriver().get(ConfigReader.getProperty("google_url"));//config.properties dosyasından dataları alıyor

        Driver.closeDriver();

    }
}
