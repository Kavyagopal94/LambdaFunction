package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LearningConsumerI implements Consumer<Integer> {
	
	@Override
	public void accept(Integer i) {
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		
		List<Integer> values = Arrays.asList(4,5,6,8);
		
		//assigning Consumer interface reference to LearningConsumerI class
		Consumer<Integer> c = new LearningConsumerI();
		values.forEach(c);
	}

	
}

 class Demo1{
	
	public static void main(String[] args) {
		
		List<Integer> values = Arrays.asList(4,5,6,8);
		
		Consumer<Integer> c = new Consumer<Integer> (){
			public void accept(Integer i) {
				System.out.println(i);
			}
		};
		
		values.forEach(c);
		
	}
}


class Demo2{
	public static void main(String[] args) {
		
		List<Integer> values = Arrays.asList(4,5,6,8);
		
		//since single statement for lamda function {} aren't manadatory
		Consumer<Integer> c = (Integer i) -> System.out.println(i);
		values.forEach(c);
		
	}
}


class Deemo3{
	
public static void main(String[] args) {
	
	List<Integer> values = Arrays.asList(4,5,6,8);
	values.forEach(i -> System.out.println(i));
}
}
