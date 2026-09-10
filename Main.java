package version1;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Hourly Employee Test ---");


        HourlyEmployee hourly1 = new HourlyEmployee(101, "Alice Smith");
        hourly1.setTotalHoursWorked(45.0f);
        hourly1.setRatePerHour(200.0);
        hourly1.displayHourlyEmployee();
        System.out.println(hourly1);


        HourlyEmployee hourly2 = new HourlyEmployee(102, "Bob Johnson", 38.0f, 250.0);
        hourly2.displayHourlyEmployee();
        System.out.println(hourly2);

        System.out.println("\n--- Piece Worker Employee Test ---");

        PieceWorkerEmployee piece1 = new PieceWorkerEmployee(201, "Bob Jones");
        piece1.setTotalPiecesFinished(250);
        piece1.setRatePerPiece(15.0);
        piece1.displayPieceWorkerEmployee();
        System.out.println(piece1);


        PieceWorkerEmployee piece2 = new PieceWorkerEmployee(202, "Carol White", 150, 20.0);
        piece2.displayPieceWorkerEmployee();
        System.out.println(piece2);

        System.out.println("\n--- Commission Employee Test ---");

        CommissionEmployee comm1 = new CommissionEmployee(301, "David Brown");
        comm1.setTotalSale(75000.0);
        comm1.displayCommissionEmployee();
        System.out.println(comm1);


        CommissionEmployee comm2 = new CommissionEmployee(302, "Eve Green", 200000.0);
        comm2.displayCommissionEmployee();
        System.out.println(comm2);

        System.out.println("\n--- Base Plus Commission Employee Test ---");


        BasePlusCommissionEmployee base1 = new BasePlusCommissionEmployee(401, "Frank Black");
        base1.setTotalSale(120000.0);
        base1.setBaseSalary(5000.0);
        base1.displayBasePlusCommissionEmployee();
        System.out.println(base1);


        BasePlusCommissionEmployee base2 = new BasePlusCommissionEmployee(402, "Grace Blue", 600000.0, 8000.0);
        base2.displayBasePlusCommissionEmployee();
        System.out.println(base2);
    }
}