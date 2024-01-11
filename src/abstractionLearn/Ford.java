package abstractionLearn;

public class Ford implements Car{

	@Override
	public void weels() {

		System.out.println("4 wheels medium quality");
		
	}

	@Override
	public void doors() {
		System.out.println("4 doors medium quality");
	}

	@Override
	public void engine() {
		System.out.println("good");
		
	}

	@Override
	public void price() {

		System.out.println("10l");
		
	}

}
