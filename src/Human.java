public class Human{
    String name = "Jon Doe";
    int age;
    int height = 1;

    public Human(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        walkTo("QA");

        String profession = getProfession();
        System.out.println(profession);
    }


    public static void walkTo(String profession) {
        System.out.println("Человек идет работать: " + profession );
    }
    public static String getProfession() {
        return "QA";
    }
}