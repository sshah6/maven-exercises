import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class ApacheComTest {
    public static void main(String[] args) {

        System.out.println("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        boolean isNumber = StringUtils.isNumeric(input);
        System.out.println("You entered " + "\"" + input + "\"");
        if(isNumber){
            System.out.println("\"" + input + "\"" + " is a number.");
        }else{
            System.out.println("\"" + input + "\"" + " is not a number.");
        }

        String output = StringUtils.swapCase(input);
        System.out.println("Flipped Case: " + output);

        output = StringUtils.reverse(input);
        System.out.println("Reversed: " + output);
    }
}
