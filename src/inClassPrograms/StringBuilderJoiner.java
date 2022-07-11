import java.util.StringJoiner;
class StringBuilderJoiner
{	
	static public void main(String...ar)
	{
	StringBuilder sb = new StringBuilder("wipro");
	
	sb.reverse();			//orpiw
	sb.append(" company");	//orpiw company
	sb.delete(2,5);
	sb.insert(2,"*****").reverse();

	System.out.println(sb);
	
	StringJoiner sj = new StringJoiner(",");
	
	sj.add("apple");
	sj.add("orange");
	sj.add("grapes");
	sj.add("watermelon");
	
	System.out.println(sj);
	}
}