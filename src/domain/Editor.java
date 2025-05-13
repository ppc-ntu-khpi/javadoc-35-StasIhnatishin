package domain;

/**
 * Представляє редактора як підклас художника, який має налаштування типу редагування.
 */
public class Editor extends Artist {

    /**
     * Визначає, чи редактор працює з електронним редагуванням.
     * Якщо {@code true}, використовується електронне редагування, інакше — паперове.
     */
    private boolean electronicEditing;

    /**
     * Створює редактора з усіма параметрами.
     *
     * @param electronicEditing  тип редагування (електронне або паперове)
     * @param skills             масив навичок
     * @param name               ім’я працівника
     * @param jobTitle           посада
     * @param level              рівень працівника
     * @param dept               відділ
     */
    public Editor(boolean electronicEditing, String[] skills, String name, String jobTitle, int level, String dept) {
        super(skills, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Створює редактора з навичками та типом редагування.
     *
     * @param electronicEditing  тип редагування
     * @param skills             масив навичок
     */
    public Editor(boolean electronicEditing, String[] skills) {
        super(skills);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Створює редактора з заданим типом редагування.
     *
     * @param electronicEditing  тип редагування
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }

    /**
     * Створює редактора без параметрів.
     * Тип редагування за замовчуванням — електронне.
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    /**
     * Повертає текстовий опис редактора, включаючи тип редагування.
     *
     * @return рядкове представлення редактора
     */
    @Override
    public String toString() {
        String s = super.toString() + "\nEditing preferences= ";
        if (electronicEditing)
            s += "electronic";
        else
            s += "paper";
        return s;
    }

    /**
     * Повертає тип редагування.
     *
     * @return {@code true}, якщо електронне редагування, інакше {@code false}
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * Встановлює тип редагування.
     *
     * @param electronic {@code true} — електронне, {@code false} — паперове
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing = electronic;
    }
}
