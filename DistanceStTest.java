class DistanceStTest{
	public static void main(String [] args){
		float feet;
		float inches;
		//Distance D1=new Distance(f1,i1);
		DistanceSt D2=new DistanceSt();
		DistanceSt D1=new DistanceSt();
		D1.setValuefeet(54);
		D1.setValueinches (33);
		D2.setValuefeet(45);
		D2.setValueinches(88);
		DistanceSt D3 = DistanceSt.Sum(D1,D2);
		System.out.println(D3.getValuefeet()+""+D3.getValueinches());


}
}