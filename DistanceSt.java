class DistanceSt{
	private float feet;
	private float inches;


	DistanceSt(){//non-parameterised 
		feet=0;
		inches=0;
	}
	DistanceSt(float feet,float inches)//parametrised
	{
		this.feet=feet;
		this.inches=inches;

	}

	void setValuefeet(float feet)//set method for feet
	{
		this.feet=feet;
	}
	void setValueinches(float inches)//set method for inches
	{
		this.inches=inches;

	}
	/*void setValuefeet(float feet,float inches)
	{
		this.feet=feet;
		this.inches=inches;

	}
	void setValueinches(float  feet,float inches)
	{
		this.feet=feet;
		this.inches=inches;

	}*/
	float getValuefeet()
	{
		return this.feet;

	}
	float getValueinches()
	{
		return this.inches;

	}
	static DistanceSt Sum(DistanceSt D1,DistanceSt D2)//return type is Distance as object is type Distance

	{
		DistanceSt D =  new DistanceSt();
		D.inches=D1.inches+D2.inches;
		D.feet=D1.feet+D2.feet+D.inches/12;//stored in the value of D3 
		D.inches=D.inches%12;
		return D;

	}
	 


}
