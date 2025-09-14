public class Main {
    public static void main(String[] args) {
        ComputerDirector factory = new ComputerDirector();

        Computer gaming = factory.buildGamingRig();
        Computer office = factory.buildOfficePC();
        Computer budget = factory.buildBudgetLaptop();

        System.out.println("Gaming Setup: " + gaming);
        System.out.println("Office Machine: " + office);
        System.out.println("Budget Laptop: " + budget);
    }
}