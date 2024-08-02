package allprogram;

public class ShortName {
    public static void main(String[] args) {
        String fullName = "Anand Kumar Hooda";
        String[] parts = fullName.split(" ");
        StringBuilder shortName = new StringBuilder();
        for (int i = 0; i < parts.length; i++) {
            if (i == 0 || i == parts.length - 1) {
                shortName.append(parts[i]);
            } else {
                shortName.append(parts[i].charAt(0)).append(".");
            }
            if (i < parts.length - 1) {
                shortName.append(" ");
            }
        }
        System.out.println("Short form of name: " + shortName);
    }
}
