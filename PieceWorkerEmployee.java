package version1;

public class PieceWorkerEmployee {
    private int empID;
    private String empName;
    private int totalPieceFinished;
    private double ratePerPiece;

    public PieceWorkerEmployee() {
        this(0, "N/A", 0, 0.0f);
    }
    public PieceWorkerEmployee(int empID, String empName) {
        this(empID, empName, 0, 0.0f);
    }
    public PieceWorkerEmployee(int empID, String empName, int totalPieceFinished, double ratePerPiece ) {
        setEmpID(empID);
        setEmpName(empName);
        setTotalPieceFinished(totalPieceFinished);
        setRatePerPiece(ratePerPiece);
    }



    // Area for Getters & Setters :3

    public int getEmpID() {
    return empID;
    }
    public void setEmpID(int empID) {
        this.empID = empID;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName != null ? empName : "N/A";
    }
    public int getTotalPieceFinished() {
        return totalPieceFinished;
    }
    public void setTotalPieceFinished(int totalPieceFinished) {
        this.totalPieceFinished = Math.max(totalPieceFinished, 0);
    }

    private void setRatePerPiece(double ratePerPiece) {
    }

    public double getRatePerPiece() {
        return ratePerPiece;
    }
    public double computeSalary() {
        double basePay = totalPieceFinished * ratePerPiece;
        int bonusGroups = totalPieceFinished / 100;
        double bonusPay = bonusGroups * (10 * ratePerPiece);
        return basePay + bonusPay;
    }
    public void displayPieceWorkerEmployee () {
        System.out.print("ID: %d | Name: %s | Pieces Finished: %d | Rate: ₱%.2f/hr%n", empID, empName, totalPieceFinished, ratePerPiece);
    }
    @Override
    public String toString() {
        return String.format("PlaceWorkerEmployee [ID: %d, Name: %s, Pieces: %d, Rate: %.2f]",
                empID, empName, totalPieceFinished, ratePerPiece);

    }
}