import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner("d 1 o 2 g 3 c 7 t");
        int count = 0;
        while(s.hasNext())
        {
          if (count % 2 == 1)
              System.out.print(s.next() + " ");
          else
              s.next();
          count++;
        }
}
