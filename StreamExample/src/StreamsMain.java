import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(2,3,4,5,6);
		//Map Stream to return the square of the items in list
		
		List<Integer> squareList = list.stream()
				.map(x -> x*x)
				.collect(Collectors.toList());
		
		System.out.println(squareList);
	}

}
