class Boxing
{
	static public void main(String...argu)
	{
		int var = 100;
		Integer ref = var;		//auto-boxing whenever we need oops features
		
		// var.method();  not possible
		// ref.method();  possible
		
		Integer ref1 =1000; //Integer wrapper class can hold only 0 to 127
		Integer ref2 =1000;

		int arg1 = ref1;
		int arg2 = ref2;
		
		//if(ref1==ref2) 	//not allowed if ref1 is out of range of INTEGER

		if(ref1.equals(ref2)){System.out.println("same");}		//if it is out of range use equals method
		else{System.out.print("not same");}

		
	}
}