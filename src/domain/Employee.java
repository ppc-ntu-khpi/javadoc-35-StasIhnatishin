package domain;

/**
 * Представляє працівника із загальними властивостями: ім’я, посада, рівень, відділ і ID.
 */
public class Employee {

    /**
     * Ім’я працівника.
     */
    private String name;

    /**
     * Посада працівника.
     */
    private String jobTitle;

    /**
     * Унікальний ідентифікатор працівника.
     */
    private int ID;

    /**
     * Рівень працівника (1–3).
     */
    private int level;

    /**
     * Відділ, у якому працює працівник.
     */
    private String dept;

    /**
     * Повертає текстове представлення працівника.
     *
     * @return рядок з основною інформацією про працівника
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID +
               "\nName= " + name +
               "\nJobTitle= " + jobTitle +
               "\nLevel= " + level +
               "\nDept= " + dept;
    }

    /**
     * Конструктор для створення працівника з усіма параметрами.
     *
     * @param name      ім’я працівника
     * @param jobTitle  посада
     * @param level     рівень (1–3), інші значення автоматично змінюються на 1
     * @param dept      відділ
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this(); // Викликає конструктор за замовчуванням для генерації ID
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }

    /**
     * Конструктор за замовчуванням, який автоматично генерує випадковий ID.
     */
    public Employee() {
        ID = (int) (Math.random() * 1000);
        // Примітка: ID > 10000 можна було перевірити тут (див. закоментований код)
    }

    /**
     * Встановлює посаду працівника.
     *
     * @param job нова посада
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }

    /**
     * Повертає посаду працівника.
     *
     * @return поточна посада
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Повертає ім’я працівника.
     *
     * @return ім’я
     */
    public String getName() {
        return name;
    }

    /**
     * Встановлює рівень працівника. Допустимі значення — 1, 2, або 3. 
     * Всі інші значення встановлюються як 1.
     *
     * @param level рівень працівника
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }

    /**
     * Повертає рівень працівника.
     *
     * @return рівень
     */
    public int getLevel() {
        return level;
    }

    /**
     * Повертає відділ працівника.
     *
     * @return назва відділу
     */
    public String getDept() {
        return dept;
    }

    /**
     * Встановлює назву відділу.
     *
     * @param dept нова назва відділу
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * Встановлює ім’я працівника. Ім’я має відповідати шаблону:
     * <pre>
     *     Ім’я Прізвище (англійськими літерами, з підтримкою дефісів, апострофів, крапок).
     * </pre>
     * У випадку неправильного формату встановлюється "John Doe".
     *
     * @param name ім’я працівника
     */
    public void setName(String name) {
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
