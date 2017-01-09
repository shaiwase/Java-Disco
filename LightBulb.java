/**@author karine  
 *  
 * Description : class LightBulb , consists of a color and state which defines if the bulb is switched on or off. 
 */
public class LightBulb {

	private RGBColor _color;
	private boolean _switchedOn;

	/**
	 * Construct a new LightBulb with the given color component values.
	 * @param red
	 * @param green
	 * @param blue
	 */
	public LightBulb(int red, int green, int blue)
	{
		_color = new RGBColor(red,green,blue);//Validation done by RGBColor constructor.
		_switchedOn = false;
	}
	/**
	 * Construct a new LightBulb which is a copy of the given bulb.
	 * @param other
	 */
	public LightBulb(RGBColor other)
	{
		_switchedOn = false;
		_color = new RGBColor(other);
	}
	/**
	 * Construct a new LightBulb which is a copy of the given bulb. Assumes the given bulb is not null. 
	 * @param other - The LightBulb to copy.
	 */
	public LightBulb(LightBulb other)
	{
		_color = new RGBColor(other._color);
		_switchedOn = false;
	}
	/**
	 * Gets the color of the current LightBulb
	 * @return the color component of this bulb.
	 */
	public RGBColor getColor() 
	{
		return  new RGBColor(_color);
	}

	/**
	 * Sets the color component of the current LightBulb.
	 * @param color - The color component to set.
	 */
	public void setColor(RGBColor color)
	{
		_color = new RGBColor(color);
	}
	/**
	 * @return true if this bulb is switched on. Otherwise, returns false. 
	 */
	public boolean isSwitchedOn()
	{
		return _switchedOn;
	}
	/**
	 * Changes the switch situation from true to false and vice versa. 	
	 */
	public void switchLight()
	{
		_switchedOn = !_switchedOn;
	}

	/**
	 * Returns a string representation of this LightBulb and the switch state. For example (255,127,0) On 
	 */
	public String toString()
	{
		if(_switchedOn)
			return _color + "On";
		else
			return _color + "Off";
	}

}



