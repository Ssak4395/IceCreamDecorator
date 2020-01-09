import com.company.IceCream;

public class ChocolateIceCream extends  IceCreamDecorator {
    public ChocolateIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double getCost() {
        return 1.0+  super.getCost();
    }
}

