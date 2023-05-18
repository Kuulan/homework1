package homework6;

public class Vivaldi {
    public static void main(String[] args) {
        String[] seasons = new String[4];
        seasons[0] = "Winter";
        seasons[1] = "Spring";
        seasons[2] = "Summer";
        seasons[3] = "Fall";
        //При помощи конструкции switch-case сделать вывод в консоль месяцев, соответствующих времени года

        for (int i = 0; i < seasons.length; i++) {
            String season = seasons[i];
            switch(season) {
                case "Winter":
                    System.out.println("December, January, February");
                    break;
                case "Spring":
                    System.out.println("March, April, May");
                    break;
                case "Summer":
                    System.out.println("June, July, August");
                    break;
                case "Fall":
                    System.out.println("September, October, November");
                    break;
                default:
                    break;
            }
        }
//Выбор времени года реализовать через псевдорандом Math.
        int randomNum = 0 + (int)(Math.random() * seasons.length);
        System.out.println(seasons[randomNum]);
    }
}
