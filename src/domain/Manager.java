package domain;

/**
 * Представляє менеджера, який є підкласом {@link Employee} та керує іншими працівниками.
 */
public class Manager extends Employee {

    /**
     * Масив працівників, якими керує менеджер.
     */
    private Employee[] employees;

    /**
     * Створює нового менеджера з вказаними працівниками, ім'ям, посадою, рівнем та відділом.
     *
     * @param employees масив підлеглих працівників
     * @param name ім’я менеджера
     * @param jobTitle посада менеджера
     * @param level рівень менеджера (1–3)
     * @param dept назва відділу
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Створює нового менеджера з вказаними працівниками.
     *
     * @param employees масив підлеглих працівників
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }

    /**
     * Створює нового менеджера з масивом працівників фіксованого розміру.
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    /**
     * Повертає строкове представлення менеджера, включаючи список імен працівників.
     *
     * @return інформація про менеджера
     */
    @Override
    public String toString() {
        return super.toString() + "\nEmployees: " + getEmployees();
    }

    /**
     * Повертає імена підлеглих працівників у вигляді строки.
     *
     * @return імена працівників, розділені комами
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s = s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює список підлеглих працівників.
     *
     * @param employees масив працівників
     */
    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    /**
     * Повертає масив підлеглих працівників.
     *
     * @return масив працівників
     */
    public Employee[] getEmployeesList() {
        return employees;
    }
}
