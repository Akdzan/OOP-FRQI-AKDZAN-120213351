
public class main {
    public static void main (String[] args){
        perangkat device = new perangkat("Adata",2,1.80);
        device.informasi();

        handphone hp = new handphone("Sandisk",3,2.20,true);
        hp.fingerprint = true;
        hp.informasi();
        hp.telfon(628131);
        hp.kirimSMS(62000090);
        hp.kirimSMS(625663883, 62948383);

        laptop mac = new laptop("Seagate", 8, 2.40, false);
        mac.webcam = false;
        mac.informasi();
        mac.bukaGame("Dota 2");
        mac.kirimEmail("akdzan@gmail.com");
        mac.kirimEmail("akdzan@gmail.com","nisrinafri@gmail.com");

}
}
