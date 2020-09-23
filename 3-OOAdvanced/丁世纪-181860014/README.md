start hw3




I.使用的面向对象中的特性
封装
将类的对象和外界的沟通封装,例如Human的name封装为get_name(),使得别的对象只能获取名字而无法修改

继承
Human类implements两个接口communicate和fight,葫芦娃和爷爷继承Human类,在需要的地方Override.
仅能继承一个父类,但是可以有多个接口

多态
多态是对象具有多种形态,例如gp是Human,也是Grandpa,gp继承Human的方法和变量,重写了部分
Override Human类中定义了Speaksth(string str)函数.葫芦娃和爷爷都继承Human,而爷爷的Speak被Override,在说话前咳嗽

II.使用的语言特性
接口
Human类使用了communicate和fight两个接口,HuluBrother类override了这两个接口


构造器
在初始化对象时自动调用,	
HuluBrother的constructor  HuluBrother(String s,int i)在构造的时候指定他的名字和序号

静态变量
葫芦娃的数量  HULU_NUM 在world类中给出,这样在七个葫芦娃还没全生出来(or来了第八个)时,只改动一处即可.
Human类的population

静态块
Human类中的static block用于统计总人数

包
sort.java package在sortmethod包中
被grandpa import
Sort类的static method SortInt,根据命令选择不同排序方法(还没写),提供了用不同方法排序的接口


修饰符
public  所有类都可以访问  
protected 仅自己和子类可用,例如Human类的Speak和Ask2swap两个方法,Grandpa和葫芦娃都可以调用. Human的name也是protected,别的类只能get_name()读取而不能修改name.
private 仅同一类内可用,例如葫芦娃的rank定义为private的,外界仅能通过get_rank()获取而不能修改.

III.如何使用面向对象编程思想和抽象思维来优雅地解决以上问题
