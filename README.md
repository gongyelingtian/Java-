# Java-
Java课程作业项目仓库

P110/4 编程项目4

#实验内容
用类描述计算机CPU的速度和硬盘容量，要求Java应用程序有4类，名字分别为PC,CPU,HardDisk,Test,其中Test是主类

#CPU
getSpeed()按要求返回speed的值
要求setSpeed（int m）防范将参数m的值赋予给speed.

#PC
setCPU(CPU c)将参数c的值赋予cpu
要求setHardDisk(HardDisk h)方法将参数h的值赋值给HD
要求show()方法显示cpu速度和硬盘容量

#HardDisk
getAmount()返回amount的值
要求setAmount(int m)方法将参数m的值赋予amount

#Test
1.main方法中创建一个CPU对象cpu，将自己的speed设置为2200
2.main方法中创建一个HardDisk对象disk，disk将自己amount设置为2200
3.main方法中创建一个PC对象pc
4.pc调用setPCU（CPU c）等方法，调用时实参时cpu
5.pc调用setHardDisk(HardDisk)方法，调用时实参时disk
6.pc调用show（）方法

#实验设计
a.根据题目要求设计PC,CPU,HardDisk,Test类，并将最终运用的主方法放在Tist类
b.为每个类添加两个构造方法，一个是空构造方法，一个是将参数赋值的构造方法
c.添加一个HardDiskType的枚举，用于限定可以传入的硬盘类型
d.在CPU类的setCores方法内添加简单判断，设置调用方法直接用这个setter进行设置

#实验结果
cpu速度：2200
cpu核心数：4
硬盘容量：200
硬盘类型：SSD

#实验感想
了解包的概念，学会约束关键字的范围及具体表现形式。
