package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String textLine;

        while (scanner.hasNextLine()) {
            textLine = scanner.nextLine();
            if (textLine.toLowerCase().contains(args[0].toLowerCase())) {
                System.out.print(textLine + "\n"); }
            if (scanner.nextLine().isEmpty()){
                scanner.close();
                break;
            }
        }
    }
}

