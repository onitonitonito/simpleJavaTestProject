public class test1JavaFirstTry {
    static String[] month = {"January", "Febuary", "March", "April", "May",
            "June", "July", "August", "September", "October", "November", "December"};

    public static void demoPrint()  {
        String prural = "";
        for (int i=0; i < 10; i++) {
            if (i > 1) {
                prural = "s";
            }
            System.out.printf("Now, you've been coding for %s day%s \n", i, prural);
        }
    }

    public static void demoThreeIfState(int monthOfNumber)  {
        if (monthOfNumber == 12 || monthOfNumber < 3)  {
            System.out.printf(
                    "\n\nThe month is %s, and the Season is '%s'",
                    month[monthOfNumber-1],
                    "Winter");
        }
    }

    public static void main(String[] args) {
        demoPrint();
        demoThreeIfState(12);
    }
}
