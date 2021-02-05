/**
 *this class abstract class
 */
public abstract class Suit {
    /**
     * description field holds on knowledge of wears
     */
    String description = "Unknown suits";

    /**
     * return description
     * @return description
     */
    public String getDescription() {return description;}

    /**
     * this method abstact
     * every suit implements own
     * @return cost
     */
    public abstract long cost();

    /**
     * this method abstact
     * every suit implements own
     * @return weight
     */
    public abstract double weight();
}


