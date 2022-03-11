public class main {

    public static void main(String[] args){
            Hund eins = new Hund();
            eins.größe = 70;

            eins.bellen();

            int geheim = versteck();
            System.out.println(geheim);
        int test = nimm(x(), y());
        System.out.println(x());
        System.out.println(y());
    }



    static class Hund {
        int größe;
        String name;

        void bellen (){
            if (größe > 60){
                System.out.println("Wuff!");
            } else if (größe > 40 ){
                System.out.println("Wau!");
            } else {
                System.out.println("Jip");
            }
        }
    }

    class HundeTestLauf {
        public void main(String[] args){
            Hund eins = new Hund();
            eins.größe = 70;

            eins.bellen();
        }
    }

    public static int versteck(){
        return 42;
    }


    public static int x(){
        int x = 10;
        return (x);
    }

    public static int y(){
        int y = 54;
        return (y);
    }

    public static int nimm(int x, int y){
        int z = x+y;
        System.out.println(z);
        return z;
    }
}



