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
        for (int x1 = -Math.abs(memberP); x1 < Math.abs(memberP) + 1; x1++) {
            root1 = x1;
            if (root1 * root2 == memberQ & root1 + root2 == -memberP) {
                result = "x1 = " + root1 + "\n" + "x2 = " + root2;
                break;
            } else {
                for (int x2 = -Math.abs(memberP); x2 < Math.abs(memberP) + 1; x2++) {
                    root2 = x2;
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
        int i, j;
        System.out.printf("   │");
        for (i = 1; i < 11; i++)
            System.out.printf("%2d ", i);
        System.out.printf("\n───┼——————————————————\n");
        for (i = 1; i < 11; i++) {
            System.out.printf("%2d │", i);
            for (j = 1; j < 11; j++)
                System.out.printf("%2d ", i * j);
            System.out.printf("\n");
        }
    }

    void drawHerringbone(int count) {
        for (int i = 0; i < count; ++i) {
            for (int j = 0; j < i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void drawHerringboneBack(int count) {
        for (int i = 0; i < count; ++i) {
            for (int j = 0; j < count - i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    String displayTimeOfDay(int hour) {
        String result = "";
        switch (hour) {
            case 22: case 23: case 24: case 1: case 2: case 3: {
                result = "Good night";
                break;
            }
            case 4: case 5: case 6: case 7: case 8: case 9: case 10: case 11: {
                result = "Good morning";
                break;
            }
            case 12: case 13: case 14:case 15: case 16: case 17: case 18: {
                result = "Good day";
                break;
            }
            case 19: case 20: case 21: {
                result = "Good evening";
                break;
            }
            default: {
                result = "ERROE hour!";
            }
        }
        return result;
    }

}

