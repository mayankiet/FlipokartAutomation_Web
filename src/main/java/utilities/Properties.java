package utilities;

public class Properties {

    private static final ConfigReader propertiesReader = new ConfigReader();
    public static final String baseUrl = propertiesReader.getBaseUrl();
}
