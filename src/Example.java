import org.intellij.lang.annotations.Pattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class Example {


    public static void main(String[] args) throws Exception {
        FileInputStream file = new FileInputStream("D:\\ExProp\\resources\\error-messages.properties");
        Properties properties = new Properties();
        properties.load(file);


        String name = properties.getProperty("invalid.name");
        String password = properties.getProperty("invalid.password");

        System.out.println(name);
        System.out.println(password);
    }

}
