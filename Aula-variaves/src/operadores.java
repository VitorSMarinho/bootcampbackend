  //public static void main(String[] args) throws Exception {
    // operadores aritiméticos
    // + - * / %
    // operadores de atribuição
    // = += -= *= /= %=
    // operadores de comparação
    // == != > < >= <=
    // operadores lógicos
    // && || !
    // operadores de incremento e decremento
    // ++ --
    // operadores ternários
    // ?:
    // operadores bit a bit
    // & | ^ ~ << >> >>>
    // operadores de atribuição bit a bit
    // &= |= ^= <<= >>= >>>=
    // operadores de instancia
    // instanceof
    // operadores de casting
    // (type)
    // operadores de ponteiros
    // ->

/*
    // operadores aritiméticos
    int numero1 = 10;
    int numero2 = 20;
    int resultado = numero1 + numero2;
    System.out.println(resultado);

    // operadores de atribuição
    int numero3 = 10;
    numero3 += 5;
    System.out.println(numero3);

    // operadores de comparação
    int numero4 = 10;
    int numero5 = 20;
    boolean resultado2 = numero4 == numero5;
    System.out.println(resultado2);

    // operadores lógicos
    int numero6 = 10;
    int numero7 = 20;
    boolean resultado3 = numero6 == numero7 && numero6 > numero7;
    System.out.println(resultado3);

    // operadores de incremento e decremento
    int numero8 = 10;
    numero8++;
    System.out.println(numero8);

    // operadores ternários
    int numero9 = 10;
    int numero10 = 20;
    int resultado4 = numero9 > numero10 ? numero9 : numero10;
    System.out.println(resultado4);

    // operadores bit a bit
    int numero11 = 10;
    int numero12 = 20;
    int resultado5 = numero11 & numero12;
    System.out.println(resultado5);

    // operadores de atribuição bit a bit
    int numero13 = 10;
    numero13 &= 5;
    System.out.println(numero13);
 */

 /* 
    // operadores de instancia
    String nome = "Vitor";
  // classe Operadores
  String nome = "Vitor";
  int idade = 26;
  double peso = 99.7;
  char sexo = 'M';
  boolean casado = true;
  Date dataNascimento = new Date();

  // classe Operadores
  double soma = 10.5 + 15.7;
  int subtracao = 10 - 15;
  int multiplicacao = 10 * 15;
  double divisao = 10 / 15;
  int modulo = 10 % 15;
  double resultado = (10 * 15) + (24 / 4);

  String nomeCompleto = "Vitor" + " " + "Santos";

  String concatenacao ="?";

  concatenacao=1+1+1+"1";

  System.out.println(concatenacao);

  concatenacao=1+"1"+1+1;

  System.out.println(concatenacao);

  concatenacao=1+"1"+1+"1";

  System.out.println(concatenacao);

  concatenacao="1"+1+1+1;

  System.out.println(concatenacao);

  concatenacao="1"+(1+1+1);

}
*/

/* 
  // tornando o numero positivo ou negativo
public static void main(String[] args){
  int numero = 5;

  numero = - numero;

  System.out.println(numero);

  numero = numero * -1;

  System.out.println(numero);
}
*/

// repetição

  //int numero = 5;

  //numero++;

  //System.out.println(numero++);

  //System.out.println(numero);

  //boolean verdadeiro ou falso invertendo

  // boolean variavel = true;

  //variavel = !variavel;

  //System.out.println(variavel);

/* 
  public static void main(String[] args){
  int a,b;

  a=5;
  b=6;

  String resultado = a==b ?"verdadeiro":"falso";

  System.out.println(resultado);
} 
*/
/* 
//quando formos usar numeros podemos usar operadores relacionais
public class operadores{

  public static void main(String[] args){
    int numero1 = 1;
    int numero2 = 2;

    boolean simNao = numero1 == numero2;       
    
    if(numero1 < numero2){
      System.out.println("a nossa condição é verdadeira");
    }

    System.out.println("numeroUM é igual a numero" + simNao);

    simNao = numero1 != numero2;
    
    System.out.println("numeroUM é diferente de numero" + simNao);

    simNao = numero1 > numero2;

    System.out.println("numeroUM é maior que numero" + simNao);
  }
}
*/
/* 
//quando for objetos podemos usar equals
public class operadores{

  public static void main(String[] args){
    String nomeUm="Vitor";
    String nomeDois= new String("Vitor");

    System.out.println(nomeUm.equals(nomeDois));
  }
}
*/

public class operadores{

  public static void main(String[] args){
    boolean condicao1=true;

    boolean condicao2=true;

    if(condicao1 && condicao2){
      System.out.println("as duas condição são verdadeira");
    }

    if(condicao1 || condicao2){
      System.out.println("uma das condições é verdadeira");
    }

    System.out.println("fim");
  }
}