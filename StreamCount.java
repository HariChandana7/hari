import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamCount {

    public static void main(String[] args) {
        List<String> animals = new ArrayList<String>();

        animals.add("ants");
        animals.add("bats");
        animals.add("cats");
        animals.add("ants");
        animals.add("dogs");
         
        Stream<String> stream = animals.stream();

        long count = stream .map(e -> (e.toUpperCase())).count();
        System.out.println("count = " + count);

    }
}
// Output : count = 5