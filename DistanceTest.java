class DistanceTest{
	public static void main(String [] args){
		float feet;
		float inches;
		Distance D1=new Distance();
		Distance D2=new Distance();
		Distance D3=new Distance();
		D1.setValuefeet(54);
		D1.setValueinches (33);
		D2.setValuefeet(45);
		D2.setValueinches(88);
		D3 = D1.Sum(D2);
		D3.Display();


		
	}
}