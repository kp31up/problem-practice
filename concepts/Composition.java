package concepts;
import java.util.ArrayList;
import java.util.List;

class Parent {

    private String job;
    private List<Child> children;

    Parent(String job) {
        this.job = job;
        this.children = new ArrayList<>();
    }

    void addChild(String name, int div) {
        this.children.add(new Child(name, div));
    }

    class Child {
        private String name;
        private int division;

        Child(String name, int div) {
            this.name = name;
            this.division = div;
        }
    }
}

public class Composition {
    public static void main(String[] args){
        Parent parent = new Parent("Army");
        Parent.Child child1 = parent.new Child("Alice", 3);

        parent.addChild("Vicky", 5);
    }
}
