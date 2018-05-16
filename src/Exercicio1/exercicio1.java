package Exercicio1;

import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salario;
        int opcao, a = 1;

        while (a != 0) {

            System.out.println("Escolha a opção desejada \n"
                    + "1. Imposto \n"
                    + "2. Novo Salário \n"
                    + "3. Classificação \n"
                    + "4. Finalizar \n");
            opcao = scanner.nextInt();

            switch(opcao)
            {   

case 1: 
        System.out.println("Digite seu salário");
        salario = scanner.nextDouble();
        if( salario < 500){
        salario = salario * 0.05;
    }
    else if ( salario >500 && salario <850){
    salario = salario * 0.1;
    }
    else {
    salario = salario * 0.15;
    }
        System.out.println("Seu imposto será de: " +salario);
        break;
        
            case 2:
            System.out.println("Digite seu salário");
            salario = scanner.nextDouble();
            if (salario > 1.500){
            salario = salario + 25;
           }
            else if (salario >= 750 && salario <= 1.500){
            salario = salario + 50;
        }
            else if (salario >= 450 && salario < 750){
            salario = salario + 75;
        }
            else {
            salario = salario + 100;
        }
        System.out.println("Seu novo Salário será de: " +salario);
                       
        break;
            
            case 3:
            System.out.println(" Digite seu salário");
            salario = scanner.nextDouble();
            if (salario <= 700){
              System.out.println(" MAU REMUNERADO");
        }
            else {
          System.out.println(" BEM REMUNERADO");
        }
        break;
            
            case 4:
            a=0;
            
            break;       
        }
    }
        
    }
}
