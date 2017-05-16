package AbstractFactory;

/**
 * Created by mevur on 2017/4/6.
 */
public class FemaleFactory implements IHumanFactory {
    @Override
    public IHuman createYellowMan() {
        return new FemaleYellowMan();
    }

    @Override
    public IHuman createBlackMan() {
        return new FemaleBlackMan();
    }

    @Override
    public IHuman createWhiteMan() {
        return new FemaleWhiteMan();
    }
}
