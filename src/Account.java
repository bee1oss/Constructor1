public class Account {
        private String hesapNo;
        private double bakiye;
        private String isim;
        
        private String email;
        
        private String telNo;
        
        public void paraYatir(double miktar){
            bakiye += miktar;
            
            System.out.println("Yeni bakiye:" + bakiye);
        }
        public void paraCekme(double miktar){
            if(miktar > 1500){
                System.out.println("Bir gunde 1500'den fazla para cekemezsiniz");
            }
            if(miktar>bakiye){
                System.out.println("Yeterli bakiye yok..." + bakiye);
            }
            else{
                bakiye -= miktar;
                System.out.println("Cekme islemi basarili.. Yeni bakiye: " + bakiye );
            }
        }
    /**
     * @return the hesapNo
     */
    public String getHesapNo() {
        return hesapNo;
    }

    /**
     * @param hesapNo the hesapNo to set
     */
    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    /**
     * @return the bakiye
     */
    public double getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telNo
     */
    public String getTelNo() {
        return telNo;
    }

    /**
     * @param telNo the telNo to set
     */
    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }
    
}
