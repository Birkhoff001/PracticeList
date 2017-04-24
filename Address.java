package PracticeJava;

/*编写并测试一个代表地址的address类，地址信息由国家、省份、城市、街道、邮编组成，
 * 并可以返回完整的地址信息。
 */
class AddInfo{
	private String country;
	private String province;
	private String city;
	private String street;
	private int zip;
	public AddInfo(String country, String province, String city, String street, int zip){
		this.country = country;
		this. province = province;
		this.city = city;
		this.street = street;
		this.zip = zip;
	}
	public void setCountry(String c){
		this.country = c;
	}
	public void setPro(String p){
		this.province = province;
	}
	public void setCity(String c){
		this.city = c;
	}
	public void setStreet(String s){
		this.street = s;
	}
	public void setZip(int z){
		this.zip = z;
	}
	public String getCountry(){
		return this.country;
	}
	public String getPro(){
		return this.province;
	}
	public String getCity(){
		return this.city;
	}
	public String getStr(){
		return this.street;
	}
	public int getZip(){
		return this.zip;
	}
	public void Prt_address(){
		System.out.println("Address: " + this.country + "," + this.province + 
				"," + this.city + "," + this.street + "," + this.zip);
	}
}

public class Address {
	public static void main(String[] args){
		AddInfo add = new AddInfo("China", "Shanghai", "Shanghai", "DongfangRoad", 200120);
		System.out.println("into AddInfo----------");
		add.Prt_address();
	}
}
