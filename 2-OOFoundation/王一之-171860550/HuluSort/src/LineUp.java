import java.util.Random;
public class LineUp {
    public static void sortChoreography(Ground []g) {//协作
        boolean flag=false;
        while(!flag){//若进行了位置交换则继续
            flag=true;
            for(int i = 0; i <g.length-1; ++i){//每个身后有人的葫芦娃看自己是否需要和身后交换位置
                if(g[i].getHulu().compareRank(g[i+1].getHulu())){
                    flag=false;
                    Ground.swap(g[i],g[i+1]);//交换位置
                }
            }
        }
    }
    public static void sortOrchestration(Ground []g) {//指挥
        for (int i = 1; i < g.length; ++i)
            for (int j = 0; j < g.length - i; ++j) {
                if (g[j].getHulu().rank<g[j+1].getHulu().rank) {
                    Ground.swap(g[j],g[j+1]);
                }
            }
    }
    public static void randomInit(Ground []g,HuLuWa[]h) {
        if (h.length!=g.length)
            return;//error
        int len=g.length;
        int[] array=new int[len];
        for (int i = 0; i < len; ++i) {
            array[i] = 0;
        }
        int pos;
        Random r = new Random();
        for (int i = 0; i < len; ++i) {//生成随机序列
            do{
                pos = r.nextInt(len-1);
            }while (array[pos] != 0);
            array[pos] = i;
        }

        for (int i = 0; i < len; ++i) {//用该序列初始化位置
            g[i]=new Ground(h[array[i]]);
        }
    }

    public static void printHulu(Ground []g) {
        for (Ground ground : g) {
            if (!ground.isEmpty)
                System.out.println(ground.getHulu().rank);
            else
                System.out.println("此处为空");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Ground []grounds = new Ground[7];//生成7块空地

        HuLuWa[] hulu = new HuLuWa[7];
        hulu[0] = new HuLuWa(1, HuLuWa.HuluColor.RED);
        hulu[1] = new HuLuWa(2, HuLuWa.HuluColor.ORANGE);
        hulu[2] = new HuLuWa(3, HuLuWa.HuluColor.YELLOW);
        hulu[3] = new HuLuWa(4, HuLuWa.HuluColor.GREEN);
        hulu[4] = new HuLuWa(5, HuLuWa.HuluColor.CYAN);
        hulu[5] = new HuLuWa(6, HuLuWa.HuluColor.BLUE);
        hulu[6] = new HuLuWa(7, HuLuWa.HuluColor.PURPUL);

        randomInit(grounds,hulu);
        System.out.println("init:");
        printHulu(grounds);

        sortOrchestration(grounds);
        System.out.println("after Orchestration:");
        printHulu(grounds);

        sortChoreography(grounds);
        System.out.println("after Choreography:");
        printHulu(grounds);

    }

}