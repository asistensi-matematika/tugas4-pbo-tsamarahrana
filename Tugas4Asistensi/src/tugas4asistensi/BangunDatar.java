package tugas4asistensi;

/**
 *
 * @author tsamarahrana
 */
public class BangunDatar {
    protected String jenis;
    
    public BangunDatar(){
        jenis = null;
    }
    
    public BangunDatar(String jenis){
        this.jenis=jenis;
    }
    
    public void view(){
        System.out.println("Jenis bangun datar : " + jenis);
    }
}
