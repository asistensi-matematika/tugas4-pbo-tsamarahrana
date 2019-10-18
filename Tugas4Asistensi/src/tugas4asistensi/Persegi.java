package tugas4asistensi;

/**
 *
 * @author tsamarahrana
 */
public class Persegi extends BangunDatar {
    protected double sisi;
    
    public Persegi(){
        sisi=0;
    }
    
    public Persegi(double sisi){
        this.sisi=sisi;
    }
    
    public double Luas(){
        return(sisi*sisi);
    }
    
    public  double Keliling(){
        return(4*sisi);
    }
    
    public void view(){
        System.out.println("Luas persegi adalah : " + Luas() + "cm^2" + "\nKeliling adalah " + Keliling() + "cm");
    }
            
}
