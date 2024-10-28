package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Error: Command missing!");
            System.exit(1);
        }

        switch (args[0]) {
            case "init":
                ShitRepository sr = new ShitRepository(System.getProperty("user.dir"), false);
                break;
            default:
                System.out.println("Error: Invalid Command!");
                System.exit(1);
        }
    }
}