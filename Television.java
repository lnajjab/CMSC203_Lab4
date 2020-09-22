/**
 * The purpose of this class is to model a television
 * @author Laith Najjab
 * 9/21/2020
 */
public class Television {

	/**
	 *  brand name
	 */
	final String MANUFACTURER;
	/**
	 *  size of the tv screen
	 */
	final int SCREEN_SIZE;
	/**
	 *  whether the tv is on or off
	 */
	boolean powerOn;
	/**
	 *  the channel number and volume number the tv is set to
	 */
	int channel, volume;

	/**
	 * This constructor initializes all the tv's attributes
	 * @param brand
	 * @param size
	 */
	public Television(String brand, int size) {
		
		MANUFACTURER = brand;
		SCREEN_SIZE = size;
		powerOn = false;
		volume = 20;
		channel = 2;
	}
/**
 * 
 * @return volume
 */
	public int getVolume() {
	
		return volume;
	}
	/**
	 * 
	 * @return channel
	 */
	public int getChannel() {
		
		return channel;
	}
/**
 * 
 * @return manufacturer name
 */
	public String getManufacturer() {
		
		return MANUFACTURER;
	}
	/**
	 * 
	 * @return screen size
	 */
	public int getScreenSize() {
		
		return SCREEN_SIZE;
	}
	/**
	 * 
	 * @param newChannel changes the channel
	 */
	public void setChannel(int newChannel)
	{
		channel = newChannel;
		
	}
	/**
	 * turns the tv on and off
	 */
	public void power()
	{
		powerOn = !powerOn;
	}
	/**
	 * increases the volume by 1
	 */
	public void increaseVolume() {
		
		volume++;
	}
	/**
	 * decrease the volume by 1
	 */
	public void decreaseVolume() {
	
		volume--;
	}
	
	
}
	
	

