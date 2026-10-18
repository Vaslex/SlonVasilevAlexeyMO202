import java.util.Scanner;

public class Main {
 public static void main(String args[]) {
  Slon slon = new Slon();
  System.out.println(slon.greetings());
  Scanner scanner = new Scanner(System.in);
  while (true) {
   String line = scanner.nextLine();
   if (slon.isExit(line)) {
    return;
   }
   if (!line.isEmpty()) {
    System.out.println();
   }
   System.out.println(slon.respond(line));
  }
 }
}