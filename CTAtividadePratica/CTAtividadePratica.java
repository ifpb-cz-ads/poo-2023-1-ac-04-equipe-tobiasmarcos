
import java.util.Scanner;
public class CTAtividadePratica
{

  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Insira a idade do cidadão:");
    int idade = scan.nextInt();
     if(idade < 16){
        System.out.println("A pessoa não pode votar!");
        }
     if(idade == 16||idade == 17||idade > 65){
        System.out.println("O voto é facultativo!");
        }
     if(idade >= 18 && idade <= 65){
        System.out.println("O voto é obrigatório!");
        }
    }
}
