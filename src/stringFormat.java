import java.util.Formatter;

public class stringFormat {
    public static void main(String[] args) {
        StringBuilder sbuf = new StringBuilder();
        Formatter fmt = new Formatter(sbuf);
        fmt.format("PI = %f%n", Math.PI);
        System.out.print(sbuf.toString());
        System.out.println();
        String header = String.format("%-12s%-12s%s","Column 1","Column 2","Column3");
        String row = String.format("%-12d%-12d%07d", 15, 12, 5);
        System.out.println(header);
        System.out.println(row);
        // Custom integer number
        int num = 7044;

        // Output is 3 zero's("000") + "7044",
        // in total 7 digits
        String str = String.format("%07d", num);

        // Print and display the formatted string
        System.out.println(str);
    }
}
