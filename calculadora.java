package calculadora;
import java.util.Scanner;

public class calc {
public static void main(String[] args){
	float numero1, numero2, t;
	String op=" ", sign=" ";
	int sel;
	Scanner scan = new Scanner(System.in);
	System.out.println("Calculadora \n\nQue operacion desea realizar?\n1.Suma\n2.Resta\n3.Multiplicación\n4.División\n\nSu selección:");
	sel = scan.nextInt();
	if (sel<=4 && sel>0){
		System.out.println("Inserte el primer digito: ");
		numero1 = scan.nextFloat();
		System.out.println("Inserte el segundo digito: ");
		numero2 = scan.nextFloat();
		switch(sel) 
		{
		case 1: 
			t=numero1+numero2;
			op="suma";
			sign="+";
			break;
		case 2:
			t=numero1-numero2;
			op="resta";
			sign="-";
			break;
		case 3:
			t=numero1*numero2;
			op="multiplicación";
			sign="*";
			break;
		case 4:
			t=numero1/numero2;
			op="división";
			sign="/";
			break;
		default:
			t=0;
			break;
		}
		System.out.println("El resultado de la "+op+" "+numero1+" "+sign+" "+numero2+" es igual a:");
		System.out.print(t);
		
	}
	else
		System.out.println("Seleccion Invalida");
	scan.close();
	}
}