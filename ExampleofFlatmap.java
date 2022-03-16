import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.*;


class ExampleofFlatmap{
    public static void main(String... args){
	List<String> list = new ArrayList<String>();

	list.add("Once You Accept ");
	list.add("You never walk alone");
	list.add("We are Together Forever");

	   Stream<String> stream = list.stream();
	   stream.flatMap(e -> {String[] split = e.split(" ");return (Stream<String>) Arrays.asList(split).stream();})
	   .forEach(System.out::println);

	}
 }
/* Output :

Once
You
Accept
You
never
walk
alone
We
are
Together
Forever
   */