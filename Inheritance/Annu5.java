public class Annu5{
	String model;
	int year;
	public Annu5(String model,int year){
		this.model=model;
		this.year=year;
	}

	public void displayinfo(){
		System.out.println("Model:"+model+"\nYear:"+year);
	}	

public static void Main(String[] args){
		Annu5 c=new Annu5("TOYOTA",2026);
		c.displayinfo();
}
}