package tugas4asistensi;

/**
 *
 * @author tsamarahrana
 */
public class Segitiga extends BangunDatar {
    protected double alas;
    protected double tinggi;
    
    public Segitiga(){
        alas=0;
        tinggi=0;
    }
    
    public Segitiga(double alas, double tinggi){
        this.alas=alas;
        this.tinggi=tinggi;
    }

    public double Luas(){
        return((alas*tinggi)/2);
    }
    
    public void view(){
        super.view();
        System.out.println("Luas segitiga adalah : " + Luas() + "cm^2");
    }
}
