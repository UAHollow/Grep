package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String textLine;
        int counter = 0;
        for(String i:args){
            if (i.isEmpty()){
                counter += 1;
            }
        }

        if (counter == args.length){
            System.out.println("there is no arguments to work with");
            return;
        }

        while (scanner.hasNextLine()) {
            textLine = scanner.nextLine();
            for(String i:args) {
                if (i.isEmpty() || i.equals(" ")){
                    continue;
                }
                if (textLine.toLowerCase().contains(i.toLowerCase())) {
                    System.out.print(textLine + "\n");
                }
            }
        }
    }
}

