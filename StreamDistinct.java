import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDistinct {

    public static void main(String[] args) {
        List<String> animals = new ArrayList<String>();

        animals.add("ants");
        animals.add("bats");
        animals.add("cats");
        animals.add("ants");
        animals.add("dogs");
         
        Stream<String> stream = animals.stream();
        stream.distinct().forEach(System.out::println);
  }
}
/* Output :

ants
bats
cats
dogs
*/

