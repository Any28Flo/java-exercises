import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Proporciona el autor");
        String author = sc.nextLine();

        System.out.println("Proporciona el titulo");
        String title = sc.nextLine();
        System.out.println(title + " fue escrito por " + author);


    }
}
