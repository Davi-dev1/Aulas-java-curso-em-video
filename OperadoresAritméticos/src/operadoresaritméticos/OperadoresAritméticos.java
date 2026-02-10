/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritméticos;

/**
 *
 * @author Davi
 */
public class OperadoresAritméticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1=3;
        int n2=5;
        float m=(n1+n2)/2;
        System.out.println("A MEDIA eh IGUAL A " +m);
        System.out.println("=========================");
        
        int numero=5;
        numero++;
        System.out.println(numero);
        System.out.println("==============");
        
        int numero1=7;
        int valor = 7 + ++numero1; //no caso numero1 está pré incrementado e ai 7 + 1 =8 e dps soma com o outro 7 resultando em 15;
        System.out.println(valor);
        System.out.println(numero1);// Se eu quiser só impirimir o incremento tá aqui
        System.out.println("============");
        
        int numero2=5;
        int valor1=5 + numero2++; //Nesse caso nós temos um pós incremento aonde o número 5 dentro de numero2 passa a valer 6 e se for pedido para mostrar seu valor ele será 6 , e a variavel valor1 passa a valer 10
        System.out.println(valor1);
        System.out.println(numero2);
        
        System.out.println("============");
        int x = 4;
        x +=2;//x =x+2
        System.out.println(x);
        
        
        System.out.println("===========");
        
        float v = 8.9f;
        int ar = (int) Math.floor(v);//arredonda para baixo
        System.out.println(ar);
        System.out.println("===========");
        float v1=8.9f;
        int ar1 = (int) Math.ceil(v1); //arredonda para cima
        System.out.println(ar1);
        System.out.println("==========");
        
        float v2=8.5f;
        int ar2=(int) Math.round(v2);//arredonda mais para cima 
        System.out.println(ar2);
        System.out.println("=========");
        
        
        float ale = (float) Math.random();//numero aleatorio
        System.out.println(ale);
        System.out.println("=============");
        
        double ale1 = Math.random();
        int n=(int) (5+ ale1 * (10-5));//pega o numero aleatorio soma com 5 e multiplica com o limite dele(10-5) no final ele não gera  nada abaixo de 5  e nada acima de 10
        System.out.println(n);
        
        System.out.println("===========");
        
        double ale2 = Math.random();
        int n4 = (int) (15 +ale2 *(50-15)); //o limite é de 15 até 50
        System.out.println(n4);
    }
    
}
