class stienway extends AbstractBahanBenang{

    public  String color;
    public  String model;
    public  String tuning;
    private String productionkey;
    //bringin a new object as variable
    AlaskanWood woodType ;

    AlaskanWood birch = new AlaskanWood("Alaskan birch wood");

    stienway() {
        this.color = "Black";
        this.model = "Standard";
        this.tuning = "440 Hz";
        this.productionkey = "12345";
        //bringin the object
        this.woodType=birch;
    }
    
    class stienwayinner{
        int y = 5;
    }


    public  void initialOpening() {
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Hello, World!");
        System.out.println("welcome to the Stienway piano class file");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("this time we will be making a "+ model + " stienway piano" );
        System.out.println("---------------------------------------------------------------------");

    }

    public void Showinfo(){
    System.out.println("color = "+color);
        System.out.println("Model = "+model);
        System.out.println("tuning = "+tuning);
        System.out.println("productionkey = "+productionkey);
        //printingusing object
        birch.showwoodType();

    }

    public void pressSustain(){
        System.out.println("sustain is pressed , so it is on hold......");
    }

    public void setProductkey(String productionkey){
        this.productionkey=productionkey;
    }

    public String getProductkey(){
        return productionkey;
    }
}


