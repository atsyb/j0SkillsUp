package home.work2;

public class Calculation {
    void calculateRootsByDiscriminant(int memberA, int memberB, int memberC) {
        double discriminant = (Math.pow(memberB, 2) - 4 * memberA * memberC);
        System.out.println("D = " + (discriminant));
        if (discriminant > 0) {
            System.out.println("x1 = " + (-memberB - Math.sqrt(discriminant)) / (2 * memberA));
            System.out.println("x2 = " + (-memberB + Math.sqrt(discriminant)) / (2 * memberA));
        } else if (discriminant == 0) {
            System.out.println("x = " + (-memberB / (2 * memberA)));
        } else {
            System.out.println("Equation has no real roots!");
        }
    }

    String calculateRootsByVietTheorem(int memberP, int memberQ) {
        String result = "!not picked up the roots!";
        int root1;
        int root2 = -Math.abs(memberP);
        for (int numberForSelectionX1 = -Math.abs(memberP); numberForSelectionX1 < Math.abs(memberP) + 1; numberForSelectionX1++) {
            root1 = numberForSelectionX1;
            if (root1 * root2 == memberQ & root1 + root2 == -memberP) {
                result = "x1 = " + root1 + "\n" + "x2 = " + root2;
                break;
            } else {
                for (int numberForSelectionX2 = -Math.abs(memberP); numberForSelectionX2 < Math.abs(memberP) + 1; numberForSelectionX2++) {
                    root2 = numberForSelectionX2;
                    if (root1 * root2 == memberQ & root1 + root2 == -memberP) {
                        result = "x1 = " + root1 + "\n" + "x2 = " + root2;
                        break;
                    }
                }
            }
        }
        return result;
    }

    int printFibonacciSeries(int memberNumber) {
        if (memberNumber == 0) {
            return 0;
        } else if (memberNumber == 1) {
            return 1;
        } else return printFibonacciSeries(memberNumber - 1) + printFibonacciSeries(memberNumber - 2);
    }

    void printMultiplicationTable() {
        int firstNumber, secondNumber;
        for (firstNumber = 1; firstNumber < 11; firstNumber++){
            for (secondNumber = 1; secondNumber < 11; secondNumber++) {
                System.out.printf("%2d *%2d=%2d  ",firstNumber,secondNumber, firstNumber * secondNumber);
            }
            System.out.printf("\n");
        }
    }

    void drawHerringbone(int count) {
        for (int numberI = 0; numberI < count; ++numberI) {
            for (int numberJ = 0; numberJ < numberI; ++numberJ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void drawHerringboneBack(int count) {
        for (int numberIBack = 0; numberIBack < count; ++numberIBack) {
            for (int numberJBack = 0; numberJBack < count - numberIBack; ++numberJBack) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    String displayTimeOfDay(int hour) {
        String result = "";
        switch (hour) {
            case 22:
            case 23:
            case 24:
            case 1:
            case 2:
            case 3: {
                result = "Good night";
                break;
            }
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11: {
                result = "Good morning";
                break;
            }
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18: {
                result = "Good day";
                break;
            }
            case 19:
            case 20:
            case 21: {
                result = "Good evening";
                break;
            }
            default: {
                result = "ERROE hour!";
            }
        }
        return result;
    }

    void PrintOddNumbers(int fromNumber, int toNumber) {
        for (int i = fromNumber; i <= toNumber; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    void PrintEvenNumbers(int fromNumber, int toNumber) {
        for (int i = fromNumber; i <= toNumber; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

}

