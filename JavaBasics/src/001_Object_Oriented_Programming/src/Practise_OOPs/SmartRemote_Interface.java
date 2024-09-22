//Create an interface TVremote and use it to inherit another interface smart TVremote 
package Practise_OOPs;
interface remote
{
	int buttons = 20;
	void powerOn();
	void powerOff();
	void volumeUp();
	void volumeDown();
	void channelChange();
}
interface smartRemote extends remote
{
	void voiceAcess();
	void ottButton();
	void connectivityButton();
}
class UtV implements smartRemote
{
	public void powerOn()
	{
		System.out.println("Powering On");
	}
	public void powerOff()
	{
		System.out.println("Powering Off");
	}
	public void volumeUp()
	{
		System.out.println("Volume Up");
	}
	public void volumeDown()
	{
		System.out.println("Volume Down");
	}
	public void channelChange()
	{
		System.out.println("Channel Change");
	}
	public void voiceAcess()
	{
		System.out.println("Changing the channel");
	}
	public void ottButton()
	{
		System.out.println("Opening All OTT apps");
	}
	public void connectivityButton()
	{
		System.out.println("Opeing Connectivity Setting");
	}
}
class SmartRemote_Interface
{
	public static void main(String[] args) 
	{
		UtV u1 = new UtV();
		System.out.println("No of Buttons on the Remote ="+u1.buttons);
		u1.powerOn();
		u1.channelChange();
		u1.connectivityButton();
		u1.volumeUp();
		u1.volumeDown();
		u1.voiceAcess();
		u1.powerOff();	
		}
}

