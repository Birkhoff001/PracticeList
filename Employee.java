package PracticeJava;

import java.util.Scanner;

/*1.定义并测试一个employee类，员工属性包括编号，姓名，基本薪水，薪水增长额，
 * 包括计算薪水增长额及计算增长后的工资总额的操作方法。
 * 2.统计出一串字符串中某个字母出现的次数。
 * 3.设计一个表示用户的user类，类中的变量有用户名/口令和记录用户个数的变量，定义类的3个构造方法
 * （无参、为用户名赋值、为用户名和口令赋值）、获取和设置口令的方法和返回类信息的方法.
 * 4.字符串操作：从一串字符串中提取当天日期；将字符串中的部分字符替换；取出字符串中第N个字符；
 * 清除字符串中的所有X字符；清除字符串中的所有空格；从任意输入的身份证中提取此人的出生日期。
 * 5.编写一个员工类：1）数据成员 员工号，姓名，薪水，部门；2）方法   1@.利用构造方法完成设置信息。
 * 单参（员工号） 双参（员工号、姓名）4参（）无参（null）   2@.显示信息
 * 6.构造一个银行账户类：1）数据成员用户的账户名称、用户的账户余额（private） 2）方法包括开户（设置账户名称及余额），
 * 利用构造方法完成；3）查询余额。
 * 7.声明一个图书类，其数据成员未书名、编号（利用静态变量实现自动编号）、书价，
 * 并拥有静态数据成员册数、记录图书的总册数，在构造方法中利用此静态变量为对象的编号赋值，
 * 在主方法中定义对象数组，并求出总册数。
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
	}
}
class Employee2{
	private int number;
	private String name;
	private int salary;
	private String department;
	public Employee2(){
	}
	public Employee2(int number){
		this.number = number;
		prtEmployeee2("the employee's number is : " + number + ".");
	}
	public Employee2(int number, String name){
		this.number = number;
		this.name = name;
		prtEmployeee2("the " + name + " 's number is " + number + ".");
	}
	public Employee2(int number, String name, String department, int salary){
		this.number = number;
		this.name = name;
		this.department = department;
		this.salary = salary;
		prtEmployeee2("the " + name + "'s number is " + number + ", in " + department 
				+ " department," + "salary is " + salary + ".");
	}
	public void prtEmployeee2(String s){
		System.out.println(s);
	}
}
class BankAcount{
	private String accountname;
	private float accountbalance;
	public void setName(String accountname){
		this.accountname = accountname;		
	}
	public void setBalance(float accountbalance){
		this.accountbalance = accountbalance;
	}
	public float getAccount(){
		return accountbalance;
	}
	public String getName(){
		return accountname;
	}
}
public class Employee{
	public static void main(String[] args){
//		EmployeeInfo e = new EmployeeInfo("1001", "Bob", 20000, 1000);
//		Str_Count c = new Str_Count("", 'h');
//		User u = new User("Salad", "admin");
//		User b = new User("Bob");
//		User s = new User();
//		e.print_baseemployee();
//		e.print_addafteremployee();		
//		c.print();
//		u.prt_User();
		String s = "today is 20170504";
		String s1 = "622110199001010404";
		System.out.println("the date is : " + s.substring(9));
		System.out.println("replaced string is : " + s.replace("today", "ToDay"));
		System.out.println("the third char is : " + s.charAt(3));
		System.out.println("clear all of the 0 : " + s.replace("0", ""));
		System.out.println("clear all of the space: " + s.replace(" ", ""));
		System.out.println("the people's birthday: " + s1.subSequence(6, 14));
		Employee2 e = new Employee2(1001, "Jason", "BI", 20000);
	}
}