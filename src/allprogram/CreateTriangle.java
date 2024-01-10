package allprogram;

public class CreateTriangle {
    public static void main(String[] args) {
        int rows = 5;

        createTriangle(rows);
    }

    private static void createTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        } 
    }
}

