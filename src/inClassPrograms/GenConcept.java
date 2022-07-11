class GenConcept<tni,floati>
{
	tni var1;
	floati var2;
	
	void setValue(tni va1, floati va2)
	{
		var1=va1;
		var2=va2;
	}
	void showValue()
	{
		System.out.println(var1+" "+var2);
	}
}

class MainClass
{
	static public void main(String...ar)
	{
		GenConcept ref = new GenConcept();
		ref.setValue(121,"abhi");
		ref.showValue();
		
		ref.setValue("Priyal",'r');
		ref.showValue();
	}
}