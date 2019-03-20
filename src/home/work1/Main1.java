package home.work1;

public class Main1 {
    public static void main(String[] args){
        System.out.println("__SkillsUp:HomeWork1__");
        Calculation calc = new Calculation();

        System.out.println("  1) 3х^2 - 4x + 1 = 0");
        calc.calculateByDiscriminant(3,-4,1);

        System.out.println("  2) х^2 + 8x + 15 = 0 (without cycle)\n   x1+x2 = -8; x1*x2 = 15  :: -5 -3");
        System.out.println(calc.calculateByVietTheorem(8,15));

        double radius = 3;
        System.out.println("  3) Area of a circle with a radius="+radius+" :\n"+calc.calculateByAreaCircle(radius));

        System.out.println("  4) Circumference with radius="+radius+" :\n"+calc.calculateByCircumference(radius));

        System.out.println("  5) Right triangle:");
        calc.calculateByHypotenuse(5,12);
    }
}