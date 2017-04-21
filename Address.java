package andycpp;

/*编写并测试一个代表地址的address类，地址信息由国家、省份、城市、街道、邮编组成，
 * 并可以返回完整的地址信息。
 */
class AddInfo{
	private String country;
	private String province;
	private String city;
	private String street;
	private int zip;
	void setCountry(String c){
		this.country = c;
		c = "China";
	}
	void setPro(){
		
	}
	void setCity(){
		
	}
	void setStreet(){
		
	}
	void setZip(){
		
	}
	void getCountry(String country){
		setCountry(country);
		Prt_address(country);
	}
	void getPro(String p){
		this.province = p;
		Prt_address(p);
	}
	void getCity(){
		
	}
	void getStr(String s){
		this.street = s;
		Prt_address(s);
	}
	void getZip(int z){
		this.zip = z;
		Prt_address("zip: " + z);
	}
	void Prt_address(String s){
		System.out.println(s);
	}

}

public class Address {
	public static void main(String[] args){
		AddInfo add = new AddInfo();
		System.out.println("into AddInfo----------");
		add.getCountry("");
	}
}
