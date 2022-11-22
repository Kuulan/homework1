import java.util.Objects;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        System.out.println("Привет! Добро пожаловать в игру, кто хочет стать умненькой булочкой:)");
        System.out.println("Кто обитает на дне океана?");
        System.out.println("Варианты ответа:");
        String correctAnswer = "Спанч Боб";
        System.out.println(correctAnswer);
        String optionTwo = "Киану Ривз";
        System.out.println(optionTwo);
        String optionThree = "Кракен";
        System.out.println(optionThree);
        String optionFour = "Твоя самооценка";
        System.out.println(optionFour);
        System.out.println("Ответ:");

        Scanner in = new Scanner(System.in);
        String userAnswerOne = in.nextLine();

        if(Objects.equals(userAnswerOne, correctAnswer)){
            System.out.println("Ты прикатически умная булочка!");
            System.out.println("Кто основал пирамиду основных потребностей человека?");
            System.out.println("Варианты ответа:");
            String questionTwoOptionOne = "Стив Джобс";
            System.out.println(questionTwoOptionOne);
            String questionTwoOptionTwo = "Масло Абраш";
            System.out.println(questionTwoOptionTwo);
            String questionTwoCorrectAnswer = "Абрахам Маслоу";
            System.out.println(questionTwoCorrectAnswer);
            String questionTwoOptionThree = "Хеопс";
            System.out.println(questionTwoOptionThree);
            System.out.println("Ответ:");

           String userAnswerTwo = in.nextLine();

            if(Objects.equals(userAnswerTwo, questionTwoCorrectAnswer)){
                System.out.println("Ты умная булочка!");
            } else {
                System.out.println("Ой, ты проиграл, начни сначала!");
            }


        } else {
            System.out.println("Ой, ты проиграл, начни сначала!");
        }


    }
}

