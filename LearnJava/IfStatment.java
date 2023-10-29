public class IfStatment {
    public static void main(String[] args) {
        
        var nilai = 70;
        var absen = 90;

        var lulusNilai = nilai >= 75;
        var lulusAbsen = nilai >= 75;

        var lulus = lulusNilai && lulusAbsen;

        if(nilai >= 75 && absen >= 75){
            System.out.println(" Selamat anda lulus");
        } else{
            System.out.println("Mohon maaf tidak lulus");
        }
    }
}
