import java.io.PrintWriter;

public class HelloWorld {
  public static void main (String[] args) {
    PrintWriter pen = new PrintWriter(System.out, true);
    pen.println ("Hello, mother!");
    pen.flush();
    pen.close();
  } // main(String[])

}// HelloWorld
