public class Main {
    public static void main(String[] args) {
        PlayGround playGround = new PlayGround();
        System.out.println("Now Hulu Sort !!");
        playGround.sortHuluBaby(HuluSorter.SortMode.ORCHESTRATION);
        playGround.hulusGreeting();
    }
}
