package in.neuw.learning.java8.collectionchanges;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static net.andreinc.mockneat.unit.objects.Filler.filler;
import static net.andreinc.mockneat.unit.types.Ints.ints;
import static net.andreinc.mockneat.unit.user.Names.names;

/**
 * Created by Karanbir Singh on 11/23/2018.
 **/
public class Runner {

    public static List<Person> mockData() {
        List<Person> p = filler(() -> new Person())
                .setter(Person::setId, ints().bound(100000))
                .setter(Person::setName, names().full())
                .setter(Person::setAge, ints().range(1, 110))
                .list(() -> new ArrayList<>(), 10) // Collecting all the results ina  List of 10 elements.
                .get();
        //System.out.println(p);
        return p;
    }

    public static void main(String[] args) {

        List<Person> persons = mockData();

        System.out.println(persons);

        /*persons.add(new Person(1,"Karanbir Singh",29));
        persons.add(new Person(2,"Surinder Singh",56));
        persons.add(new Person(3,"Rajnit Kaur",53));
        persons.add(new Person(4,"Gurkirat Kaur",29));
        persons.add(new Person(5,"Harmeet Singh",30));
        persons.add(new Person(6,"Kiratleen Kaur",25));
        persons.add(new Person(7,"Kainaaz Kaur",1));*/

        //persons.stream().forEachOrdered(System.out::println);

        List<Person> filteredPersons = persons
                .stream()
                .filter(person -> {
                    System.out.println(person);
                    return person.getAge() <= 20;
                })
                //.sorted((p1,p2)->p1.getAge().compareTo(p2.getAge()))
                .sorted(Comparator.comparingInt(Person::getAge))
                .collect(Collectors.toList());

        System.out.println(filteredPersons);

    }

}
