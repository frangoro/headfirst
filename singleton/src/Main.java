public class Main {

    public static void main(String[] args) {

        ChocolateBoiler boiler = new ChocolateBoiler();

        System.out.println("Wanted behaviour: ");
        System.out.println("Status: " + boiler);
        boiler.fill();
        System.out.println("Status: " + boiler);
        boiler.boil();
        System.out.println("Status: " + boiler);
        boiler.drain();
        System.out.println("Status: " + boiler);

        System.out.println("\nUnwanted behaviour: ");
        boiler.fill();
        System.out.println("Status: " + boiler);
        boiler.boil();
        System.out.println("Status: " + boiler);
        boiler = new ChocolateBoiler();
        boiler.fill();
        System.out.println("Status: " + boiler);
        System.out.println("The boiler was filled when it was already filled. ");

        System.out.println("\n\nBoiler unique\n");

        ChocolateBoilerSingleton boilerUnique = ChocolateBoilerSingleton.getInstance();

        System.out.println("Wanted behaviour: ");
        System.out.println("Status: " + boilerUnique);
        boilerUnique.fill();
        System.out.println("Status: " + boilerUnique);
        boilerUnique.boil();
        System.out.println("Status: " + boilerUnique);
        boilerUnique.drain();
        System.out.println("Status: " + boilerUnique);

        System.out.println("\nRemains the wanted behaviour: ");
        boilerUnique.fill();
        System.out.println("Status: " + boilerUnique);
        boilerUnique.boil();
        System.out.println("Status: " + boilerUnique);
        boilerUnique = ChocolateBoilerSingleton.getInstance();
        boilerUnique.fill();
        System.out.println("Status: " + boilerUnique);
        System.out.println("The boiler was not filled twice. ");


    }
}
