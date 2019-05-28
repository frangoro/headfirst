/**
 * Synchronized lazy initialize
 */
public class ChocolateBoilerSingletonThreadSafe {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoilerSingletonThreadSafe instance;

    private ChocolateBoilerSingletonThreadSafe() {
        empty = true;
        boiled = false;
    }

    /**
     * This ensure every thread run this method synchronous.
     * However it have a bad performance.
     */
    public static synchronized ChocolateBoilerSingletonThreadSafe getInstance() {
        if (instance == null)
            instance = new ChocolateBoilerSingletonThreadSafe();
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
