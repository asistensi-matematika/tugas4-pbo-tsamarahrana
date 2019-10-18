package tugas4asistensi;

/**
 *
 * @author tsamarahrana
 */
public class Lingkaran extends BangunDatar{
    protected double radius;
    
    public Lingkaran(){
        radius=0;
    }
    
    public Lingkaran(double radius){
        this.radius=radius;
    }
    
    public double Luas(){
        return(Math.PI*radius*radius);
    }
    
    public void view(){
        super.view();
        System.out.println("Luas lingkaran adalah : " + Luas() + "cm^2" + "\nKeliling lingkaran adalah : " + (2*Math.PI*radius) + "cm");
    }
}
