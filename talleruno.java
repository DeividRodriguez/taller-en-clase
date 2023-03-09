package javaapplication1;
    import java.util.Scanner;
public class javaApplication1 {
        public static void main(String[] args) {
        cd();
    }
        public static void cd(){
            try (Scanner leer = new Scanner(System.in)) {
                System.out.println("Digite su nombre");
                String nom=leer.next();
                System.out.println("Digite su apellido");
                String ape=leer.next();
                System.out.println("Digite su edad");
                int edad=leer.nextInt();
                System.out.println("Ingrese el valor de cuenta");
                double cuen=leer.nextDouble();
                System.out.println("----------RESULTADO-----------");
                System.out.println("Nombre: " + nom);
                System.out.println("Apellido: " + ape);
                System.out.println("Edad: " + edad);
                System.out.println("Cuenta: " + cuen);
                System.out.println("Descuento: " + (cuen - ed(edad, cuen)));
                String nombrecompleto= nom +  "  "  + ape;
                nombrecompleto=nombrecompleto.toUpperCase();
                System.out.println("nombre completo  "+ nombrecompleto);
            }

        }
        
        /**
         * @param edad
         * @param cuen
         * @return
         */
        public static double ed(int edad, double cuen){
            double cuenF = cuen;
            if(edad == 19){
                cuenF = cuen * 0.10;
            } else if(edad >19 && edad <= 30){
                cuenF = cuen * 0.05;
            } 
            return cuenF;
      

}
}

    

