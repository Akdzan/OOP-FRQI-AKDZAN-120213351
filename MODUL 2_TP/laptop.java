public class laptop extends perangkat {
    protected boolean webcam;
    protected String prove;

    public laptop(String drive,int ram, double processor,boolean webcam){
        super(drive,ram,processor);
    }
    public void informasi(){
        if(webcam){
            prove = "TIDAK";
        }
        else{
            prove = "";
        }
        System.out.println("Laptop ini memiliki drive tipe "+drive+" dengan ram sebesar "+ram+" GB dan Processor secepat "+processor+"Ghz.  Selain itu laptop ini  "+prove+" memiliki webcam");
    }
    public void bukaGame(String nama_game){
        System.out.println("Laptop berhasil membuka game "+nama_game);
    }
    public void kirimEmail(String email){
        System.out.println("Laptop berhasil mengirim ke "+email);
    }
    public void kirimEmail(String email1, String email2){
        System.out.println("Laptop berhasil mengirim ke "+email1+" dan ke "+email2);
    }
}
