import java.io.*;
public class ExceptionHandling {
    public static void main(String[] args){
            try {
                FileReader fr = new FileReader("notes.txt");
                fr.read();
            } catch (Exception e) {
                System.out.println("Caught Exception: " + e);
            }
        }


}
