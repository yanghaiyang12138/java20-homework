public class Choreography {
    /**葫芦娃根据自己的大小，一个个站到自己应该的位置上
     */
    static void sort(Hulu[] hulus) {
        Hulu[] newhulus = new Hulu[hulus.length];
        for (Hulu hulu : hulus) {
            hulu.selfSort(newhulus);
        }
        for (int i = 0; i < hulus.length; i++) {
            hulus[i] = newhulus[i];
        }
    }
}
