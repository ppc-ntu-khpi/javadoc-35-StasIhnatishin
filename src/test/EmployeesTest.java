package test;

import domain.*;

/**
 * Клас для тестування створення та виведення об'єктів працівників, редакторів, художників та менеджерів.
 * 
 * <p>У цьому класі демонструється створення об'єктів різних типів працівників, 
 * зокрема {@link Employee}, {@link Editor}, {@link Artist}, {@link Manager}, 
 * а також взаємодія між ними через виведення даних.</p>
 */
public class EmployeesTest {

    /**
     * Точка входу в програму, де створюються та виводяться об'єкти працівників.
     * 
     * <p>Створює об'єкти типів {@link Editor}, {@link Employee}, {@link Artist}, 
     * і менеджера {@link Manager}, а потім виводить інформацію про менеджера.</p>
     * 
     * @param args аргументи командного рядка (не використовуються)
     */
    public static void main(String args[]) {

        // Створення навичок для художника та редактора
        String[] skills = {"Microsoft Word", "TeX", "OpenOffice", "Markdown"};

        // Створення об'єкта редактора
        Editor ed = new Editor(true, skills, "Phil Coulson", "Chief Editor", 3, "Publishing");

        // Створення об'єкта працівника
        Employee em = new Employee("Melinda May", "Assistant", 1, "Publishing");

        // Створення об'єкта художника
        Artist art = new Artist(skills);

        // Створення масиву працівників для менеджера
        Employee[] people = {ed, em, art};

        // Створення об'єкта менеджера
        Manager man = new Manager(people, "Steve Ballmer", "CEO", 3, "Publishing");

        // Виведення інформації про менеджера
        System.out.println(man);
    }
}
