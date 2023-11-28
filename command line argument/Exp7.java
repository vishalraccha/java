public class Exp7 {
    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("Please Enter numbers!!");
        }
        for(String arg:args){
            int num=Integer.parseInt(arg);
            if(num % 2==0){
                System.out.println(arg);
            }
        }
    }
}
