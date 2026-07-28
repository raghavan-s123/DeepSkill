public class SingletonPatternExample {
    private static SingletonPatternExample instance;

    private SingletonPatternExample() {
    }

    public static SingletonPatternExample getInstance() {
        if (instance == null) {
            instance = new SingletonPatternExample();
        }
        return instance;
    }

    public void display() {
        System.out.println("Singleton Instance Created");
    }

    public static void main(String[] args) {
        SingletonPatternExample obj1 = SingletonPatternExample.getInstance();
        SingletonPatternExample obj2 = SingletonPatternExample.getInstance();

        obj1.display();

        if (obj1 == obj2) {
            System.out.println("Same Instance");
        } else {
            System.out.println("Different Instances");
        }
    }
}
