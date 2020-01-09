import com.company.IceCream;

public class PecanIceCream extends  IceCreamDecorator {
    public PecanIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double getCost() {
        return 1.5+  super.getCost();
    }
}