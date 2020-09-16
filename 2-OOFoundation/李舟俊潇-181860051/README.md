# 2-OOFoundation

181860051	李舟俊潇



### 编程思路

1. 我构造了一个*Grandfather*类，用于定义一个能指挥葫芦娃进行排序的“爷爷”，并在*orchestration*方法中实例化了一个对象，通过调用该对象的排序函数来指挥乱序的葫芦娃进行排序。

   类定义如下：

   ```java
   class Grandfather{
       //爷爷指挥，bro1的number大于bro2的number时返回true(需要交换)
       private boolean conduct(Brother bro1, Brother bro2){...}
   
       //爷爷开始为葫芦娃排序
       public void grandfatherSort(Brother[] temp){...}
   }
   ```

   在*grandfatherSort*方法中，我采用了冒泡排序的方式，当需要对两个相邻的葫芦娃进行比较时，便调用*Grandfather*类中的*conduct*方法，根据其返回值来决定是否交换两人顺序。特别地，当某轮遍历中不存在交换，则表示葫芦娃已按顺序排列，令其停止排序。

   若需要对排序算法进行替换，则只需修改*Grandfather*类中的*grandfatherSort*方法，并在需要进行比较时调用*Grandfather*类中的*conduct*方法即可。

2. 我构造了*Brother*类，用于定义每个葫芦娃的序号、名字、与其他葫芦娃比较及交换的行为，并在程序初始化时便实例化了七个葫芦娃对象。

   类定义如下：

   ```java
   class Brother{
       public int number;
       public String name;
   
       public Brother(int num,String myname){...}
   
       //自己的number比front的number小的时候返回true(需要交换)
       private boolean compareWithFrontBrother(Brother front){...}
   
       //自己的number比next的number大的时候返回true(需要交换)
       private boolean compareWithNextBrother(Brother next){...}
   
       //葫芦娃检查自己需不需要与下一个葫芦娃交换位置,如果需要则交换
       public boolean brotherCheckAndSwap(Brother[] temp,int self,int next){...}
   ```

   在*choreography*方法中，我根据冒泡排序的顺序依次遍历队列中的每个葫芦娃，并调用其*brotherCheckAndSwap*方法由其自己来判断是否需要进行交换并自行完成相应操作。特别地，当某轮遍历中不存在交换，则表示葫芦娃已按顺序排列，令其停止排序。

   若需要对排序算法进行替换，则只需修改*choreography*方法中排序算法，并根据需要修改*Brother*类中的*brotherCheckAndSwap*方法中的比较方式（*compareWithFrontBrother*或*compareWithNextBrother*），再将修改后的*brotherCheckAndSwap*方法插入需要进行交换的位置。

3. 在主函数中，我首先初始化七个葫芦娃，并为他们产生随机顺序。在根据用户所输入的命令判断需要调用哪个排序方法进行排序，最后再进行报数。

   公共类定义如下：

   ```java
   public class CalabashBrothers {
       //由葫芦娃们的爷爷来指挥葫芦娃们行动
       private static Brother[] orchestration(Brother[] temp){...}
   
       //葫芦娃相互协作，完成排队过程
       private static Brother[] choreography(Brother[] temp){...}
   
       //初始化七个葫芦娃
       private static void initialBros(Brother[] brothers){...}
   
       //将七个葫芦娃随机排列
       private static Brother[] randomSort(Brother[] brothers){...}
   
       //选择排序形式并排序
       private static Brother[] selectSortMethod(Brother[] temp){...}
   
       //报数
       private static void numberOff(Brother[] result){...}
   
       public static void main(String[] argv){
           //初始化七个葫芦娃
           Brother[] brothers=new Brother[7];
           initialBros(brothers);
   
           //将七个葫芦娃随机排列
           Brother[] temp=randomSort(brothers);
   
           //选择排序形式并排序
           Brother[] result=selectSortMethod(temp);
   
           //报数
           System.out.println("\n");
           numberOff(result);
       }
   
   }
   ```

   

### 运行结果

##### orchestration方法

![](D:\CS  各类文件\学习\作业\大三上\高级Java程序设计\作业02\QQ截图20200916222900.png)

##### choreography方法

![](D:\CS  各类文件\学习\作业\大三上\高级Java程序设计\作业02\QQ截图20200916222928.png)