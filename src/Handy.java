public class Handy<arr> {
    private int model;

    public int getModel() {
        return model;
    }

    public void setModel(int s) {
        model = s;
    }

    void modelnummer (){
        if (model >= 10){
            System.out.println("Nice new Handy!");
        } else if (model >= 7){
            System.out.println("Its ok");
        } else {
            System.out.println("You should by a new phone");
        }
    }


}
