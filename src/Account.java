public class Account {
        private String billNo;
        private double balance;
        private String name;
        
        private String email;
        
        private String telNo;
        //Burada Constructorun adi classin adiyla ayni olmak zorunda yoksa constructor olusturamayiz
        /*public Account(){
            
            System.out.println("Kendi yazdigimiz Constructor...");
        }*/
        public Account(String billpNo,double balance,String name,String email, String telNo){
             
            this.billNo = billNo;
            this.balance = balance;
            this.name = name;
            this.email = email;
            this.telNo = telNo;
        }
        
        public void depMon(double quantity){
            balance += quantity;
            
            System.out.println("New balance:" + balance);
        }
        public void witMon(double quantity){
            if(quantity > 1500){
                System.out.println("You cannot withdraw more than 1500 coins in one day.!");
            }
            if(quantity>balance){
                System.out.println("Not enough funds were found in your account..." + balance);
            }
            else{
                balance -= quantity;
                System.out.println("Withdraw successful...");
                System.out.println(" New balance:" + balance);
            }
        }
        
}
