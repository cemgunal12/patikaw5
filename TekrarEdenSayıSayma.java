public class TekrarEdenSayıSayma {
    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] frekanslar = new int[dizi.length];

        for (int i = 0; i < dizi.length; i++) {
            int eleman = dizi[i];
            int frekans = 1;
            for (int j = i+1; j < dizi.length; j++) {
                if (dizi[j] == eleman) {
                    frekans++;
                }
            }
            if (frekanslar[i] == 0) {
                System.out.println(eleman + " sayısı " + frekans + " kere tekrar edildi.");
            }
            frekanslar[i] = frekans;
        }
    }
}
