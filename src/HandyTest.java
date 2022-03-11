public class HandyTest {

    public static void main (String [] args){
        Handy eins = new Handy();
        eins.setModel(20);
        Handy zwei = new Handy();
        zwei.setModel(6);

        System.out.println(eins.getModel());

        eins.modelnummer();
        zwei.modelnummer();
    }
}
