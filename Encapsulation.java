class Pen{
    //private data
    private String color;
    //accessing using public method
    public void setColor(String color){
        this.color=color;
    }

    public String getColor() {
        return color;
    }
}
public class Encapsulation {
    public static void main(String[] args){
        Pen model = new Pen();
        model.setColor("blue");
        System.out.println(model.getColor());
    }
}