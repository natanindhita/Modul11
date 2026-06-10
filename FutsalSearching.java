import java.util.*;

public class FutsalSearching {

    public static void main(String[] args) {

        ArrayList<int[]> timA = new ArrayList<>();
        timA.add(new int[]{168, 50}); timA.add(new int[]{170, 60});
        timA.add(new int[]{165, 56}); timA.add(new int[]{168, 55});
        timA.add(new int[]{172, 60}); timA.add(new int[]{170, 70});
        timA.add(new int[]{169, 66}); timA.add(new int[]{165, 56});
        timA.add(new int[]{171, 72}); timA.add(new int[]{166, 56});

        ArrayList<int[]> timB = new ArrayList<>();
        timB.add(new int[]{170, 66}); timB.add(new int[]{167, 60});
        timB.add(new int[]{165, 59}); timB.add(new int[]{166, 58});
        timB.add(new int[]{168, 58}); timB.add(new int[]{175, 71});
        timB.add(new int[]{172, 68}); timB.add(new int[]{171, 68});
        timB.add(new int[]{168, 65}); timB.add(new int[]{169, 60});

        ArrayList<Integer> tinggiBList = new ArrayList<>();
        for (int[] p : timB) tinggiBList.add(p[0]);

        int freqTinggi168B = Collections.frequency(tinggiBList, 168);
        int freqTinggi160B = Collections.frequency(tinggiBList, 160);

        System.out.println("=== Tim B: Frekuensi Tinggi Badan ===");
        System.out.println("Pemain dengan tinggi 168 cm : " + freqTinggi168B + " orang");
        System.out.println("Pemain dengan tinggi 160 cm : " + freqTinggi160B + " orang");

        ArrayList<Integer> beratAList = new ArrayList<>();
        for (int[] p : timA) beratAList.add(p[1]);

        int freqBerat56A = Collections.frequency(beratAList, 56);
        int freqBerat53A = Collections.frequency(beratAList, 53);

        System.out.println("\n=== Tim A: Frekuensi Berat Badan ===");
        System.out.println("Pemain dengan berat 56 kg : " + freqBerat56A + " orang");
        System.out.println("Pemain dengan berat 53 kg : " + freqBerat53A + " orang");

        ArrayList<Integer> tinggiAList = new ArrayList<>();
        for (int[] p : timA) tinggiAList.add(p[0]);

        ArrayList<Integer> beratBList = new ArrayList<>();
        for (int[] p : timB) beratBList.add(p[1]);

        boolean tinggiBerbeda = Collections.disjoint(tinggiAList, tinggiBList);
        boolean beratBerbeda  = Collections.disjoint(beratAList, beratBList);

        System.out.println("\n=== Perbandingan Tim A dan Tim B ===");
        System.out.println("Ada pemain dengan Tinggi Badan yang sama? "
            + (tinggiBerbeda ? "Tidak ada" : "Ada"));
        System.out.println("Ada pemain dengan Berat Badan yang sama? "
            + (beratBerbeda ? "Tidak ada" : "Ada"));
    }
}
