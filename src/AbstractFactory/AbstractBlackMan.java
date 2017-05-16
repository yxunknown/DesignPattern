package AbstractFactory;

/**
 * Created by mevur on 2017/4/6.
 */
public abstract class AbstractBlackMan implements IHuman {
    @Override
    public void getColor() {
        System.out.println("I am black skin!");
    }

    @Override
    public void talk() {
        System.out.println("Usually, I speak english!");
    }

    @Override
    public abstract void getSex();
}
