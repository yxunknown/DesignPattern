package AbstractFactory;

/**
 * Created by mevur on 2017/4/6.
 */
public class MaleFactory implements IHumanFactory {
    @Override
    public IHuman createYellowMan() {
        return new MaleYellowMan();
    }

    @Override
    public IHuman createBlackMan() {
        return new MaleBlackMan();
    }

    @Override
    public IHuman createWhiteMan() {
        return new MaleWhiteMan();
    }
}
