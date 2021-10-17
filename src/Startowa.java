import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Startowa {
    public static void main(String[] args) throws IOException {
       Database db = new Database();
       GUI gui = new GUI();
       while(true){
           gui.showMenu();
           BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
           String choose = reader.readLine();
           /*switch(choose){
               case "1":
                   for (Produkt produkt : db.)
           }*/
       }
    }
}
