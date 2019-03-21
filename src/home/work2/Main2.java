package home.work2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("__SkillsUp:HomeWork2__\n");
        Scanner scanner = new Scanner(System.in);
        Calculation calc = new Calculation();
/*
        System.out.println("   Exercise #1 Calculate the roots of a square trinomial of the form:\n   ax^2+bx+c=0 (ByDiscriminant)");
        System.out.println("Enter a:");
        int numberA = scanner.nextInt();
        System.out.println("Enter b:");
        int numberB = scanner.nextInt();
        System.out.println("Enter c:");
        int numberC = scanner.nextInt();
        System.out.println("Result:");
        calc.calculateRootsByDiscriminant(numberA, numberB, numberC);
        System.out.println();

        System.out.println("   Exercise #2 Calculate the roots of a square trinomial of the form:\n   x2+px+q=0 (ByVietTheorem)");
        System.out.println(calc.calculateRootsByVietTheorem(-14, 40));

        System.out.println("   Exercise #3 Print a series of Fibonacci numbers");
        for (int i = 1; i < 10; i++) {
            System.out.println(calc.printFibonacciSeries(i));
        }

        System.out.println("   Exercise #4 Print a multiplication table");
        calc.printMultiplicationTable();

        System.out.println("   Exercise #5 Draw herringbone");
        calc.drawHerringbone(10);

        System.out.println("   Exercise #6 Draw herringbone Back");
        calc.drawHerringboneBack(10);

        System.out.println("   Exercise #7 Display time of day");
        System.out.println("how many hours is it now?");
        int numberHour = scanner.nextInt();
        System.out.println(calc.displayTimeOfDay(numberHour));

        System.out.println("   Exercise #8 Lottery ticket");
        {
            int randomNumber = (int) (Math.random() * 20) + 1;
            System.out.println("The lottery ticket dropped the number: " + randomNumber);
            do {
                System.out.print("Guess the number: ");
            } while (scanner.nextInt() != randomNumber);
            System.out.print("Victory!");
        }

        System.out.println("   Exercise #9 Odd numbers in the specified range");
        System.out.println("Enter range from");
        System.out.print("from: ");
        int numberFrom = scanner.nextInt();
        System.out.print("to: ");
        int numberTo = scanner.nextInt();
        calc.PrintOddNumbers(numberFrom, numberTo);

        System.out.println("   Exercise #10 Even numbers in the specified range");
        calc.PrintEvenNumbers(numberFrom, numberTo);
*/
        calc.printMultiplicationTable();

    }
}
