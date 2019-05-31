package in.neuw.learning;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Karanbir Singh on 5/31/2019.
 **/
public class YearSpansAman {

    public static void main(String[] args) {

        List<YearsOfSpan> yosList = new ArrayList<>();

        yosList.add(new YearsOfSpan(1902).setDeath(1991));
        yosList.add(new YearsOfSpan(1941).setDeath(1978));
        yosList.add(new YearsOfSpan(2004));
        yosList.add(new YearsOfSpan(1957));
        yosList.add(new YearsOfSpan(1989).setDeath(2008));
        yosList.add(new YearsOfSpan(1909).setDeath(2005));
        yosList.add(new YearsOfSpan(1918));
        yosList.add(new YearsOfSpan(1913).setDeath(2010));
        yosList.add(new YearsOfSpan(1979));
        yosList.add(new YearsOfSpan(1961).setDeath(2002));
        yosList.add(new YearsOfSpan(1977).setDeath(2003));
        yosList.add(new YearsOfSpan(1909).setDeath(1991));

        Stream<YearsOfSpan> yosStreamByBirth = yosList.stream().sorted(Comparator.comparingInt(YearsOfSpan::getBirth));

        List<YearsOfSpan> yosListByBirth = yosStreamByBirth.collect(Collectors.toList());

        int minYear = yosListByBirth.get(0).getBirth();

        System.out.println(minYear+" minYear");

        Stream<YearsOfSpan> yosStreamByDeath = yosList.stream().sorted(Comparator.comparingInt(YearsOfSpan::getDeath).reversed());

        List<YearsOfSpan> yosListByDeath = yosStreamByDeath.collect(Collectors.toList());

        int maxYear = yosListByDeath.get(0).getDeath();

        System.out.println(maxYear+" maxYear");

        Map<Integer, Long> popYearWise = new HashMap<>();

        for(; minYear <= maxYear ; minYear++){
            final int tempYearInt = minYear;
            popYearWise.put(
                    tempYearInt,
                    yosList.stream().filter(
                        yos -> (
                            yos.getBirth() <= tempYearInt && (tempYearInt <= yos.getDeath() || yos.getDeath() == 0)
                        )
                    ).count()
            );

        }

        popYearWise.put(
                maxYear+1,
                yosList.stream().filter(
                        yos -> (
                                yos.getDeath() == 0
                        )
                ).count()
        );

        System.out.println(popYearWise);

        /*final Map.Entry<Integer, Long> lastEntry = new CustomEntry(minYear, 0L);

        final int tempMinYear = minYear;

        System.out.println(popYearWise.entrySet().stream().filter(
                entry -> {
                    if(entry.getKey() == tempMinYear){
                        lastEntry.setValue(entry.getValue());
                    }
                    lastEntry.setValue(entry.getValue());
                    return lastEntry.getValue() < entry.getValue();
                }
        ).collect(Collectors.toList()));*/
        final Map.Entry<Integer, Long> lastEntry = new CustomEntry(minYear, 0L);

        System.out.println(popYearWise.entrySet()
                .stream()
                .filter(
                        entry -> {
                            boolean test = entry.getValue() < lastEntry.getValue();
                            lastEntry.setValue(entry.getValue());
                            return test;
                        }
                )
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));


        // debug

        /*for(YearsOfSpan yos: yosList){
            System.out.println(yos);
        }

        System.out.println("sort by birth");

        for(YearsOfSpan yos: yosListByBirth){
            System.out.println(yos);
        }*/


    }

    static class YearsOfSpan{
        private int birth;
        private int death;

        public YearsOfSpan(int birth){
            this.birth = birth;
        }

        public YearsOfSpan setDeath(int death){
            this.death = death;
            return this;
        }

        public int getBirth() {
            return birth;
        }

        public int getDeath() {
            return death;
        }

        @Override
        public String toString() {
            return "YearsOfSpan{" +
                    "birth=" + birth +
                    ", death=" + death +
                    '}';
        }
    }

    static final class CustomEntry<K, V> implements Map.Entry<K, V> {
        private final K key;
        private V value;

        public CustomEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public V setValue(V value) {
            V old = this.value;
            this.value = value;
            return old;
        }
    }

}
