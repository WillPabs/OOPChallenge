public class DeluxeBurger extends Hamburger {

    private String Chips;
    private String Drink;

    public DeluxeBurger() {
        super("Deluxe Burger", "Whole Wheat",
                "Double Meat", 7.99);
        this.Chips = "Chips";
        this.Drink = "Drink";
    }

    @Override
    public String getHamburger() {
        return "Deluxe Burger";
    }
}

class Chips {

    private String chips;

    public Chips() {
        this.chips = "Chips";
    }

    public String getChips() {
        return chips;
    }
}

class Drink {

    private String drink;

    public Drink() {
        this.drink = "Drink";
    }

    public String getDrink() {
        return drink;
    }
}

