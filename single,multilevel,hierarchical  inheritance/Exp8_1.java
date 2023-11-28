class parent{
    void dad(){
        System.out.println("Hello son!!");
    }
}
class child extends parent{
    void son(){
        System.out.println("Hello Dad");
    }
}
public class Exp8_1 {
    public static void main(String[] args) {
        child ch=new child();
        ch.dad();
        ch.son();
    }
}
