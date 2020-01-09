import com.company.IceCream;

public class IceCreamDecorator implements IceCream {

    private IceCream iceCream;


   public IceCreamDecorator(IceCream iceCream)
   {
       this.iceCream = iceCream;
   }


    @Override
    public double getCost() {
        return this.iceCream.getCost()   ;
    }
}
