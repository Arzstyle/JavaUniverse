import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TugasBusStation {
     public static void main(String[] args) {
        ArrayList<String> city = new ArrayList<>();
        city.add("Sukabumi");
        city.add("Cianjur");
        city.add("Bandung");
        city.add("Garut");
        city.add("Tasik");
        city.add("Ciamis");
        city.add("Banjar");

        HashMap <String, Integer> busRates = new HashMap<>();
        busRates.put("Sukabumi-Cianjur", 10000);
        busRates.put("Cianjur-Bandung", 15000);
        busRates.put("Bandung-Garut", 7500);
        busRates.put("Garut-Tasik", 5000);
        busRates.put("Tasik-Ciamis", 7500);
        busRates.put("Ciamis-Banjar", 6000);

        try (Scanner input = new Scanner(System.in)){
            System.out.print("Masukkan kota pertama/keberangkatan anda: ");
            String departureCity = input.nextLine();

            System.out.print("Masukkan kota tujuan anda: ");
            String destinationCity = input.nextLine();

            if (!city.contains(departureCity) || !city.contains(destinationCity)) {
                System.out.println("Kota tidak valid!");
                return;
            }

            int indexDepartureCity = city.indexOf(departureCity);
            int indexDestinationCity = city.indexOf(destinationCity);
            int totalRate = 0;

            int step = indexDepartureCity < indexDestinationCity ? 1 : -1;
            while (indexDepartureCity != indexDestinationCity) {
                int indexNext = indexDepartureCity + step;
                String rute = city.get(indexDepartureCity) + "-" + city.get(indexNext);
                if (!busRates.containsKey(rute)) {
                    rute = city.get(indexNext) + "-" + city.get(indexDepartureCity);
                }
                totalRate += busRates.get(rute);
                indexDepartureCity = indexNext;
            }

            System.out.print("Apakah penumpang merupkan TNI/POLRI? (Ya/Tidak): ");
            boolean isTniPolri = input.nextLine().equalsIgnoreCase("Ya");

            if ((departureCity.equals("Sukabumi") && destinationCity.equals("Banjar")) || 
                (departureCity.equals("Banjar") && destinationCity.equals("Sukabumi"))) {
                totalRate *= 0.5;
            }
            if (isTniPolri) {
                totalRate *= 0.1; 
            }
            
            DecimalFormat decimalFormat = new DecimalFormat("#,###");
            System.out.println("Total tarif: Rp " + decimalFormat.format(totalRate));

        } catch (Exception e) {
            e.printStackTrace();
        }       
    }
}
