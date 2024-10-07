// Demonstrates the CreditCard class
public class CreditCardDemo {
    public static void main(String[] args) {
        // Initialize constants
        final Money LIMIT = new Money(1000);
        final Money FIRST_AMOUNT = new Money(200);
        final Money SECOND_AMOUNT = new Money(10.02);
        final Money THIRD_AMOUNT = new Money(25);
        final Money FOURTH_AMOUNT = new Money(990);

        // Create a Person object
        Person owner = new Person("Christie", "Diane", 
            new Address("237J Harvey Hall", "Menomonie", "WI", "54751"));

        // Create a CreditCard object
        CreditCard visa = new CreditCard(owner, LIMIT);

        // Display initial information
        System.out.println(visa.getPersonals());
        System.out.println("Balance: " + visa.getBalance());
        System.out.println("Credit Limit: " + visa.getCreditLimit());
        System.out.println();

        // Perform transactions
        performTransaction(visa, "charge", FIRST_AMOUNT);
        performTransaction(visa, "charge", SECOND_AMOUNT);
        performTransaction(visa, "payment", THIRD_AMOUNT);
        performTransaction(visa, "charge", FOURTH_AMOUNT);
    }

    private static void performTransaction(CreditCard card, String type, Money amount) {
        System.out.println("Attempt to " + type + " " + amount);
        if (type.equals("charge")) {
            card.charge(amount);
        } else if (type.equals("payment")) {
            card.payment(amount);
        }
        System.out.println("Balance: " + card.getBalance());
        System.out.println();
    }
}