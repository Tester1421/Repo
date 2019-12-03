package Repohome;
import static java.lang.Math.sqrt;
public class Repohome {
        static double teglatestterfogata(int a, int b, int c)
        {
        return a*b*c;
        }
        static double teglatestfelszine(int a, int b, int c)
        {
        return 2*(a*b+a*c+b*c);
        }
        static double testatlo(int a, int b, int c)
        {
            return sqrt(a*a+b*b+c*c);
        }
    public static void main(String[] args) {
        System.out.println(Repohome.teglatestfelszine(5, 5, 5));
        System.out.println(Repohome.testatlo(5, 5, 5));
        System.out.println(Repohome.teglatestterfogata(5, 5, 5));
    }
    
}
