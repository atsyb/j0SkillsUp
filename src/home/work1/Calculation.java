package home.work1;

class Calculation {

    void calculateByDiscriminant (double a, double b, double c) {
        double D = b*b-4*a*c;
            System.out.println("x1 = " + (-b-Math.sqrt(D))/(2*a) );
            System.out.println("x2 = " + (-b+Math.sqrt(D))/(2*a) );
    }
    String calculateByVietTheorem(double p, double q) {
        return "x1= " + (-p+Math.sqrt(p*p-4*q))/2 + "\n" +
                "x2= " + (-p-Math.sqrt(p*p-4*q))/2;
    }
    double calculateByAreaCircle (double r) {
        return Math.PI*r*r;
    }
    double calculateByCircumference(double r) {
        return Math.PI*r*2;
    }
    void calculateByHypotenuse(double k1, double k2) {
        System.out.println("Cathetus1="+k1);
        System.out.println("Cathetus2="+k2);
        System.out.println("Hypotenuse="+Math.sqrt(k1*k1+k2*k2));
    }

}
