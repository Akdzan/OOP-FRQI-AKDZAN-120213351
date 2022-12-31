public class handphone extends perangkat{
    protected boolean fingerprint;
    protected String prove;

    public handphone(String drive,int ram, double processor,boolean fingerprint){
        super(drive,ram,processor);
    }
    public void informasi(){
        if(fingerprint){
            prove = "TIDAK";
        }
        else{
            prove = "";
        }
        System.out.println("Handphone ini memiliki drive tipe "+drive+" dengan ram sebesar "+ram+" GB dan Processor secepat "+processor+" Ghz.  Selain itu Handphone ini  "+prove+" memiliki fingerprint.");
    }
    public void telfon(int no_hp){
        System.out.println("Handphpne ini berhasil menyambungkan telfon ke No"+no_hp);
    }
    public void kirimSMS(int no_hp){
        System.out.println("Handphone berhasil mengirim SMS ke No"+no_hp);
    }
    public void kirimSMS(int no_hp1, int no_hp2){
        System.out.println("Handphone berhasil mengirim SMS ke No"+no_hp1+"dan ke No "+no_hp2+"\n");
    }
}
