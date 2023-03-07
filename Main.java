import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) throws FileNotFoundException {
    ArrayList<String> arrayList = new ArrayList<>();
    FileReader fr = new FileReader("names.txt");
    Scanner fileScanner = new Scanner(fr);
    Scanner input = new Scanner(System.in);
    
    int choice = 0;
    while (choice != 5) {
      System.out.println("Press 1 to learn about salary."+ "\n" +"Press 2 to learn about the job."+ "\n" +"Press 3 to learn about demand."+ "\n" +"Press 4 to view current students."+ "\n" +"Press 5 to quit.");
      
      choice = input.nextInt();
      switch (choice) {
        case 1:
          System.out.println("$98,345 average salary in South Florida!");
          break;
        case 2:
          System.out.println("US News - 100 Best Jobs!");
          break;
        case 3:
          System.out.println("Top 10 Forbes In-Demand Jobs!");
          break;
        case 4:
          System.out.println("Current Students:" + "\n");
          while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            System.out.println(line);
          }
          break;
        case 5:
          break;
        default:
          System.out.println("Invalid choice.");
          break;
      }
    }
    input.close();
    fileScanner.close();
  }  
}