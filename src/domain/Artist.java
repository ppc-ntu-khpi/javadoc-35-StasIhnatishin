package domain;

/**
 * Представляє художника як підклас працівника з додатковим набором навичок.
 */
public class Artist extends Employee {

    /**
     * Масив, що зберігає навички художника.
     */
    private String[] skills;

    /**
     * Створює художника з усіма основними параметрами.
     *
     * @param skills   масив навичок
     * @param name     ім’я працівника
     * @param jobTitle посада
     * @param level    рівень працівника
     * @param dept     назва відділу
     */
    public Artist(String[] skills, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skills = skills;
    }

    /**
     * Створює художника з заданими навичками.
     *
     * @param skills масив навичок
     */
    public Artist(String[] skills) {
        super();
        this.skills = skills;
    }

    /**
     * Створює художника без параметрів та ініціалізує масив навичок на 10 елементів.
     */
    public Artist() {
        super();
        this.skills = new String[10];
    }

    /**
     * Повертає рядок з описом працівника разом із його навичками.
     *
     * @return текстовий опис художника
     */
    @Override
    public String toString() {
        return super.toString() + "\nSkills: " + getSkills();
    }

    /**
     * Формує рядок зі списком навичок, розділених комами.
     *
     * @return навички у вигляді рядка
     */
    public String getSkills() {
        String s = "";
        for (String e : skills) {
            s += e + ", ";
        }
        s = s.substring(0, s.length() - 2); // прибирає останню кому
        return s;
    }

    /**
     * Встановлює новий список навичок.
     *
     * @param skills масив навичок
     */
    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    /**
     * Повертає масив навичок.
     *
     * @return масив навичок
     */
    public String[] getSkillsList() {
        return skills;
    }
}
