package abstractionLearn;

public class Maruthi implements Car{

	@Override
	public void weels() {
		System.out.println("4 wheels low quality");
	}

	@Override
	public void doors() {
		System.out.println("4 doors low quality");
		
	}

	@Override
	public void engine() {
		System.out.println("medium");
	}

	@Override
	public void price() {
		System.out.println("3l");
		
	}

}
