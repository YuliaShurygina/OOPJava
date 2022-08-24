package robot;

public class Program {
    public static void main(String[] args) {
        // #region Robot1 development
        Robot1 robot1 = new Robot1("name_1", 1);// экземпляр

        System.out.printf("%s %d\n", robot1.name, robot1.level);
        robot1.startBIOS();
        robot1.startOS();
        robot1.sayHi();

        robot1.work();
        robot1.work();
        robot1.work();

        robot1.sayBye();
        robot1.stopOS();
        robot1.stopBIOS();

        // #region

        robot1.level = 100500;

        // #region Robo2 demo
        Robot2 robot2 = new Robot2("name_2", 1);

        System.out.printf("%s %d\n", robot2.getName(), robot2.getLevel());
        robot2.powerOn();
        robot2.work();
        robot2.powerOff();
        // #endregion

        // #region Robo3 demo
    }
}