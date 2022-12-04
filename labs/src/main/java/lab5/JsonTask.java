package lab5;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class JsonTask {
    public static void main(String[] args) {
        WaterStorageModel waterStorage = new WaterStorageModel("test12","Lviv","23.42413","32.4213");

        String waterStorageJson = waterStorage.asJson().toString();
        System.out.println(waterStorageJson);
        System.out.println(waterStorage.parseJsonFromString(waterStorage.getClass(),waterStorageJson));
    }
}
