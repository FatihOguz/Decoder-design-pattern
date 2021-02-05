/**
 * this class inherited accessoryDecerator abstract class
 * holds on reference of Suit class
 * this reference decoder abstract methods in Suit class
 * these methods cost and weight methods
 */
public class Flamethrower extends AccessoryDecorator {
    /**
     * hold on reference suit abstract class
     */
    Suit suit;
    /**
     * constructor
     * take a reference suit class and assign own reference of suit class
     * @param s is reference of suit abstract class
     */
    public Flamethrower(Suit s){this.suit = s;}
    /**
     * return knowledge of decodered and own knowledge
     * @return knowledge of decodered and own knowledge
     */
    @Override
    public String getDescription() {
        return  suit.getDescription() + ", Flamethrower(price : 50000 | weight : 2 kg)\n";
    }
    /**
     * return cost of decodered and own cost(total cost)
     * @return cost of decodered and own cost(total cost)
     */
    @Override
    public long cost() {
        return 50000 + suit.cost();
    }
    /**
     * return weight of decodered and own weight(total weight)
     * @return weight of decodered and own weight(total weight)
     */
    @Override
    public double weight() {
        return 2 + suit.weight();
    }
}
