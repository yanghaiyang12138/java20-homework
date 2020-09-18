public class HuLuWa {
    enum HuluColor {
        RED, ORANGE, YELLOW, GREEN, CYAN, BLUE, PURPUL
    }
    int rank;
    HuluColor color;
    public HuLuWa(int rank, HuluColor color) {
        this.rank = rank;
        this.color = color;
    }

    public boolean compareRank(HuLuWa hulu) {
        return hulu.rank < rank;
    }
}