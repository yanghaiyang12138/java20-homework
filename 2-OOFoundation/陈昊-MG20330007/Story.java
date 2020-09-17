import java.util.Scanner;

public class Story {
    private SortStrategy strategy;
    private GrandFather gfather;

    public Story() {
        gfather = new GrandFather();
        System.out.println("Init queue: ");
        gfather.echo();
        System.out.println();
    }

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void start() {
        this.strategy.sort(gfather);
        System.out.println();
        System.out.println("After sort: ");
        gfather.echo();
    }

    public static void main(String[] args) {
        var story = new Story();
        Scanner scanner = new Scanner(System.in);
        int opt;
        SortStrategy strategy;
        boolean redo = true;
        while (redo) {
            System.out.println("What strategy you want to use in sort process?");
            System.out.println("[1]: Orchestration");
            System.out.println("[2]: CalabashBrother");
            opt = scanner.nextInt();
            switch (opt) {
                case 1:
                    strategy = new Orchestration();
                    redo = false;
                    story.setStrategy(strategy);
                    break;
                case 2:
                    strategy = new Choreography();
                    redo = false;
                    story.setStrategy(strategy);
                    break;
                default:
                    System.out.println("Please enter legal input!");
                    System.out.println();
                    break;
            }
        }
        story.start();
    }
}
