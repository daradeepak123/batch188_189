package abstractionLearn;

public interface Car {
	
	
	int abc=500;
	
	public abstract void weels();
	public abstract void doors();
	public void engine();
	public void price();
	
	default void seatBelt()
	{
		System.out.println("standard seatbelt for all companies");
	}
	
	
	
	
	

}
