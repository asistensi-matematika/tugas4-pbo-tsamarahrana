package tugas4asistensi;

/**
 *
 * @author tsamarahrana
 */
public class JenisSegitiga extends Segitiga {
    public JenisSegitiga(){
    }
    
    public JenisSegitiga(double alas, double tinggi){
        super(alas,tinggi);
    }
    public double SisiMiring(double alas, double tinggi){
        return Math.sqrt(Math.pow(alas,2)+Math.pow(tinggi,2));
    }
    
    public double keliling(double alas){
        return (3*alas);
    }
    
    public double keliling(double alas,double tinggi){
        return(alas+tinggi+SisiMiring(alas,tinggi));
    }
    
    public void view(double alas){
         super.view();
         System.out.println("Jenis segitiga merupakan segitiga sama sisi " + "\nKeliling segitigia adalah : " + (alas*3) + "cm");
    }
   
    public void view(double alas, double tinggi){
        System.out.println("Jenis segitiga merupakan segitiga siku-siku " + "\nKeliling segitiha adalah : " + (alas+tinggi+SisiMiring(alas,tinggi)) + "cm");
    }
}
