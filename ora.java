/**
 * this class inherited suit abstract class
 * and owerride abstract method
 * these methods are cost and weight methods
 *
 */
public class ora extends Suit {
    /**
     * change description
     * description holds on in suit abstract class
     */
    public ora() {
        description = "ora (price : 1500000 | weight : 30 kg)\n";
    }

    /**
     * return own cost
     * @return own cost
     */
    @Override
    public long cost() {
        return 1500000;
    }

    /**
     * return own weight
     * @return own weight
     */
    @Override
    public double weight() {
        return 30;
    }
}
