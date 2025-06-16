public class Main {
    public static void main(String[] args) {
        Computer gamingPC = new Computer.Builder("Intel i9", "32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 4090")
                .build();

        Computer budgetPC = new Computer.Builder("Intel i5", "8GB")
                .setStorage("512GB HDD")
                .build();

        System.out.println("Gaming PC Specs:");
        gamingPC.showSpecs();

        System.out.println("\nBudget PC Specs:");
        budgetPC.showSpecs();
    }
}
