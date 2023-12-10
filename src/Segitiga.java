public class Segitiga extends BangunDatar{

    float alas;
    float tinggi;

    @Override
    float luas() {
        double luas = 0.5 * (alas * tinggi);
        System.out.println("Luas Segitiga: " + luas);
        return (float) luas;
    }
}
