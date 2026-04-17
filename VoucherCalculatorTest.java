public class VoucherCalculatorTest {
    public static void main(String[] args) {
        VoucherCalculator vc = new VoucherCalculator();

        double result = vc.calculateFinalPrice(100, 20, 200);

        if (result < 0) {
            System.out.println("FAIL");
            System.exit(1); // rất quan trọng → làm pipeline FAIL
        } else {
            System.out.println("PASS");
        }
    }
}
