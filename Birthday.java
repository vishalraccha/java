public class Exp6_2 {
    public static void main(String[] args) {
        int [][]={
            {7,10,2022},
            {3,10,2022},
            {9,9,2022}
        };
        int j=2,k=1,l=0;
        int max=0,f=0,max1=0,max2=0,f1=0,f2=0;
        int year=0,month=0,day=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i][j].max)
            {
                max=arr[i][j];
                f=i;
                month = arr[i][k];
            }
        }
            if(arr[i][j]==max)
            { if(arr[i][k]>max1){
                max1 = arr[i][k];
                f1=i;
                month=arr[i][k];
            }
        }
            if(arr[i][k]==max1){
             if(arr[i][l]>max2){
                max1 = arr[i][l];
                f2=i;
                day=arr[i][l];
            }

        }
    
    }
       
         System.out.println("younger candidate year" +year+"candidate number"+(f+1));
        System.out.println("younger candidate month" +month+"candidate number"+(f1+1));
        System.out.println("younger candidate day" +day+"candidate number"+(f2+1));
}
