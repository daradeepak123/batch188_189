package encapsulation;

public class EncapsuleData {
	
	
	public String name="hello";
	private String bank="hdfc";
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsuleVariable.setAbc(600);
		
			System.out.println(EncapsuleVariable.getAbc());
	}






	public String getBank() {
		return bank;
	}






	public void setBank(String bank) {
		this.bank = bank;
	}

}
