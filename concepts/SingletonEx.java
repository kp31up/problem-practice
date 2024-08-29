package concepts;

public class SingletonEx {

    private static SingletonEx instance;

    private SingletonEx() {

    }

    synchronized public static SingletonEx getInstance() {
        if (instance == null)
            instance = new SingletonEx();
        return instance;
    }
}
