import org.ini4j.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void startThisShit() {
        String filePath = System.getProperty("user.dir") + "/passwordSettings.ini";
        Ini aRead = new Ini();
        try {
            aRead.load( new FileReader(filePath));
            String login = aRead.get("data", "login", String.class);
            String password = aRead.get("data", "password", String.class);
            System.out.println(login + " + " + password);
        } catch (IOException e) {
            System.err.println("Coś nie tak");
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args){
        startThisShit();

        Scanner s = new Scanner(System.in);
        System.out.println("Press enter to close.....\n");
        s.nextLine();
        System.exit(0);
    }
}