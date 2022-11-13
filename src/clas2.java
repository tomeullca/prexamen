public class clas2 {
    public static void main(String[] args) {
        /**/
        int i = 0;
        int x = 2;
        while (i < 16) {
            if (x % 13 == 0) {
                i++;
                System.out.println(x +" Es multiplo de 13 ");
            }
            x++;
        }
    }
}
