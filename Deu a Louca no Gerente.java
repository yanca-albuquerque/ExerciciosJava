import java.util.Scanner;
//Deu a louca no gerente - Desafio
public class DIO
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
// TODO: complete os espaços em branco com sua solução para o problema	
        int desconto =  input.nextInt();
        int  precoAntigo =  input.nextInt();

        int precoNovo = precoAntigo - (precoAntigo * desconto / 100);
        System.out.println(precoNovo);
	}
}