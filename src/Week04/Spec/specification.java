package Week04.Spec;

public class specification {
    public static void main(String[] args) {



    }

    /**
     * Calculates a sum by combining the hash code of the provided string
     * and the long value of the provided float.
     *
     * @param inputString the input string whose hash code will be used
     * @param inputFloat  the float value to be converted to long and combined with the string hash code
     * @return a long value representing the sum of the string's hash code and the long value of the float
     *
     */

    public static long doCalculation(String inputString, float inputFloat) {
        long floatToLong = (long) inputFloat;

        // Combine the hash code of the string with the float-to-long value
        long result = inputString.hashCode() + floatToLong;

        return result;
    }

}
