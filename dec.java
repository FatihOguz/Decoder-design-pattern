/**
 * this class inherited suit abstract class
 * and owerride abstract method
 * these methods are cost and weight methods
 *
 */
public class dec extends Suit {
    /**
     * change description
     * description holds on in suit abstract class
     */
    public dec() {
        description = "  dec(price : 500000 | weight : 25 kg) \n";
    }

    /**
     * return own cost
     * @return own cost
     */
    @Override
    public long cost() {
        return 500000;
    }

    /**
     * return own weight
     * @return own weight
     */
    @Override
    public double weight() {
        return 25;
    }

}
