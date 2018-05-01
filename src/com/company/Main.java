package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("To exit press Ctrl+D");
        String trimmedArg;
        List<String> validArgs = new LinkedList<>();
        for(String unvalidatedArgs:args){
            trimmedArg = unvalidatedArgs.trim();
            if (!trimmedArg.isEmpty()){
                validArgs.add(trimmedArg);
            }
        }

        if (validArgs.size() == 0){
            System.out.println("there is no arguments to work with. Bye!");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        String textLine;
        while (scanner.hasNextLine()) {
            textLine = scanner.nextLine();
            for(String vArgs:validArgs) {
                if (textLine.toLowerCase().contains(vArgs.toLowerCase())) {
                    System.out.println(textLine);
                    break;
                }
            }
        }
    }
}

