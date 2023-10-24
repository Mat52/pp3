import java.util.Random;

public class Mathematics {

        public static void main(String[] args) {
            System.out.println(theLargerOfTwoNumbers(34, 49));
            System.out.println(returnPi());
            System.out.println(absoluteNumber(-17));
            System.out.println(squareRootOfExpression(9,2));
            System.out.println(randomNumber());
            System.out.println(integerRandom(0,10));
            System.out.println(Sinus(90));

        }
        static int theLargerOfTwoNumbers(int a, int b){
            return Math.max(a,b);
        }
        static double returnPi (){
            return Math.PI;
        }
        static int absoluteNumber (int a){
            return Math.abs(a);
        }
        static double squareRootOfExpression (double a, double b){
            double c;
            c = a/b;
            return Math.sqrt(c);
        }
        static double randomNumber (){
            Random random = new Random();
            return random.nextFloat();
        }

        static int integerRandom (int a, int b) {
            int randomNum = (int)(Math.random() * b+1);
            return randomNum;
        }
        static double Sinus(double degree){
            return Math.sin(degree);
            
        }
}


