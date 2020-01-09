import com.company.IceCream;

public class CookiesCream extends IceCreamDecorator {
    public CookiesCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override

    public double getCost()
    {
        return 2 + super.getCost();
    }

}
