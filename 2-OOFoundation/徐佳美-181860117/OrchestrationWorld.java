

public class OrchestrationWorld{
public static void main(String[] args) {
        Grandpa grandpa = new Grandpa();
        Calabash grandsons[] = grandpa.createCalabash();
        grandpa.randLine(Calabash[] grandsons);
        grandpa.report(grandsons);
        grandpa.bubbleSort(Calabash[] grandsons);
        grandpa.report(grandsons);

    }
};

class Calabash {

    String name;
    int age;

    Calabash(String inName, int inAge){
        name=inName;
        age=inAge;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void sayName(){
        System.out.print(name + "  ");
    }
};


class Grandpa{
    public Calabash[] createCalabash() {
        Calabash[] grandsons = new Calabash[]{
            new Calabash("大娃", 7),
            new Calabash("二娃", 6),
            new Calabash("三娃", 5),
            new Calabash("四娃", 4),
            new Calabash("五娃", 3),
            new Calabash("六娃", 2),
            new Calabash("七娃", 1),
        };
        return grandsons;
        
    }

    public void randLine(Calabash[] grandsons){

    }

    public void report(Calabash[] grandsons){
        for(Calabash huluwa : grandsons ){
            huluwa.sayName();
        }
    }

    public void bubbleSort(Calabash[] grandsons){

    }

};