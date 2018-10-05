package com.example.org;
//代码其实是从左往右，从上往下输出的，输出的为双引号里面的信息
//println中的ln其实是换行的意思
//这样""的内容其实叫文本信息
//System.out.println("3"+"aaa");这里的+是拼接的意思
//文本+数字就是拼接的意思，得到的还是文本这边的（）是先执行的意思，先做加法，在做拼接
//System.out.println("3"+"aaa"+(1+123));
//public class ozheshigebao {-----公共的类---类名（类名称和文件名相同）{
//我们所有的代码都写在第一个大括弧中，写到外面就会报错
//public static void main(String[] agrs) {这是规定这么写的，这是JAVA的入口就像家门口一样的
//计算机只看到public static void main(String[] agrs) {大括弧内的代码
//我们的包下面可以有很多的JAVA文件（类文件），那么每个类文件中可以写一个入口，那么，入口这么多，我们代码是如何执行的呢
//我们可以看出，从不同的入口执行，会产生不同的效果，但是计算机只能选择其中一个入口去执行
//例如：项目工程就像我们的加，有前门和后门，我们想进入 只能选择其中一个门往里面走
//java的特点：JAVA默认只有64M的空间，java的类型分基本数据类型以及分合引用数据类型
//基本数据类型分为：1.byte（字节） 2.short（短整型） 3.int(整形) 4.float（单精度浮点型） 5。double（双精度浮点型）
//6.boolean(布尔类型) 7.long（长整形） 8。char（字符型）
//复合引用的数据类型：1.类类型 2.数组类型 3，接口类型
//数据类型直接不能使用，需要和变量一起使用
//变量其实就是一个容器，用英文或数字设置的一个名字而已
//格式：数据类型  变量名字 = 值
//  在定义float的时候，数字后面要加一个大写的F，定义double的时候数字后面要加一个大写的D
//顶一个一个char类型的变量，变量只能放一个字，例如：char c1 ='a';
//''包裹的内容是一个数字，上图的a代表97，所有的char类型数据都是用数字来保存信息的，例如小写a就是97，A就是65
//

public class ozheshigebao {
public static void main(String[] agrs) {
	System.out.println("3");
	System.out.println("4");
	System.out.println("3"+"aaa");
	System.out.println("3"+"aaa"+1+123);
	System.out.println(1+123);
	System.out.println("3"+"aaa"+(1+123));
}
}
 