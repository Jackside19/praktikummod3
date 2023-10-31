public class Ljajargenjang {
    public static int alas,tinggi;


    /**
     * @param argAlas
     * @param argTinggi
     * @return
     */
    public static int keliling(int argAlas,int argTinggi){
        return argAlas * argTinggi;
    }
    public static void main(String[] args) {
        alas = 8;
        tinggi =5;
        System.out.println("Luas Jajar Genjang adalah : " + keliling(alas,tinggi));
    }
}