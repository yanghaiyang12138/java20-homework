import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GrandFather {
    int childrenNum = 7;
    CalabashBrother[] children;
    ArrayList<CalabashBrother> queue;
    final String[] nicknames = {"老大", "老二", "老三", "老四", "老五", "老六", "老七"};

    public GrandFather() {
        children = new CalabashBrother[childrenNum];
        queue = new ArrayList<>();
        for (int i = 0; i < this.childrenNum; i++) {
            var brother = new CalabashBrother(nicknames[i], i);
            children[i] = brother;
            queue.add(brother);
        }
        Collections.shuffle(this.queue);
    }

    public void instruct() {
        System.out.println("Grand-father said: You should all stand in the order when you were born!");
        for (int i = 0; i < this.childrenNum; i++) {
            queue.set(i, children[i]);
        }
    }

    public void echo() {
        for (var brother : queue) {
            brother.report();
        }
    }
}
