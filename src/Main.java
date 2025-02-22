public class Main  {
    public static void main(String[] args) {

        AlaskanWood Taiga = new AlaskanWood("Alaskan Taiga wood pine");


        //constructor
        Model1991 s = new Model1991("brwon","fonzi 1991","Gminor",Taiga);
        s.initialOpening();
        System.out.println();

        //encapsulation and getter and setter, access private
        s.setProductkey("Gmsr3hdoeisdf8sn");

        s.Showinfo();
        System.out.println();

        s.pedalSyetem();
        System.out.println();

        //polymorphism
        s.pressSustain();

    }

}
