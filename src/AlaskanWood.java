//this alaskan wood have many wood types basicly imported from alaska
public class AlaskanWood {
    public String woodType= "normal Oak wood";

    AlaskanWood(String woodType){
        this.woodType=woodType;
    }

    public void showwoodType(){
        System.out.println("wood type = " +woodType);
    }
}
