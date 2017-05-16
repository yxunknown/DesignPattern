package AbstractFactory;

/**
 * Created by mevur on 2017/4/6.
 */
public abstract class AbstractYellowMan implements IHuman {
    @Override
    public void getColor() {
        System.out.println("I have yellow skin.");
    }

    @Override
    public void talk() {
        System.out.println("I speak Chinese.");
    }

    @Override
    public abstract void getSex();
}
