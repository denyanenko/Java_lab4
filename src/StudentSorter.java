import java.util.Arrays;
import java.util.Comparator;
import java.time.LocalDate;

/**
 * Клас, який містить виконавчий метод для сортування масиву студентів.
 */
public class
StudentSorter {

    public static void main(String[] args) {
        // Створення масиву об'єктів класу Student
        Student[] students = {
                new Student("Петренко","Петро",  "Петрович",LocalDate.of(2004,7,13), 78.2, "ІС-11"),
                new Student(  "Іваненко","Іван", "Іванович", LocalDate.of(2004,3,26), 85.5, "ІС-11"),
                new Student( "Якименко", "Марія", "Олегівна",LocalDate.of(2003,11,23), 92.0, "ІС-01"),
                new Student( "Коваленко","Вікторія",  "Максимівна",LocalDate.of(2005,2,17), 89.7, "ІС-21"),
                new Student( "Степаненко", "Олександра",  "Олексіївна",LocalDate.of(2005,9,11), 76.5, "ІС-21"),
                new Student("Ковальчук", "Дарина", "Ігорівна", LocalDate.of(2004, 8, 5), 88.0, "ІС-11"),
                new Student("Біленький", "Андрій", "Андрійович", LocalDate.of(2005, 5, 18), 79.5, "ІС-21"),
                new Student("Журавель", "Юлія", "Володимирівна", LocalDate.of(2003, 12, 30), 94.2, "ІС-01"),
                new Student("Гриценко", "Михайло", "Сергійович", LocalDate.of(2005, 3, 14), 82.8, "ІС-21"),
                new Student("Шевченко", "Катерина", "Василівна", LocalDate.of(2004, 10, 9), 95.2, "ІС-11")
        };

        // Сортування масиву за різними полями
        Arrays.sort(students, Comparator.comparing(Student::getGroupNumber).thenComparing(student-> -student.getAverageGrade())); //за номером групи в порядку зростання, а в межах кожної групи за середнім балом в порядку спадання
        System.out.println("\nСортування за номером групи в порядку зростання, а в межах кожної групи за середнім балом в порядку спадання:\n");
        printStudents(students);

        Arrays.sort(students, Comparator.comparing(Student::getGroupNumber).thenComparing(Student::getFullName)); //за номером групи в порядку зростання, а в межах кожної групи за алфавітом(зростання):
        System.out.println("\nСортування за номером групи в порядку зростання, а в межах кожної групи за алфавітом(зростання):\n");
        printStudents(students);
    }

    /**
     * Метод для виведення інформації про студентів.
     */
    private static void printStudents(Student[] students) {
        System.out.println("\u001B[1m"+ String.format("%-15s %-10s %-15s %-17s %-8s %s","Прізвище", "Ім'я", "По-батькові", "Дата народження", "Група", "Середній бал")+"\u001B[0m");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
