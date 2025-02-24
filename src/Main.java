public class Main  {
    public static void main(String[] args) {
        //constructor
        Model1991 s = new Model1991("brwon","fonzi 1991","Gminor");
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

        //outer and innder class + inheritance
        Model1991.stienwayinner stienwayin = s.new stienwayinner();
        System.out.println();
        System.out.println("this is inner class");
        System.out.println(stienwayin.y);

        //Abstarction trough inheritißnce
        s.showBahanBenang();
    }
}
