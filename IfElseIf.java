/**
 * Приминение конструкции If-lse-If
 */
public class IfElseIf {
    public static void main(String[] args) {
        int month = 9; // Апрель
        String season;
        if (month == 12 || month == 1 || month == 2)
            season = " к зиме";
        else if (month == 3 || month == 4 || month == 5)
            season = " к весне";
        else if (month == 6 || month == 7 || month == 8)
            season = " к лету";
        else if (month == 9 || month == 10 || month == 11)
            season = " к осени";
        else season = " к вымышленным месяцам";

        System.out.println("Сентябрь относится " + season);

    }
}
