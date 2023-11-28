public class Exp7_2 {
    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("Please Enter numbers!!");
        }
        int sum=0;
        for(String arg:args){
            int num=Integer.parseInt(arg);
            if(num % 2==0){
                 sum+=num;
            }
        }
        System.out.println(sum);
    }
}
