/**
 * get command from user for menu
 */
import java.util.Scanner;

/**
 * this class create menu
 * and want to order
 * these order wear accessory ower suit
 * and return costs and weights of 3 suits
 * order of 0(zero) exits program
 */
public class Demo {
    /**
     * static method for menu
     * @param args no argument
     */
    public static void main(String[] args){


        Suit dec = new dec();
        Suit ora = new ora();
        Suit tor = new tor();



        Scanner scanner = new Scanner(System.in);

        int command = -1;

        while(command!=0){

            System.out.println("Press 1 if dec wants to wear a AutoRifle");
            System.out.println("Press 2 if dec wants to wear a FlameThrower");
            System.out.println("Press 3 if dec wants to wear a Laser");
            System.out.println("Press 4 if dec wants to wear a RocketLauncher");
            System.out.println("Press 5 if ora wants to wear a AutoRifle");
            System.out.println("Press 6 if ora wants to wear a FlameThrower");
            System.out.println("Press 7 if ora wants to wear a Laser");
            System.out.println("Press 8 if ora wants to wear a RocketLauncher");
            System.out.println("Press 9 if tor wants to wear a AutoRifle");
            System.out.println("Press 10 if tor wants to wear a FlameThrower");
            System.out.println("Press 11 if tor wants to wear a Laser");
            System.out.println("Press 12 if tor wants to wear a RocketLauncher");
            System.out.println("Press 0 for  Exit");
            System.out.println("GIVE ME ORDER (0-12)");
            command = scanner.nextInt();

            if(command ==1){
                dec = new AutoRifle(dec);
            }
            else if(command==2){
                dec=new Flamethrower(dec);
            }
            else if(command==3){
                dec = new Laser(dec);
            }
            else if(command==4){
                dec = new RocketLauncher(dec);
            }
            else if(command==5){
                ora=new AutoRifle(ora);
            }
            else if(command==6){
                ora=new Flamethrower(ora);
            }
            else if(command==7){
                ora = new Laser(ora);
            }
            else if(command==8){
                ora = new RocketLauncher(ora);
            }
            else if(command==9){
                tor=new AutoRifle(tor);
            }
            else if(command==10){
                tor=new Flamethrower(tor);
            }
            else if(command==11){
                tor=new Laser(tor);
            }
            else if(command==12){
                tor=new RocketLauncher(tor);
            }
            System.out.println("*******************************************************************************************************************************");
            System.out.println(dec.getDescription() + " total price --> " + dec.cost() + " total weight --> " +  dec.weight());

            System.out.println("*******************************************************************************************************************************");
            System.out.println(ora.getDescription() + " total price --> " + ora.cost() + " total weight --> " +  ora.weight());

            System.out.println("*******************************************************************************************************************************");
            System.out.println(tor.getDescription() + " total price --> " + tor.cost() + " total weight --> " +  tor.weight());

            System.out.println("*******************************************************************************************************************************");

        }
    }
}
