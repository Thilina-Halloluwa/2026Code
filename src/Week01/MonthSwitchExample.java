package Week01;

public class MonthSwitchExample {

    public static void main(String[] args) {
        int x = 2;
        String month;

        switch (x) {
            case 1 -> {
                month = "Jan";
            }
            case 2 -> {
                month = "Feb";
            }
            case 3 -> {
                month = "Mar";
            }
            case 4 -> {
                month = "Apr";
            }
            case 5 -> {
                month = "May";
            }

            default -> {
                month = "Unknown";
            }
        }
        System.out.println(month);
    }
}
