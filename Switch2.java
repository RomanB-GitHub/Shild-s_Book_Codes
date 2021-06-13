
public class Switch2 {

    public static void main(String[] args) {
        int month = 4;
        String season = null;

        switch (month) {
            case 12:
            case 1:
            case 2:
                season = " к зиме";
                break;
            case 3:
            case 4:
            case 5:
                season = " к весне";
                break;
            case 6:
            case 7:
            case 8:
                season = "к лету";
                break;
            case 9:
            case 10:
            case 11:
                season = "к осени";
                break;
            default:
                System.out.println("Вымишленный месяц");
        }
        System.out.println("Месяц апрель относится " + season + ".");
    }
}
