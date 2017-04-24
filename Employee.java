package PracticeJava;
/*定义并测试一个employee类，员工属性包括编号，姓名，基本薪水，薪水增长额，
 * 包括计算薪水增长额及计算增长后的工资总额的操作方法
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
public class Employee{
	public static void main(String[] args){
		EmployeeInfo e = new EmployeeInfo("1001", "Bob", 10000, 1000);
		e.print_baseemployee();
		e.print_addafteremployee();
	}
}