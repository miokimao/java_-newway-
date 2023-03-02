package less3;

public class HomeWorkless3a {
    public static void main(String[] args) {

        int x = 10, y = 12, z = 3;

        x += y - x++ * z; // -8 (10 + 12 - 10 * 3) = 22 - 30 = -8
        System.out.println(x);
        z = --x - y * 5; // -69 (-9 - 12*5) = -9 - 60 = -69
        System.out.println(z);
        y /= x + 5 % z; // -3 ( 12 / (-9 + 5%-69)) = 12 / (-9 + 5) = 12/-4 = -3
        System.out.println(y);
        z = x++ + y * 5; // -24 ( -9 + -3*5) = -9 + -15 = -24
        System.out.println(z);
        x = y - x++ * z; // -195 ( -3 - -8 * -24 ) = -3 - 192 = -195
        System.out.println(x);

    }
}
