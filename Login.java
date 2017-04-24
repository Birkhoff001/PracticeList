package PracticeJava;

import java.util.Scanner;
class Check{
	private String name = "admin";
	private String password = "admin";
	public boolean validate(String n, String p){
		if(n.equals(this.name) && p.equals(this.password)){	
			System.out.println("this.name = " + this.name + ", this.pw = " + this.password);
			return true;
		}
		else {
			return false;
		}
	}
}
class InputInfo{
	private String name;
	private String pw;
	@SuppressWarnings({ "resource", "unused" })
	public void input(String name, String pw){
		Check check = new Check();
		System.out.println("loginname: ");
		Scanner sca_name = new Scanner(System.in);
		String n = sca_name.nextLine();
		name = n;
		System.out.println("password: ");
		String p = sca_name.nextLine();
		pw = p;
		String str = null;
		if(check.validate(n, p)){
			System.out.println("------------welcome " + name + "---------------!");
		}
		else {
			System.out.println("loginname or password was wrong!");
		}
	}
}

public class Login {
	@SuppressWarnings("unused")
	public static void main(String args[]) {
		InputInfo info = new InputInfo();
		System.out.println("into Inputinfo-------");
		info.input("", "");
	}
}
