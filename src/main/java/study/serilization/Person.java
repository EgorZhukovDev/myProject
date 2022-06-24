package study.serilization;

import java.io.Serializable;

public class Person implements Serializable {
    private final int id;
    private String name;
    private float serial;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person(int id, String name, float serial) {
        this.id = id;
        this.name = name;
        this.serial = serial;
    }

    @Override
    public String toString() {
        return id + " : " + name;
    }

    public String toStringFull() {
        return "ID " + id + " : " + name + " Serial " + serial;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
