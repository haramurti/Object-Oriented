//inhetritence
public class Model1991 extends stienway {


    //object inhereted to model 1991
    Model1991(String color, String model,String tuning,AlaskanWood woodType ){
        this.color = color;
        this.model= model;
        this.tuning = tuning;
        this.woodType = woodType;

    }

    public void pedalSyetem (){
        System.out.println("pedal system is on other than sustain");
    }

}
