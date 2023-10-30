public class KlJjajarg {
    public static int alas,tinggi;


    public static int keliling(int argAlas,int argTinggi){
        return argAlas * argTinggi;
    }
    public static void main(String[] args) {
        alas = 8;
        tinggi =5;
        System.out.println("Luas Jajar Genjang adalah : " + keliling(alas,tinggi));
    }
}