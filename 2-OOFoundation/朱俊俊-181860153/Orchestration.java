public class Orchestration {
    /**老爷爷手动地比较葫芦娃的大小，并使用排序方法进行排序
     * 此处使用冒泡排序，可以更换为其他排序方法
     */
    static void sort(Hulu[] hulus) {
        int n = hulus.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (hulus[j].getIndex() > hulus[j + 1].getIndex()) {
                    Hulu tmp = hulus[j];
                    hulus[j] = hulus[j + 1];
                    hulus[j + 1] = tmp;
                }
            }
        }
    }
}
