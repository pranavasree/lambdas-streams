import java.util.*;
import java.util.stream.IntStream;
public class Average {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		IntStream stream=IntStream.of(2,3,4,5,6,7,8);
		OptionalDouble obj=stream.average();
		if(obj.isPresent())
		{
			System.out.println(obj.getAsDouble());
		}
		else
		{
			System.out.println("-1");
		}
		s.close();
	}
}