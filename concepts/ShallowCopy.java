package concepts;


class Test {
    int x, y;
}

class Original implements Cloneable {
    int a;   //primitive datatype: clone() of Original creates deep copy
    String b;   //Immutable object: clone() of Original creates deep copy
    Test c = new Test();    //Nested object: clone() of Original creates shallow copy
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}

// Driver class
public class ShallowCopy {
    public static void main(String args[]) throws CloneNotSupportedException {
        Original original = new Original();
        original.a = 10;
        original.b = "old";
        original.c.x = 30;
        original.c.y = 40;

        Original copy = (Original)original.clone();

        // Change in primitive type of copy will not be reflected in original fields.
        copy.a = 100;
        copy.b = "new";

        // Change in object type fields(Test c) will be reflected in both copy and original(shallow copy)
        copy.c.x = 300;
        copy.c.y = 400;

        System.out.println("Original object: "+ original.a + " " + original.b + " " + original.c.x + " " + original.c.y);
        System.out.println("Cloned object: "+ copy.a + " " + copy.b + " " + copy.c.x + " " + copy.c.y);

        System.out.println("Does clone point to original obj's location: " + original.equals(copy));
    }
}
