/**
 * Eager initialize
 */
public class ChocolateBoilerSingletonThreadSafeEager {
    private boolean empty;
    private boolean boiled;

    // It always be created (but before any thread run)
    private static ChocolateBoilerSingletonThreadSafeEager instance = new ChocolateBoilerSingletonThreadSafeEager();

    private ChocolateBoilerSingletonThreadSafeEager() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoilerSingletonThreadSafeEager getInstance() {
        if (instance == null)
            instance = new ChocolateBoilerSingletonThreadSafeEager();
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
