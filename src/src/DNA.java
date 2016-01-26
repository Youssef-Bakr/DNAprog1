import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * Created by David on 1/26/2016.
 */
public class DNA {

        public DNA(){
        }

        public static void main(String []args){
           System.out.println("Hello World!");
            findDiff();
        }

        public static void findDiff()
        {
            String fileName = "test.txt";
            String line = null;

            try{
                FileReader fileReader = new FileReader(fileName);

                BufferedReader bufferedReader = new BufferedReader(fileReader);

                while((line = bufferedReader.readLine()) != null){
                    System.out.println(line);
                }
            }
            catch(FileNotFoundException ex)
            {
                System.out.println("Unable to open file");
            }
            catch(IOException ex)
            {
                System.out.println("Error reading file");
            }
        }

    }
