public class Amoeba extends Shape {
    public Amoeba() {
    }
    public String rotate(){
        return "Rotate 360 degrees for amoeba";
    }
    public String play_sound(){
        return "Play sound Mp3";
    }
    public static void main(String[] args) {
        Amoeba amoeba = new Amoeba();
        System.out.println("Amoeba is "+amoeba.rotate());
        System.out.println("Amoeba is "+amoeba.play_sound());
    }
}
