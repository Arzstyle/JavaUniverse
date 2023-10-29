public class OperasiBoolean {
    public static void main(String[] args) {
        
        var absen = 80;
        var nilaiAkhir = 80;

        var lulusAbsen = absen >= 70;
        var lulusNilaiAkhir = nilaiAkhir >= 70;

        var lulus = lulusAbsen && lulusNilaiAkhir;
        System.out.println(lulus);

        
    }
}
