/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testetipos;

/**
 *
 * @author Davi
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Incompatibilidade de tipos primitivos, geralmente int não pode ser convertido para tipos String
     //int idade =30;
     //String valor =(String)idade;
     
     //O jeito certo é fazer isso por meio de classes involucras convertendo um número inteiro para uma String: 
     int idade =30;
     String valor = Integer.toString(idade); // Graças a classe involucra e o metódo toString foi possivel acessar o valor inteiro nesse caso estamos utilizando o wrapper class
        System.out.println(valor);
     
//Tipo Incompativel:
// String number="30";
 //int value=number;
 //int value =(int)number;
 
 //Classe invólucro é a unica capaz de converter esse tipo de dado primitivo String em int
 String number="40";
 int value =Integer.parseInt(number);
        System.out.println(value);
        
        
        //Com float também funciona
        String numerico ="55";
        float ok=Float.parseFloat(numerico);
        System.out.println(ok);
     
    }
    
}
