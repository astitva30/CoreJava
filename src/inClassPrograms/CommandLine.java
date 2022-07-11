class CommandLine
{
	static public void main(String...ar)
	{
		byte first = Byte.parseByte(ar[0]);
		short second = Short.parseShort(ar[1]);
		int third = Integer.parseInt(ar[2]);
		long fourth = Long.parseLong(ar[3]);
		float fifth = Float.parseFloat(ar[4]);
		double sixth = Double.parseDouble(ar[5]);
		boolean seven = Boolean.parseBoolean(ar[6]);
		String eight = ar[7];
		
		System.out.println(first+" " + second +" " +third+" "+ fourth +" " +fifth +" " + sixth +" " + seven +" " + eight);
	}
}