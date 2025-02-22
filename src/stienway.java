class stienway {

    public  String color;
    public  String model;
    public  String tuning;
    private String productionkey;

    stienway() {
        this.color = "Black";
        this.model = "Standard";
        this.tuning = "440 Hz";
        this.productionkey = "12345";
    }

    stienway(String color, String model,String tuning,String productionkey){
        this.color = color;
        this.model= model;
        this.tuning = tuning;
        this.productionkey=productionkey;
    }

    public static void initialOpening() {
        System.out.println("--------------------------------------------");
        System.out.println("Hello, World!");
        System.out.println("welcome to the Stienway piano class file");
        System.out.println("--------------------------------------------");
    }

    public void Showinfo(){
        System.out.println(color);
        System.out.println(model);
        System.out.println(tuning);
        System.out.println(productionkey);
    }

    public static void pressSustain(){
        System.out.println("sustain is pressed , so it is on hold......");
    }

    public void setProductkey(String productionkey){
        this.productionkey=productionkey;
    }

    public String getProductkey(){
        return productionkey;
    }
}


