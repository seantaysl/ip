import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Duke {
    static String border = "____________________________________________________________\n";

    public static boolean checkBye(String s) {
        if(s.equals("bye")) {
            System.out.println(border + "Bye. Hope to see you again soon!\n" + border);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(border + "Hello! I'm Duke\n" + "What can I do for you?\n" + border);

        Scanner scan = new Scanner(System.in);

        List<String> storage = new ArrayList<>();

        while(scan.hasNext()) {
            String input = scan.nextLine();
            if(checkBye(input)) {
                return;
            } else if(input.equals("list")) {
                int listLen = storage.size();
                System.out.println(border.replace("\n", ""));
                for(int i = 1; i <= listLen; i++) {
                    System.out.println(i + ". " + storage.get(i - 1));
                }
                System.out.println(border);
            } else {
                storage.add(input);
                System.out.println(border + "added: " + input + "\n" + border);
            }
        }
    }
}
