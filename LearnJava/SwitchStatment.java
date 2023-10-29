public class SwitchStatment {
    public static void main(String[] args) {
    
        var nilai = "A";

        switch (nilai){
            case "A":
                System.out.println("SELAMAT ANDA LULUS");
                break;
            case "B":
            case "C":
                System.out.println("Nilai anda cukup");
                break;
            case "D":
                System.out.println("Nilai anda kurang");
                break;
            default:
                System.out.println("Pergi kau anjeng");

        switch (nilai) {
            case "A" -> System.out.println("SELAMAT ANDA LULUS");
            case "B", "C" -> System.out.println("Nilai anda cukup");
            case "D" -> System.out.println("Nilai anda kurang");
            default -> {
                System.out.println("Pergi kau anjeng");

        
        String ucapan;
        switch (nilai){
            case "A" -> ucapan = "SELAMAT ANDA LULUS";
            case "B", "C" -> ucapan = "Nilai anda cukup";
            case "D" -> ucapan = "Nilai anda kurang";
            default -> {
                ucapan = "Pergi kau anjeng";
            }
        }
        System.out.println(ucapan);

        ucapan = switch (nilai){
            case "A": 
                yield "SELAMAT ANDA LULUS";
            case "B", "C": 
                yield "Nilai anda cukup";
            case "D":
                yield "Nilai anda kurang";
            default:
                yield "Pergi kau anjeng";
        };
        

        

            }
        }
        }


    }

}

