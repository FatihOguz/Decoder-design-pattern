/**
 * this class inherited suit abstract class
 * and owerride abstract method
 * these methods are cost and weight methods
 *
 */
public class tor extends Suit {
    /**
     * change description
     * description holds on in suit abstract class
     */
    public tor() {
        description = "tor (price : 5000000 | weight : 50 kg)\n";
    }
    /**
     * return own cost
     * @return own cost
     */
    @Override
    public long cost() {
        return 5000000;
    }
    /**
     * return own weight
     * @return own weight
     */
    @Override
    public double weight() {
        return 50;
    }
}
