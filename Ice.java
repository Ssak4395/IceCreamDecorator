import com.company.IceCream;

public class Ice {

    public static void main(String[] args)
    {



        IceCream basicIceCream = new BasicIceCream();
        System.out.println("Price of this Ice Cream is $" + basicIceCream.getCost());

        //Adding Chocolate to basic IceCream

        IceCream  choco = new ChocolateIceCream(basicIceCream); // We are wrapping the chocolate icecream to the basic icecream

        System.out.println("Price of this IceCream is $" + choco.getCost());

        // Essentially we can keep wrapping ice cream with other flavours

        IceCream chocPecan = new PecanIceCream(choco);
        System.out.println("Price of this ChocPecan IceCream is $: " + chocPecan.getCost());

        IceCream cookies = new CookiesCream(chocPecan);

        System.out.println("The Price of This ChocPecan IceCream is $:" + cookies.getCost());
    }
}
