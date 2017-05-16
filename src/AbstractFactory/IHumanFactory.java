package AbstractFactory;

/**
 * Created by mevur on 2017/4/6.
 */
public interface IHumanFactory {
    /**
     * create yellow man
     */
    public IHuman createYellowMan();

    /**
     * create black man
     */
    public IHuman createBlackMan();

    /**
     * create white man
     */
    public IHuman createWhiteMan();

}
