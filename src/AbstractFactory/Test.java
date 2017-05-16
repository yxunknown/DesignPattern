package AbstractFactory;

/**
 * Created by mevur on 2017/4/6.
 */
public class Test {
    public static void main(String[] args) {
        IHumanFactory maleFactory = new MaleFactory();
        IHuman maleYellowMan = maleFactory.createYellowMan();
        maleYellowMan.talk();
        maleYellowMan.getColor();
        maleYellowMan.getSex();
    }
}
