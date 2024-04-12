package javaBasic;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class HashMap {
    public static void main(String[] args) {

//            Map<Integer, String> states = new HashMap<Integer, String>();
            Map<Integer, String> states = new java.util.HashMap<>();

            states.put(1, "Germany");
            states.put(2, "Spain");
            states.put(4, "France");
            states.put(3, "Italy");

            // получим объект по ключу 2
            String first = states.get(2);
            System.out.println(first);
            // получим весь набор ключей
            Set<Integer> keys = states.keySet();
            System.out.println(keys);
            // получить набор всех значений
            Collection<String> values = states.values();
            System.out.println(values);
            //заменить элемент
            states.replace(1, "Poland");
            // удаление элемента по ключу 2
            states.remove(2);
            // перебор элементов
            for(Map.Entry<Integer, String> item : states.entrySet()){

                System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
            }

//            Map<String, PersonForMap> people = new HashMap<String, PersonForMap>();
            Map<String, PersonForMap> people = new java.util.HashMap<>();
            people.put("1240i54", new PersonForMap("Tom"));
            people.put("1564i55", new PersonForMap("Bill"));
            people.put("4540i56", new PersonForMap("Nick"));

            for(Map.Entry<String, PersonForMap> item : people.entrySet()){

                System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue().getName());
            }
        }
    }
    class PersonForMap {

        private String name;
        public PersonForMap(String value){

            name=value;
        }
        String getName(){return name;}
    }