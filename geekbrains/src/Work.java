

public class Work {

        int a = 4;
        short b = 3;
        byte c = 127;
        long d = 5695869689l;
        float e = 12.454f;
        double r = 85659.4;
        char t = 'c';
        boolean isTrue = true;

        public static float operation(float a, float b, float c, float d) {
            float result = a * (b + c/d);
            return result;
        }
        public static boolean trueOderFalse(int x, int y) {
            int result = x + y;
            if(result>=10 && result<=20) return true;

            else return false;
        }
        public static void printNumber(int x) {
            if(x>=0) System.out.println("положительное");

            else System.out.println("отрицательное");
        }
        public static boolean anotherPrint(int x) {
            if(x<0) return true;
            else return false;
        }
        public static void printName(String name) {
            System.out.println("Привет, " + name);
        }
        public static void year(int year) {
            if((year%4==0 || year%400==0) && !(year%100==0)) System.out.println("високосный");
            else System.out.println("не високосный");
        }

        public static void main(String[] args) {
            System.out.println(trueOderFalse(1, 5));
            printNumber(0);
            System.out.println(anotherPrint(23));
            printName("Слава");
            year(2020);
        }

    }

