package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String textLine;
        List<String> validArgs = new LinkedList<>();
        System.out.println("To exit press Ctrl+D");
         boolean overlap = false;
        for(String i:args){
            if (!i.isEmpty() && !i.equals(" ") ){
                validArgs.add(i);
            }
        }

        if (validArgs.size() == 0){
            System.out.println("there is no arguments to work with. Bye!");
            return;
        }

        while (scanner.hasNextLine()) {
            textLine = scanner.nextLine().trim();
            System.out.print("Overlapping arguments: ");
            for(String vArgs:validArgs) {
                if (textLine.toLowerCase().contains(vArgs.toLowerCase().trim())) {
                    overlap = true;
                    System.out.print(vArgs+"| ");
                }
            }
            if(overlap){
                System.out.println("\n"+textLine);
            }else System.out.println("none");

        }
    }
}

