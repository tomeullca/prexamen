public class compro {
    public static void main(String[] args) {
        int numero=31;
        int sumar=0;
        int x=0;


        for(int i= 2; i<numero; i++){
            if(numero % i == 0){
                sumar++;
            }
        }
        if (sumar==0){
            x++;
            while (x<16){
                System.out.println("Es primo");
            }
        }else{
            System.out.println("No es primo");
        }





    }
}
