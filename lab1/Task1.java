public class Task1 {

    public static double FindPercent(int a, int b, int alpha, int beta){
        if((alpha > a && alpha > b && beta > a && beta > b) || (alpha < a && alpha < b && beta < a && beta < b)){
            System.out.println("case 1: не належать один одному");
            return 0;
        } else if (a == alpha && b == beta) {
            System.out.println("case 2: [a,b] належить в [alpha,beta]");
            return 100;
        } else if (alpha > a && beta < b) {
            System.out.println("case 3: [alpha,beta] лежить в [a,b]");
            return (double)(beta - alpha) *100/(b - a);
        } else if (alpha > a && alpha < b && beta >= b) {
            System.out.println("case 4: частина [alpha,beta] лежить в [a,b]");
            return (double)(b - alpha)*100/(b-a);
        } else if (alpha <= a && alpha < b && beta > a && beta < b) {
            System.out.println("case 5: частина [alpha,beta] лежить в [a,b]");
            return (double) (beta - a)*100/(b-a);
        } else if (alpha < a && alpha < b && beta > a && beta > b) {
            System.out.println("case 6: [a,b] лежить в [alpha,beta]");
            return 100;
        } else{
            System.out.println("case 7: відрізок точка ");
            return 100;
        }
    }



    public static void main(String[] args) {

        int a, b, alpha, beta;

        a = (int)(Math.random() * 30) - 2;
        b = (int)(Math.random() * 30) - 2 + a;
        alpha = (int)(Math.random() * 30) - 2;
        beta = (int)(Math.random() * 30) - 2 + alpha;
//        a = 22;
//        b = 20;
//        alpha = 20;
//        beta = 20;

        System.out.println("a " + a);
        System.out.println("b " + b);
        System.out.println("alpha " + alpha);
        System.out.println("beta " + beta);

        System.out.println(FindPercent(a,b,alpha,beta));
    }

}
