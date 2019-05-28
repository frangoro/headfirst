public class ChocolateBoilerSingleton {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoilerSingleton instance;

    private ChocolateBoilerSingleton() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoilerSingleton getInstance() {
        if (instance == null)
            instance = new ChocolateBoilerSingleton();
        return instance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        } else {
            System.out.println("Warn: Already filled!");
        }
    }

    public void drain () {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

    @Override
    public String toString() {
        return "Empty: " + empty + ". Boiled: " + boiled;
    }
}
