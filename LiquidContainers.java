
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container = new Container();


        while (true) {
            System.out.println(container.toString());

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] split = input.split(" ");
            String command = split[0];
            int amount = Integer.parseInt(split[1]);
            System.out.println("");
            if(command.equals("add")){
            container.add(amount);
            } else if(command.equals("move")){
            container.move(amount);
            } else if(command.equals("remove")){
                container.remove(amount);
            }
        }
    }
}
