/**
 * @author karine 
 * Description : This class represents a color, defined by its red, green and blue components. 
 */

public class RGBColor {
	
	private final int MAXCOLOR = 255;
	private final int MINCOLOR = 0;
	
	private final int GRAY_RED_COMPONENT = 30; 
    private final int GRAY_GREEN_COMPONENT = 59; 
    private final int GRAY_BLUE_COMPONENT = 11; 

	private int _red, _green, _blue;
	
/**
 * Construct a black RGBColor (red = green = blue = 0) 
 * Takes no parameter
 */
	public  RGBColor()
	{
		_red = MINCOLOR;
		_green = MINCOLOR;
		_blue = MINCOLOR;
	}
	/**
	 * Construct a new RGBColor with the given color component values. If one (or more) of the given values is illegal
	 * (not in the range 0-255), it constructs a black RGBColor object. 
	 * @param - The red color component value.
	 * @param - The green color component value.
	 * @param  - The blue color component value.
	 */
	public  RGBColor(int red, int green, int blue) 
	{
		
		if (red >= MINCOLOR && red <=  MAXCOLOR) 
			_red = red;
		if  ( green>= MINCOLOR && green <=  MAXCOLOR) 
			_green = green;
		if  (blue>= MINCOLOR && blue <=  MAXCOLOR)  
			_blue = blue;

	}
	/**
	 * Construct a new RGBColor which is a copy of the given color. Assumes the given color is not null.
	 * @param other - The RGBColor to copy.
	 */
	public RGBColor(RGBColor other)  
	{
		this(other.getRed(), other.getGreen(), other.getBlue());
	}

	/**
	 * @return Returns the red color component value of this RGBColor. 
	 */
	public int getRed() 
	{
		return _red;
	}

	/**
	 * @return returns The green color component value of this RGBColor.
	 */
	public	int getGreen() 
	{
		return _green;
	}

	/**
 	 * @return returns the blue color component value of this RGBColor. 
	 */
	public	int getBlue() 
	{
		return _blue;
	}

	/**
	 * Sets the red color component value of this RGBColor. If the given value is not legal (in the range 0-255)
	 * the color remains unchanged
	 * @param  num  - The red color component value to set.
	 */
	public void setRed(int red) 
	{
		if (red >= MINCOLOR && red <= MAXCOLOR) 
			_red = red;
	}
	/**
	 * Sets the green color component value of this RGBColor. If the given value is not legal (in the range 0-255) 
	 * the color remains unchanged. 
	 * @param num
	 */
	public void setGreen(int green) 
	{
		if (green >= MINCOLOR && green <= MAXCOLOR) 
			_green = green;
	}
	/**
	 * Sets the blue color component value of this RGBColor. If the given value is not legal (in the range 0-255)
	 * the color remains unchanged. 
	 * @param num - The blue color component value to set.
	 */
	public void setBlue(int blue) 
	{
		if (blue >= MINCOLOR && blue <= MAXCOLOR) 
			_blue = blue;
	}

	/**
	 * Compares this and other color. Returns true if this and other are the same RGBcolor, i.e. have the same red,
	 * green and blue components. Assumes the given bulb is not null. 
	 * @param - other
	 * @return true if the RGBColors are equal, otherwise false.
	 */
	public boolean equals(RGBColor other)
	{
		return _red == other._red && _green == other._green && _blue == other._blue;
	}
	
	/**
	 * Changes this color to be a mix of this and other RGBColors. The mixed color is simply the average 
	 * (over the red, green and blue components) of this and other colors.
	 * In case the average is fractional (e.g. 113.5) you should take only the integer part as the new value (e.g. 113).
	 * For examle if this color is red - (255,0,0) and other color is green - 
	 * (0,255,0) after mix operation this color will be yellow = (127,127,0) Assumes the given bulb is not null. 
	 * @param other - The other color.   
	 */
	public void mix (RGBColor other)
	{
		_red = ((int)(_red + other._red) / 2);
		_green = ((int)(_green + other._green) / 2);
		_blue = ((int)(_blue + other._blue) / 2);
	}
	
	/**
	 * Returns the grayscale value of this RGBColor. The grayscale value is defined as 30% the red value + 59% 
	 * of the green value and 11% of the blue value. 
	 * @return The grayscale value of this RGBColor.
	 */
	public double convertToGrayscale()
	{
	   	return  (double)_red / 100 * GRAY_RED_COMPONENT + 
		        (double)_green / 100 * GRAY_GREEN_COMPONENT + 
		        (double)_blue / 100 * GRAY_BLUE_COMPONENT;
	}

	/**
	 * Returns the 3 object colors values as string 
	 */
	public String toString()
	{
		return  "("+ getRed() +"," + getGreen() + "," + getBlue() +")";
	}
	
	/**
	 * Inverts the color of this RGBColor, by replacing each component value with its complement relative to 255. 
	 * For example, RGB values of (0,1,2) would be changed to (255,254,253).
	 */
	public void invert()
	{
		_red = MAXCOLOR - _red;
		_green = MAXCOLOR - _green;
		_blue = MAXCOLOR - _blue;
	}


}
