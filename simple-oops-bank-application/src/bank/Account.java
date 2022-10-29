package bank;

public class Account 
{
	private int accno;
	private String name;
	private String city;
	private static int saccno=1000;
	private int balanace;
	
	public Account(String name, String city, int balanace) 
	{
		super();
		
		this.name = name;
		this.city = city;
		this.balanace = balanace;
		this.accno = saccno++;
	}
	public Account()
	{
		
	}
	@Override
	public String toString() {
		return "Account [accno=" + accno + ", name=" + name + ", city=" + city + ", balanace=" + balanace + "]";
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getBalanace() {
		return balanace;
	}
	public void setBalanace(int balanace) {
		this.balanace = balanace;
	}
}
