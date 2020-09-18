public class Ground{//可容纳一个葫芦娃的位置
    private HuLuWa hulu;
    boolean isEmpty;
    public Ground(HuLuWa h){
        hulu=h;
        isEmpty=false;
    }
    public Ground(){
        hulu=null;
        isEmpty=true;
    }
    public HuLuWa leave(){
        if (isEmpty)
            return null;
        isEmpty=true;
        return hulu;
    }
    public boolean enter(HuLuWa h){
        if (!isEmpty)
            return false;
        isEmpty=false;
        hulu=h;
        return true;
    }
    public HuLuWa getHulu(){
        if (isEmpty)
            return null;
        return hulu;
    }
    public static void swap(Ground ga,Ground gb)
    {
        HuLuWa a;
        HuLuWa b;
        if(ga.isEmpty)
            if(gb.isEmpty)
                return;
            else{
                b=gb.leave();
                ga.enter(b);
            }
        else if(gb.isEmpty){
            a=ga.leave();
            gb.enter(a);
        }
        else{
            a=ga.leave();
            b=gb.leave();
            ga.enter(b);
            gb.enter(a);
        }
    }
}