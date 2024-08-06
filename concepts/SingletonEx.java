package concepts;

public class SingletonEx {

    private static SingletonEx instance;

    public SingletonEx() {

    }

    public static SingletonEx getInstance() {
        if (instance == null)
            instance = new SingletonEx();
        return instance;
    }
}
