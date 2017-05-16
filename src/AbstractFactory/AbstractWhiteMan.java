package AbstractFactory;

/**
 * Created by mevur on 2017/4/6.
 */
public abstract class AbstractWhiteMan implements IHuman {
    @Override
    public void getColor() {
        System.out.println("I have white skin.");
    }

    @Override
    public void talk() {
        System.out.println("I speak English.");
    }

    @Override
    public abstract void getSex();
}
