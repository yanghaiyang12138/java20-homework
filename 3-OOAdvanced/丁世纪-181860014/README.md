start hw3

面向对象中的特性
封装

继承

多态
Override Human类中定义了Speaksth(string str)函数.葫芦娃和爷爷都继承Human,而爷爷的Speak被Override,在说话前咳嗽

语言特性
接口


构造器
HuluBrother的constructor  HuluBrother(String s,int i)在构造的时候指定他的名字和序号

静态变量
葫芦娃的数量  HULU_NUM 在world类中给出,这样在七个葫芦娃还没全生出来(or来了第八个)时,只改动一处即可.

静态块


包

修饰符
public  所有类都可以访问  
protected 仅自己和子类可用,例如Human类的Speak和Ask2swap两个方法,Grandpa和葫芦娃都可以调用. Human的name也是protected,别的类只能get_name()读取而不能修改name.
private 仅同一类内可用,例如葫芦娃的rank定义为private的,外界仅能通过get_rank()获取而不能修改.