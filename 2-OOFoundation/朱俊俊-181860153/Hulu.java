public class Hulu {
    static String[] str = new String[]{"老大", "老二", "老三", "老四", "老五", "老六", "老七"};
    int index;

    Hulu(int i) {
        index = i;
    }

    int getIndex() {
        return index;
    }

    String getName() {
        return str[index];
    }

    void selfSort(Hulu[] hulus) {
        hulus[index] = this;
    }

    void countOff() {
        System.out.print(this.getName() + " ");
    }
}
