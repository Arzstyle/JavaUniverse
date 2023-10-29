public class TipeDataArray {
    public static void main(String[] args) {
        
        String[] arrayStrings;
        arrayStrings = new String[3];
        arrayStrings[0] = "Akbar";
        arrayStrings[1] = "Rizky";
        arrayStrings[2] = "Sapura";

        System.out.println(arrayStrings[0]);
        System.out.println(arrayStrings[1]);
        System.out.println(arrayStrings[2]);

        String [] namaNama = {
            "Akbar", "Rizky", "Saputra"
        };
        System.out.println(namaNama);

        long[] arrayLong = {
            10L, 20L, 30L, 40L, 50L
        };
        System.out.println(arrayLong.length);

        String[][] members = {
            {"Akbar", "Rizky"},
            {"Hazara", "Rahayu"},
            {"Putri"}
        };
        System.out.println(members[0][1]);
        System.out.println(members[1][0]);

    }
}
