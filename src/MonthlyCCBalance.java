public class MonthlyCCBalance {
    public MonthlyCCBalance() {
    }
        public static void main (String[]args) {

            double balance = 5000;
            double INTREST_RATE = 0.17;
            double firstMonthsIntrest = balance * INTREST_RATE;
            double secondMonthsIntrest = firstMonthsIntrest * INTREST_RATE;
            System.out.println("Your first months intrest payment is $ " + firstMonthsIntrest);
            System.out.println("Your second months intrest payment is $ " + secondMonthsIntrest);

        }
}
