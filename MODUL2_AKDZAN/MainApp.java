public class MainApp {
    public static void main(String[] args) throws Exception {
        TransportasiAir WaterTransportation = new TransportasiAir(4,20000);
        WaterTransportation.informasi();
        WaterTransportation.berlayar();
        WaterTransportation.berlabuh();

        Sampan spn = new Sampan(20,50000,2);
        spn.informasi();
        spn.berlayar();
        spn.berlabuh();
        spn.berlabuh(2);
        
        Kapal kpl = new Kapal(50,100000, "Diesel");
        kpl.informasi();
        kpl.berlayar();
        kpl.berlayar(20);
        kpl.berlabuh();
        
    };
}
