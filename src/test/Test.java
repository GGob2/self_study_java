package test;

public class Test {
    public static void main(String[] args) {
        int a = 12, b = 5, sum = 2;
        b *= a /= 4;
        System.out.println(b + "*****" + a);
        int test = ++a * b--;
        System.out.println(test);
        sum += ++a * b-- / 4;
        System.out.printf("%d", sum);
        System.out.println("\n" + a  +"+++"+ b);
    }
}
