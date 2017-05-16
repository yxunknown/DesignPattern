package AbstractFactory;

/**
 * Created by mevur on 2017/4/6.
 */
public class FemaleYellowMan extends AbstractYellowMan {
    @Override
    public void getSex() {
        System.out.println("I am female.");
    }
}
