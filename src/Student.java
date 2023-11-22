import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Клас, що представляє студента.
 */
public class Student {
    private String lastName;
    private String firstName;
    private String patronymic;
    private LocalDate birthday;
    private double averageGrade;
    private String groupNumber;

    /**
     * Конструктор класу Student.
     */
    public Student(String lastName, String firstName, String patronymic, LocalDate birthday, double averageGrade, String groupNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.averageGrade = averageGrade;
        this.groupNumber = groupNumber;
    }

    // Гетери для отримання значень полів
    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getFullName() {
        return String.join(" ", lastName, firstName, patronymic);
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    // Сетери для встановлення значень полів
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    /**
     * Перевизначений метод toString для зручного виводу інформації про студента.
     */
    @Override
    public String toString() {
        return String.format("%-15s %-10s %-15s %-17s %-8s %s", lastName, firstName,
                patronymic, birthday.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")), groupNumber, averageGrade);
    }
}
