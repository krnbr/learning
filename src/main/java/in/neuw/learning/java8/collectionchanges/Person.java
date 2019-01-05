package in.neuw.learning.java8.collectionchanges;

import java.util.function.Consumer;
import java.util.function.Supplier;

import static net.andreinc.mockneat.unit.types.Ints.ints;
import static net.andreinc.mockneat.unit.user.Names.names;

public class Person{

    private Integer id;
    private String name;
    private Integer age;

    public Consumer<String> set_name = this::setName;

    public Supplier<String> get_name = this::getName;

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

    public static Supplier<Person> random_person = () -> new Person(
                                                    ints().bound(100000).get(),
                                                    names().full().get(),
                                                    ints().range(1, 110).get());
    public static Person new_person = random_person.get();

}