package V27_InterFaces_MultipleInheritance;

public class Smartphone_Class implements interface_Camera, interface_Music, Interface_Phone{

	@Override
	public void calling(String number) {
		// TODO Auto-generated method stub
		System.out.println("Provide Number to call...");
	}

	@Override
	public void ringing() {
		// TODO Auto-generated method stub
		System.out.println("Ringing phone.....");
	}

	@Override
	public void endCall() {
		// TODO Auto-generated method stub
		System.out.println("Ending call!!!!!");
	}

	@Override
	public void music_Playing() {
		// TODO Auto-generated method stub
		System.out.println("Playing Music$$");
	}

	@Override
	public void stop_Music() {
		// TODO Auto-generated method stub
		System.out.println("Stopping music........");
	}

	@Override
	public void clicPhoto() {
		// TODO Auto-generated method stub
		System.out.println("Clicking picture^^^");
	}

	@Override
	public void recordVideo() {
		// TODO Auto-generated method stub
		System.out.println("Recording video'''''''''");
	}

	

}
