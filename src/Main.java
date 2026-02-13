public class Main {
    public static void main(String[] args) {
        double springCost = 150.00;
        double summerCost = 225.50;
        double fallCost = 175.25;
        double winterCost = 300.75;

        double totalYearlyCost = springCost + summerCost + fallCost + winterCost;

        System.out.println("Maintenance Cost Analysis:");
        System.out.println("Spring Cost: $" + springCost);
        System.out.println("Summer Cost: $" + summerCost);
        System.out.println("Fall Cost:   $" + fallCost);
        System.out.println("Winter Cost: $" + winterCost);
        System.out.println("Total Yearly Maintenance Cost: $" + totalYearlyCost);
    }
}