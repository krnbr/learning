package in.neuw.learning.java8.collectionchanges;

import java.util.ArrayList;
import java.util.List;

import static net.andreinc.mockneat.unit.objects.Filler.filler;
import static net.andreinc.mockneat.unit.types.Ints.ints;
import static net.andreinc.mockneat.unit.user.Names.names;
import static net.andreinc.mockneat.unit.user.Users.users;

/**
 * Created by Karanbir Singh on 11/23/2018.
 **/
public class Runner {

    public static void mockData(){
        List<Person> p = filler(() -> new Person())
                //.setter(Person::setAge, )
                .setter(Person::setId, ints().bound(100000))
                .setter(Person::setName, names().full())
                .setter(Person::setAge, ints().range(1,110))
                .list(() -> new ArrayList<>(), 10) // Collecting all the results ina  List of 10 elements.
                .get();
        System.out.println(p);
    }

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person(1,"Karanbir Singh",29));
        persons.add(new Person(2,"Surinder Singh",56));
        persons.add(new Person(3,"Rajnit Kaur",53));
        persons.add(new Person(4,"Gurkirat Kaur",29));
        persons.add(new Person(5,"Harmeet Singh",30));
        persons.add(new Person(6,"Kiratleen Kaur",25));
        persons.add(new Person(7,"Kainaaz Kaur",1));

        //persons.stream().forEachOrdered(System.out::println);

        persons.stream().filter(person -> {
            System.out.println(person);
            return person.getId()<=3;
        });

        System.out.println(persons);

        mockData();

    }

}

class Person{

    private Integer id;
    private String name;
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person(){

    }

    public Person(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
