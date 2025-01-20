public class Methods {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        String firstName = "Иванов";
        String middleName = "Семён";
        String lastName = "Семёнович";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println(fullName);

        System.out.println("Задача №2");
        System.out.println(fullName.toUpperCase());

        System.out.println("Задача №3");
        String fullName1 = fullName.replace('ё', 'е');
        System.out.println(fullName1);
    }
}