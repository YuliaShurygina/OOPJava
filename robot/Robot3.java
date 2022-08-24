package robot;

import java.util.ArrayList;

public class Robot3 {

    enum State {
        On, Off
    }

    /** Статические поля */
    private static int defaultIndex;
    private static ArrayList<String> names;

    static {
        defaultIndex = 1;
        names = new ArrayList<String>();
    }
     
    /** Уровень робота */
    private int level;

    /** Robot's name */
    private String name;
    /** Состояние */
    private State state;

    /**
     * Создание робота
     * 
     * @param name  Имя робота !Не должно начинаться с цифры
     * @param level Уровень робота
     */

    public Robot3(String name, int level) {
        if ((name.isEmpty()
            || Character.isDigit(name.charAt(0)))
            || Robot3.names.indexOf(name) == -1)
        {
            this.name = String.format("DefaultName_%d", defaultIndex + 1);
        } else{
            this.name = name;
        }
        Robot3.names.add(this.name);
        this.level = level;
        //#region Инициализация начального состояния(выключен)
        this.state = State.Off;
       
    }

    //public Robot3(String name) {
    //    if ((name.isEmpty()
    //        || Character.isDigit(name.charAt(0)))
    //        || Robot3.names.indexOf(name) == -1)
    //   {
    //        this.name = String.format("DefaultName_%d", defaultIndex + 1);
    //    } else{
    //        this.name = name;
    //    }
    //    Robot3.names.add(this.name);
    //    this.level = 1;
        //#region Инициализация начального состояния(выключен)
    //    this.state = State.Off;
    //}

    //public Robot3() {
    //  
    //   {
    //   this.name = String.format("DefaultName_%d", defaultIndex + 1);
    //   Robot3.names.add(this.name);
    //   this.level = 1;
        //#region Инициализация начального состояния(выключен)
    //   this.state = State.Off;
    //}

    // Методы вкл\выкл подсистем

    /** Включение */
    public void powerOn() {
        this.startBIOS();
        this.startOS();
        this.sayHi();
    }

    /** Выключение */
    public void powerOff() {
        this.sayBye();
        this.stopOS();
        this.stopBIOS();
    }

    /** отдельные методы на чтение */
    public int getLevel() {
        return this.level;
    }

    public String getName() {
        return this.name;
    }

    /** Загрузка BIOS */
    private void startBIOS() {
        System.out.println("Start BIOS...");
    }

    /** Загрузка OS */
    private void startOS() {
        System.out.println("Start OS...");
    }

    /** Приветствие */
    private void sayHi() {
        System.out.println("Hello world...");
    }

    /** Выгрузка BIOS */
    private void stopBIOS() {
        System.out.println("Stop BIOS...");
    }

    /** Выгрузка OS */
    private void stopOS() {
        System.out.println("Stop OS...");
    }

    /** Прощание */
    private void sayBye() {
        System.out.println("Bye...");
    }

    /** Работа */
    public void work() {
        System.out.println("Working...");
    }

}

}
