# 葫芦娃排序改进
## 1 类的设计
设计表示人类的类Human，具有名称`String name`这一属性和报数方法`call()`。具有无参构造器和传递一个字符串的构造器。  
表示葫芦娃的类Huluwa和表示爷爷的类Grandpa分别是Human类的子类，其中Huluwa具有序号属性`int num`，实现了接口`Comparable<Object>`并重写`compareTo(Object)`方法，用以比较两个葫芦娃之间的顺序关系。
其还具有`swapWith()`方法，用以和另一个葫芦娃交换位置。  
Grandpa类中具有私有方法`compareHuluwa`、`swapHuluwa`，通过委托调用葫芦娃的方法实现对其的比较和交换。具有公共方法`sortHuluwa`，将比较、交换的方法封装，在排序时调用此方法即可。  
类图如下：  
![](http://www.plantuml.com/plantuml/png/TO-_JiCm4CRtUmgFGI4y0KCH0sNA0183OhXUZZHWNopxJ8VGTyT9ZMG6Hdz_Vlvk5nM39cV18ttYoARlxuOl5EBXXeuOa9H3N62V78gv_Uuwyn1G1e-rj4ysdH38OepbOIRdBJiMZUP-TZwZ3fRX32MrjHTebwYe4vtD96feJgBGFccOP3I2Zg4bjBQvMeivmU4TYIjW9j3suEUvwGyVJBfbwoaviy8bEMZZ2VtBfCVcObNPSbOzgKXvMbQ46BhorwLS6DVcbzMjz7-yDiv1_tYlRraTMHyBVJjonp8aPty0)
  
## 2 利用静态块实现单例模式    
根据需求，爷爷类的实例在同一世界中应当只存在一个，故采用单例模式。爷爷类中具有静态变量`Grandpa instance`，静态块中将其初始化。在调用爷爷类实例时，使用方法`Grandpa.getInstance()`即可。同时该单例模式是线程安全的。  
## 3 利用静态变量和构造器实现计数  
Human类具有静态变量`static int count`，表示生成的Human类（及其子类）实例总数。在其构造器中，加入语句`count ++; `且其子类构造器中均用super关键字实现对父类构造器的使用，故每生成一个Human或子类对象，count数量就会增加1.
## 4 报数方法中的多态
Main类中具有静态方法`letCall(Human)`，委托传入的Human对象使用`call()`来打印其名字。Grandpa类对该方法进行了重写，当将一个Grandpa类的实例传递给`letCall(Human)`方法时，即会调用重写后的报数方法。如果传递的是葫芦娃类的实例，则调用父类Human中的`call()`方法。
