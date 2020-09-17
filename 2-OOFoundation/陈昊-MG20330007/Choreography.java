import java.util.ArrayList;

public class Choreography implements SortStrategy {
    @Override
    public void sort(GrandFather f) {
        f.queue.sort((b1, b2) -> b1.compareTo(b2));
    }
}
