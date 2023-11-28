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
class daughter extends child{
    void dat(){
        System.out.println("Hello Daddy");
    }
}
public class Exp8_3 {
    public static void main(String[] args) {
        child ch=new child();
        daughter d=new daughter();
        ch.dad();
        ch.son();
        d.dat();
    }
}
