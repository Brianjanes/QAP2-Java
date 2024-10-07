public class Money {
    private long dollars;
    private long cents;

    // Constructor
    public Money(double amount) {
        long totalCents = Math.round(amount * 100);
        this.dollars = totalCents / 100;
        this.cents = totalCents % 100;
    }

    // Copy constructor
    public Money(Money other) {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }

    // Equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Money money = (Money) obj;
        return dollars == money.dollars && cents == money.cents;
    }

    // ToString method
    @Override
    public String toString() {
        return String.format("$%d.%02d", dollars, cents);
    }

    // CompareTo method
    public int compareTo(Money other) {
        if (this.dollars != other.dollars) {
            return Long.compare(this.dollars, other.dollars);
        }
        return Long.compare(this.cents, other.cents);
    }

    // Add method
    public Money add(Money other) {
        long totalCents = this.dollars * 100 + this.cents + other.dollars * 100 + other.cents;
        return new Money(totalCents / 100.0);
    }

    // Subtract method
    public Money subtract(Money other) {
        long totalCents = this.dollars * 100 + this.cents - (other.dollars * 100 + other.cents);
        return new Money(totalCents / 100.0);
    }
}