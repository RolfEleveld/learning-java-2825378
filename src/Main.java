public class Main {

    public static double annualSalary(double hoursPerWeek, double hourlyRate){
        double result = hoursPerWeek * 52 * hourlyRate;
        return result; 
    }
    public static void main(String[] args) {
        double earn = annualSalary(1660.3, 3.65);
        System.out.println(earn);
    }

}
