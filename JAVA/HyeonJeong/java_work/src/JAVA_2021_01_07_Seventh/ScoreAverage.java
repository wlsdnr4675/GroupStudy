package JAVA_2021_01_07_Seventh;

public class ScoreAverage {
    public static void main(String[] args) {
        final int ARRSIZE = 20;
        final int ARRSIZE2 = 30;
        int[] scores = new int[ARRSIZE];
        int sum = 0;

        for(int i =0; i < ARRSIZE; i++) {
            scores[i] = (int)(Math.random() * 101);
            sum += scores[i];
        }

        System.out.printf("3반의 평균은 = % d\n", sum/ARRSIZE);

        sum = 0;
        int[] scores2 = new int[ARRSIZE2];

        for(int i = 0; i < ARRSIZE2; i++) {
            scores2[i] = (int)(Math.random() * 101);
            sum += scores2[i];
        }

    }
}
