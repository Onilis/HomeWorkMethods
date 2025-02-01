public class Methods {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        System.out.println("Задача №2");
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());

        System.out.println("Задача №3");
        String firstName1 = "Иванов";
        String middleName1 = "Семён";
        String lastName1 = "Семёнович";
        String fullName1 = firstName1 + " " + middleName1 + " " + lastName1;
        String fullName2 = fullName1.replace('ё', 'е');
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName2);
    }
}