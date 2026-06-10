import java.util.*;

public class FutsalSorting {

    public static void main(String[] args) {

        // Data Tim A: {tinggi, berat}
        int[][] dataA = {
            {168, 50}, {170, 60}, {165, 56}, {168, 55}, {172, 60},
            {170, 70}, {169, 66}, {165, 56}, {171, 72}, {166, 56}
        };

        // Data Tim B: {tinggi, berat}
        int[][] dataB = {
            {170, 66}, {167, 60}, {165, 59}, {166, 58}, {168, 58},
            {175, 71}, {172, 68}, {171, 68}, {168, 65}, {169, 60}
        };

        // Gabungkan semua pemain dari kedua tim
        List<int[]> semuaPemain = new ArrayList<>();
        for (int[] p : dataA) semuaPemain.add(p);
        for (int[] p : dataB) semuaPemain.add(p);

        // ── a. Urutkan berdasarkan Tinggi Badan ──────────────────────────

        // Ascending
        List<int[]> sortTinggiAsc = new ArrayList<>(semuaPemain);
        Collections.sort(sortTinggiAsc, (a, b) -> a[0] - b[0]);
        System.out.println("=== Urutan Tinggi Badan ASCENDING ===");
        for (int[] p : sortTinggiAsc)
            System.out.println("Tinggi: " + p[0] + " cm, Berat: " + p[1] + " kg");

        // Descending
        List<int[]> sortTinggiDesc = new ArrayList<>(semuaPemain);
        Collections.sort(sortTinggiDesc, (a, b) -> b[0] - a[0]);
        System.out.println("\n=== Urutan Tinggi Badan DESCENDING ===");
        for (int[] p : sortTinggiDesc)
            System.out.println("Tinggi: " + p[0] + " cm, Berat: " + p[1] + " kg");

        // ── b. Urutkan berdasarkan Berat Badan ──────────────────────────

        // Ascending
        List<int[]> sortBeratAsc = new ArrayList<>(semuaPemain);
        Collections.sort(sortBeratAsc, (a, b) -> a[1] - b[1]);
        System.out.println("\n=== Urutan Berat Badan ASCENDING ===");
        for (int[] p : sortBeratAsc)
            System.out.println("Tinggi: " + p[0] + " cm, Berat: " + p[1] + " kg");

        // Descending
        List<int[]> sortBeratDesc = new ArrayList<>(semuaPemain);
        Collections.sort(sortBeratDesc, (a, b) -> b[1] - a[1]);
        System.out.println("\n=== Urutan Berat Badan DESCENDING ===");
        for (int[] p : sortBeratDesc)
            System.out.println("Tinggi: " + p[0] + " cm, Berat: " + p[1] + " kg");

        // ── c. Max dan Min Tinggi & Berat per Tim ───────────────────────

        List<int[]> timA = new ArrayList<>(Arrays.asList(dataA));
        List<int[]> timB = new ArrayList<>(Arrays.asList(dataB));

        int[] maxTinggiA = Collections.max(timA, (a, b) -> a[0] - b[0]);
        int[] minTinggiA = Collections.min(timA, (a, b) -> a[0] - b[0]);
        int[] maxBeratA  = Collections.max(timA, (a, b) -> a[1] - b[1]);
        int[] minBeratA  = Collections.min(timA, (a, b) -> a[1] - b[1]);

        System.out.println("\n=== Max & Min Tim A ===");
        System.out.println("Tinggi Badan Maksimum : " + maxTinggiA[0] + " cm");
        System.out.println("Tinggi Badan Minimum  : " + minTinggiA[0] + " cm");
        System.out.println("Berat Badan Maksimum  : " + maxBeratA[1]  + " kg");
        System.out.println("Berat Badan Minimum   : " + minBeratA[1]  + " kg");

        int[] maxTinggiB = Collections.max(timB, (a, b) -> a[0] - b[0]);
        int[] minTinggiB = Collections.min(timB, (a, b) -> a[0] - b[0]);
        int[] maxBeratB  = Collections.max(timB, (a, b) -> a[1] - b[1]);
        int[] minBeratB  = Collections.min(timB, (a, b) -> a[1] - b[1]);

        System.out.println("\n=== Max & Min Tim B ===");
        System.out.println("Tinggi Badan Maksimum : " + maxTinggiB[0] + " cm");
        System.out.println("Tinggi Badan Minimum  : " + minTinggiB[0] + " cm");
        System.out.println("Berat Badan Maksimum  : " + maxBeratB[1]  + " kg");
        System.out.println("Berat Badan Minimum   : " + minBeratB[1]  + " kg");

        // ── d. Copy Tim B ke Tim C ───────────────────────────────────────

        // Buat Tim C dengan ukuran sama dengan Tim B
        int[][] arrayC = new int[timB.size()][2];
        List<int[]> timC = new ArrayList<>(Arrays.asList(arrayC));
        Collections.copy(timC, timB);

        System.out.println("\n=== Tim C (hasil copy dari Tim B) ===");
        for (int[] p : timC)
            System.out.println("Tinggi: " + p[0] + " cm, Berat: " + p[1] + " kg");
    }
}