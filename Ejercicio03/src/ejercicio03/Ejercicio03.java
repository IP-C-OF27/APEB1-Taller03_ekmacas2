package ejercicio03;
public class Ejercicio03 {
    public static void main(String[] args) {
        // TODO code application logic here
        int base = 10;
        int potencia = 2;
        int raiz_cuadrada = 16;
        int numerador = 20;
        int denominador = 1;
        int denominador2 = 11;
        double resultado;
        int resultadoVar1;
        resultadoVar1 = Math.powExact(base, potencia);
        double resultadoVar2;
        resultadoVar2 = Math.sqrt(raiz_cuadrada);
        int resultadoVar3;
        resultadoVar3 = numerador / (denominador + denominador2);
        resultado = resultadoVar1 + resultadoVar2 + resultadoVar3;
        System.out.println("Resultado final es: " + resultado);
             
        
    }
    
}
