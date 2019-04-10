/**
 * Synchronized double-check lock
 */
public class ChocolateBoilerSingletonThreadSafeDobleCheckLock {
    private boolean empty;
    private boolean boiled;

    private static volatile ChocolateBoilerSingletonThreadSafeDobleCheckLock instance;

    private ChocolateBoilerSingletonThreadSafeDobleCheckLock() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoilerSingletonThreadSafeDobleCheckLock getInstance() {

        if (instance == null) {
            // Synchronized block only be run the first time
            // and this ensure every thread run this block synchronous
            synchronized (ChocolateBoilerSingletonThreadSafeDobleCheckLock.class) {
                if (instance == null)
                    instance = new ChocolateBoilerSingletonThreadSafeDobleCheckLock();
            }
        }
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
