public class HuluwaSort {
    static class Huluwa{
        private int order;//葫芦娃排名

        Huluwa(int order) {
            this.order = order;
        }

        void setOrder(int order){this.order = order;}
        int getOrder(){return this.order;}

        //报数
        void number(){
            switch (this.order){
                case 1:
                    System.out.print("老大 ");
                    break;
                case 2:
                    System.out.print("老二 ");
                    break;
                case 3:
                    System.out.print("老三 ");
                    break;
                case 4:
                    System.out.print("老四 ");
                    break;
                case 5:
                    System.out.print("老五 ");
                    break;
                case 6:
                    System.out.print("老六 ");
                    break;
                case 7:
                    System.out.print("老七 ");
                    break;
                default:
            }
        }

        boolean compare(Huluwa huluwa) {
            return this.order < huluwa.getOrder();
        }

        void swap(Huluwa huluwa) {
            int temp = huluwa.getOrder();
            huluwa.setOrder(this.order);
            this.setOrder(temp);
        }
    }

    static void orchestration(Huluwa[] queue) {
        Huluwa[] newqueue = new Huluwa[7];
        for (Huluwa huluwa : queue) {
            int order = huluwa.getOrder();
            newqueue[order - 1] = huluwa;
        }

        for (Huluwa huluwa : newqueue) {
            huluwa.number();
        }
    }

    static void choreography(Huluwa[] queue) {
        int length = queue.length;

        //bubble sort
        for (int i = 0;i < length-1;i++){
            for (int j = 0;j < length-i-1;j++){
                if (queue[j+1].compare(queue[j])){
                    queue[j].swap(queue[j+1]);
                }
            }
        }

        for (Huluwa huluwa : queue) {
            huluwa.number();
        }
    }

    public static void main(String[] args) {
        int[] number = {3,6,7,5,2,4,1}; //随意站队
        Huluwa[] queue = new Huluwa[7];
        for (int i = 0;i < 7;i++){
            queue[i] = new Huluwa(number[i]);
        }

        orchestration(queue);
        System.out.println("");
        choreography(queue);
    }
}
