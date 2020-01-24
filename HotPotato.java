import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      String childNames = readChildNames(scanner);
      String[] splitChildren = childNames.split("\\s+");
      int tossessToRemoveOn = readN(scanner);
      int currentRound = 1;
      ArrayDeque<String> queue = new ArrayDeque<>(Arrays.asList(splitChildren));

      while (queue.size() > 1) {
          String currentChild = queue.poll();
          if (currentRound % tossessToRemoveOn != 0) {
            queue.offer(currentChild);
          } else {
              System.out.println("Removed " + currentChild);
          }
          currentRound++;
      }

        System.out.println("Last is " + queue.poll());


}

    private static int readN(Scanner scanner) {
        return scanner.nextInt();
    }

    private static String readChildNames(Scanner scanner) {
        return scanner.nextLine();
    }
}
