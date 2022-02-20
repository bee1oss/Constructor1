import java.util.Scanner;


public class Test {
    public static void main(String[] args){
      
      // Account account1 = new Account();
       Account account2 = new Account("123456" , 1000.0,"Bega H.","bega@gmail.com","+3752534534");
     
       int choose;
       double dmon,wmon;
       Scanner myObj = new Scanner(System.in);
        
       System.out.println("\n 1.Show balance in my account \n 2.Deposit process \n 3.Withdrawal process");
        
        System.out.print("Choose one of the options:");
       
       
       choose = myObj.nextInt();
       
       if(choose == 1){
           
       }
       else if(choose == 2){
           System.out.print("Enter the amount to deposit:");
           dmon = myObj.nextDouble();
           System.out.println(dmon+" Amount you deposit");
            account2.depMon(dmon);
       }
       else if(choose == 3){
           System.out.print("Enter the amount to withdrawal:");
           wmon = myObj.nextDouble();
           account2.witMon(wmon);
       }
       else{
           System.out.println("You made a wrong choice");
       }
       /* account1.setHesapNo("123456");
       account1.setBakiye(1000.0);
       account1.setIsim("Burhan Nalbant");
       account1.setEmail("burhan@gmail.com");
       account1.setTelNo("+375 25 341 51");*/
      
      
    }
}
