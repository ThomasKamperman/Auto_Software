package Utils.Settings;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException; 


public class SettingsReader {
  
  

    public SettingsReader()
    {

    }

    public String read()
    {
        String data = "Unkown";

        try
        {
            File file = new File("Utils\\Settings\\settings.set");
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                data = reader.nextLine();
                System.out.println(data);

            }
            reader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return data;
    }
   
    public void parse()
    {

    }

}
