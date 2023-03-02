package less3;

public class Volume {

    public static void main(String[] args) {

        double v, s, r, h;
        r = 10;
        h = 15;
        v = Math.PI * Math.pow(r, 2) * h;
        s = 2 * Math.PI * r * (r + h);
        System.out.println("V: " + v + "\n" + "S:" + s + "");


    }
}
