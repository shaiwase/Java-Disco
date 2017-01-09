/**
 * @author karine Or 310261243
 * Description : This class represents a set of 4 colored bulbs. 
 */
public class Disco {

	//Assume that the first lamp is on the most left and the last lamp is on the most right.
	private LightBulb _bulb1, _bulb2, _bulb3, _bulb4 ; 

/**
 * Constructor of the Disco which is receives 4 light bulbs. Assumes the given bulbs are not null. 
 * @param b1 The first light bulb.  
 * @param b2 The second light bulb.
 * @param b3 The third light bulb.
 * @param b4 The forth light bulb.  
 */
	public Disco(LightBulb b1, LightBulb b2, LightBulb b3, LightBulb b4)
	{
		_bulb1 = new LightBulb(b1);
		_bulb2 = new LightBulb(b2);
		_bulb3 = new LightBulb(b3);
		_bulb4 = new LightBulb(b4);
	}

	/**
	 * Returns the first LightBulb
	 * @return Returns the first LightBulb
	 */
	public LightBulb getFirstBulb()  
	{
		return new LightBulb(_bulb1); 
	}

	/**
	 * Returns the second LightBulb
 	 * @return Returns the second LightBulb. 
	 */
	public LightBulb getSecondBulb()  
	{
		return new LightBulb(_bulb2);
	}

	/**
	 * Returns the third LightBulb
 	 * @return Returns the third LightBulb. 
	 */
	public LightBulb getThirdBulb()  
	{
		return new LightBulb(_bulb3);
	}

	/**
	 * Returns the fourth LightBulb.
	 * @return Returns the fourth LightBulb. 
	 */
	public LightBulb getFourthBulb()  
	{
		return new LightBulb(_bulb4);
	}
	
/**
 * Switches the state of the light bulb with the given index.
 * @param num
 */
	public void switchBulb(int optionNumber) 
	{
		 

		switch (optionNumber) {
		case 1: _bulb1.switchLight();
		break;
		case 2: _bulb2.switchLight();
		break;
		case 3: _bulb3.switchLight();
		break;
		case 4: _bulb4.switchLight();
		break;
		 	 
		}
	}

	/**
	 * Turns all the light bulbs on.
	 */
	public void turnAllOn()
	{
		if (!_bulb1.isSwitchedOn())
			_bulb1.switchLight();
		if (!_bulb2.isSwitchedOn())
			_bulb2.switchLight();
		if (!_bulb3.isSwitchedOn())
			_bulb3.switchLight();
		if (!_bulb4.isSwitchedOn())
			_bulb4.switchLight();
	}

	/**
	 * Turns all the light bulbs off.
	 */
	public void turnAllOff()
	{
		if (_bulb1.isSwitchedOn())
			_bulb1.switchLight();
		if (_bulb2.isSwitchedOn())
			_bulb2.switchLight();
		if (_bulb3.isSwitchedOn())
			_bulb3.switchLight();
		if (_bulb4.isSwitchedOn())
			_bulb4.switchLight();
	}

	/**
	 * Checks if all the light bulbs are on. 
	 * @return - true if all the light bulbs are on, otherwise false.
	 */
	public boolean areAllOn()
	{
		return _bulb1.isSwitchedOn() &&
			   _bulb2.isSwitchedOn() &&
			   _bulb3.isSwitchedOn() &&
			   _bulb4.isSwitchedOn();
					 
	}

	/**
	 * Checks if all the light bulbs are off. 
	 * @return -  true if all the light bulbs are off, otherwise false.
	 */
	public boolean areAllOff()
	{
		return  !_bulb1.isSwitchedOn() && 
				!_bulb2.isSwitchedOn() && 
				!_bulb3.isSwitchedOn() &&
				!_bulb4.isSwitchedOn();
		 
	}
/**
 * Checks if all the light bulbs have the same color. 
 * @return true if all the light bulbs have the same color, otherwise false.
 */
	public boolean allSameColor()
	{
	 
		return  _bulb1.getColor().equals(_bulb2.getColor()) &&
		        _bulb1.getColor().equals(_bulb3.getColor()) &&
		        _bulb1.getColor().equals(_bulb4.getColor());
		 				 
		} 

}
