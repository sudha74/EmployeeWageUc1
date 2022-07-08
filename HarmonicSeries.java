public class HarmonicSeries {
    // this is the main function
    public static void main(String[] args) {

        // num is the number of values we want in a series
        int num = 5;
        double result = 0.0;
        System.out.println("The harmonic series is :");
        // printing harmonic values till num value
        // using the while loop
        while (num > 0) {
            // calculating harmonics values
            result = result + (double) 1 / num;
            // after calcilating harmonic value
            //decrementing num by 1 which means the common
            // difference is 1
            num--;
            System.out.println(result + ", ");
        }
    }
}
