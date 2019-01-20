class Distance{
	private float feet;
	private float inches;


	Distance(){//non-parameterised 
		feet=0;
		inches=0;
	}
	Distance(float feet,float inches)//parametrised
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
	 Distance Sum(Distance D2)//return type is Distance as object is type Distance

	{
		Distance D3 = new Distance();
		D3.inches=this.inches+D2.inches;
		D3.feet=this.feet+D2.feet+inches/12;//stored in the value of D3 
		D3.inches=inches%12;
		return D3;

	}
	void Display()
	{
		System.out.println("the distance in feet and inches are as follows:"+this.feet+""+this.inches);
	}


}