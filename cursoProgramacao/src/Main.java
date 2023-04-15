import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.35784;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f\n", x);
		System.out.println("Olá Mundo!");
		System.out.println("Bom dia!");
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f\n", x);
		System.out.println("RESULTADO = " + x + " Metros");
		System.out.printf("RESULTADO = %.2f Metros%n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f Reais%n", nome, idade, renda);
		//%s Texto, %d Inteiro, %f Ponto Flutuante, %n ou \n Quebra de Linha
		
		
		
	}

}
