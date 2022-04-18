import java.util.Scanner;

public class Areascal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        while(true){    
            System.out.println("Qual forma deseja calcular?");
            String forma = ler.next().toUpperCase();
            double pi = Math.PI; 

            if(forma.equals("CIRCULO")){
                System.out.println("Qual o raio do circulo?");
                Double valoraio = ler.nextDouble();
                double area = acir(pi, valoraio);
                System.out.println("A área do circulo é igual a: " + area);
            }
            if(forma.equals("QUADRADO")){
                System.out.println("Digite o valor dos lados para calcularmos a área: ");
                double n1 = ler.nextDouble();
                double areaQua = aqua(n1);
                System.out.println("A área do quadrado é:" + areaQua);
            }
            if(forma.equals("RETANGULO")){
                System.out.println("Digite o valor do primeiro lado para calcularmos a área: ");
                double n1 = ler.nextDouble();
                System.out.println("Digite o valor do segundo lado para calcularmos a área: ");
                double n2 = ler.nextDouble(); 
                double areaRet = aret(n1, n2);
                System.out.println("A área do retangulo é: " + areaRet);
            }
            if(forma.equals("TRIANGULO")){
                System.out.println("Digite o valor da base para calcularmos a área: ");
                double n1 = ler.nextDouble();
                System.out.println("Digite o valor da altura para calcularmos a área: ");
                double n2 = ler.nextDouble(); 
                double areatri = aret(n1, n2);
                System.out.println("A área do retangulo é: " + areatri);
            }
            System.out.println("\nDeseja Continuar? [S/N]");
            char op = ler.next().toUpperCase().charAt(0);
            if (op != 'S') {
            System.exit(0);
            }    
        }    
    }
    //Método Retangulo
    public static double aret(double n1, double n2){
        return(n1 * n2);
    }
    //Método Quadrado
    public static double aqua(double n1){
        return(Math.pow(n1, 2));
    }
    //Método Circulo
    public static double acir(double pi, double raio){
        return(pi *(Math.pow(raio , 2)));
    }
    //Método Triangulo
    public static double atri(double n1, double n2){
        return((n1 * n2)/2);
    }
}