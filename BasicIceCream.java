import com.company.IceCream;

public class BasicIceCream implements IceCream {

    final double cost = 3.20;

    public BasicIceCream() {
    }

    @Override
    public double getCost() {
        return this.cost;
    }
}
