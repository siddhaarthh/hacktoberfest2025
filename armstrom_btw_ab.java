import java.util.Scanner;
public class armstrom_btw_ab {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter starting num");
        int a = sc.nextInt();
        System.out.println("enter ending num");
        int b = sc.nextInt();
        for(int i=a;i<=b;i++)
        {
           int t=i,k=0;
            while(t!=0)
            {
                int j=t%10;
                k=(j*j*j)+k;
                t=t/10;
            }    
        if(k==i)
            System.out.println("armstrong num are" + k);
        } 
        sc.close();   
    }
}
