class ComputerDirector {
    public Computer buildGamingRig() {
        return new Computer.Builder()
                .processor("Intel i9")
                .ram("32GB DDR5")
                .storage("1TB NVMe SSD")
                .assemble();
    }

    public Computer buildOfficePC() {
        return new Computer.Builder()
                .processor("Intel i5")
                .ram("16GB DDR4")
                .storage("512GB SSD")
                .assemble();
    }

    public Computer buildBudgetLaptop() {
        return new Computer.Builder()
                .processor("AMD Ryzen 3")
                .ram("8GB DDR4")
                .storage("256GB SSD")
                .assemble();
    }
}