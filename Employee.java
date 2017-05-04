package PracticeJava;

import java.util.Scanner;

/*1.定义并测试一个employee类，员工属性包括编号，姓名，基本薪水，薪水增长额，
 * 包括计算薪水增长额及计算增长后的工资总额的操作方法。
 * 2.统计出一串字符串中某个字母出现的次数。
 * 3.设计一个表示用户的user类，类中的变量有用户名/口令和记录用户个数的变量，定义类的3个构造方法
 * （无参、为用户名赋值、为用户名和口令赋值）、获取和设置口令的方法和返回类信息的方法.
 * 4.字符串操作：从一串字符串中提取当天日期；将字符串中的部分字符替换；取出字符串中第N个字符；
 * 清除字符串中的所有X字符；清除字符串中的所有空格；从任意输入的身份证中提取此人的出生日期。
 */
class EmployeeInfo {
	private String id;
	private String name;
	private int basesalary;
	private int addsalary;
	public EmployeeInfo(String id, String name, int basesalary, int addsalary){
		this.id = id;
		this.name = name;
		this.basesalary = basesalary;
		this.addsalary = addsalary;
	}
	public void setId(String i){
		this.id = i;
	}
	public void setName(String n){
		this.name = n;
	}
	public void setBasesalary(int b){
		this.basesalary = b;
	}
	public void setAddsalary(int a){
		this.addsalary = a;
	}
	public String getId(){
		return this.id;
	}
	public String getName(){
		return this.name;
	}
	public int getBasesalary(){
		return this.basesalary;
	}
	public int getAddsalary(){
		return this.addsalary;
	}
	public int getTotal(){
		return (this.basesalary + this.addsalary);
	}
	public void print_baseemployee(){
		System.out.println("the " + this.id + " " + this.name + "'s basesalary: " + this.basesalary);
	}
	public void print_addafteremployee(){
		System.out.println("the " + this.id + " " + this.name + "'s addAfterSalary: " + (this.basesalary + this.addsalary));
	}
}
class Str_Count{
	private int count;
	private char input[]; 
	private char charac;
	public Str_Count(String input, char charac){
		this.input = input.toCharArray();
		this.charac = charac;
		input();
	}
	@SuppressWarnings("resource")
	public void input(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input string array: ");
		String string = scanner.nextLine();
		this.input = string.toCharArray();
	}
	public void print(){
		for(int i = 0; i<this.input.length; i++){
			if(input[i] == this.charac){
				this.count++;
			}
		}
		System.out.println("the number " + this.charac + " appear " 
				+ this.count);
		this.count = 0;
	}
}
class User{
	private String name;
	private String pwd;
	private static int user_num;
	public User(){
		user_num++;
	}
	public User(String name){
		this.name = name;
		user_num++;
	}
	public User(String name, String pwd){
		this.name = name;
		this.pwd = pwd;
		user_num++;
	}
	public void setPwd(String pwd){
		this.pwd = pwd;
	}
	public String getPwd(){
		return this.pwd;
	}
	public void prt_User(){
		System.out.println("User name: " + this.name + "\n" + "password: " + this.pwd + "\n" + "usernumber: " + user_num);
	}
}
class StrOperate{
	private String s;
	public StrOperate(String s){
		this.s = s;
		Str_Count str_Count = new Str_Count(s, '0');
		str_Count.input();
	}
	public void getDate(String s){
		this.s = s;
		int a;
		System.out.println("The date: ");
	}
}
public class Employee{
	public static void main(String[] args){
//		EmployeeInfo e = new EmployeeInfo("1001", "Bob", 20000, 1000);
//		Str_Count c = new Str_Count("", 'h');
		StrOperate so = new StrOperate("");
//		User u = new User("Salad", "admin");
//		User b = new User("Bob");
//		User s = new User();
//		e.print_baseemployee();
//		e.print_addafteremployee();		
//		c.print();
//		u.prt_User();
		so.getDate("");
	}
}