//Hora de Codar: O Inimigo agora é outro

//Escreva um programa em Java e crie uma variável chamada "Planeta" e atribua-a um valor "Plutão". Exiba o valor para o usuário.

/*
public class Script {

    public static void main(String[] args) {
        String Planeta = "Plutão";
        System.out.println(Planeta);
    }

}
*/

/*Escreva um programa em Java em que o usuário informe o seu nome e exiba a mensagem "Olá, [NomeDoUsuario]". */


/* =================== apage essa linha para usar  =================== 
import java.util.Scanner;

public class Script {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Iae, " + nome);
    }

}
          =================== apage essa linha para usar  ===================  */




// Escreva um programa em Java em que o usuário informe o seu nome e em seguida o programa perguntará a idade do usuário. Agora o programa deve exibir a mensagem "Olá, [NomeDoUsuario], sua idade é [idade]".

/* =================== apage essa linha para usar  =================== 

import java.util.Scanner;

public class Script {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite sua idade olha a magica : ");
        int idade = scanner.nextInt();
        System.out.println("Iae, " + nome + ", sua idade é " + idade);
    }

}       

=================== apage essa linha para usar  ===================  */


// Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou neutro.

/* =================== apage essa linha para usar  =================== 

import java.util.Scanner;

public class Script {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();
        if (numero > 0) {
            System.out.println("O numero é positivo");
        } else if (numero < 0) {
            System.out.println("O numero é negativo");
        } else {
            System.out.println("O numero é neutro");
        }
    }

}

=================== apage essa linha para usar  ===================  */

// Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles. 

/* =================== apage essa linha para usar  =================== 

import java.util.Scanner;

public class Script {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();
        System.out.println("Digite o terceiro numero: ");
        int numero3 = scanner.nextInt();
        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("O maior numero é " + numero1);
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("O maior numero é " + numero2);
        } else {
            System.out.println("O maior numero é " + numero3);
        }
    }

}

=================== apage essa linha para usar  ===================  */



// Faça um programa para ler 4 valores (considere que não serão informados valores iguais) e escrever o maior deles.

/* =================== apage essa linha para usar  =================== 


import java.util.Scanner;

public class Script {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();
        System.out.println("Digite o terceiro numero: ");
        int numero3 = scanner.nextInt();
        System.out.println("Digite o quarto numero: ");
        int numero4 = scanner.nextInt();
        if (numero1 > numero2 && numero1 > numero3 && numero1 > numero4) {
            System.out.println("O maior numero é " + numero1);
        } else if (numero2 > numero1 && numero2 > numero3 && numero2 > numero4) {
            System.out.println("O maior numero é " + numero2);
        } else if (numero3 > numero1 && numero3 > numero2 && numero3 > numero4) {
            System.out.println("O maior numero é " + numero3);
        } else {
            System.out.println("O maior numero é " + numero4);
        }
    }

}

=================== apage essa linha para usar  ===================  */


//Faça um programa que leia  3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores. 


/* =================== apage essa linha para usar  =================== 



import java.util.Scanner;

public class Script {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();
        System.out.println("Digite o terceiro numero: ");
        int numero3 = scanner.nextInt();
        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("A soma dos dois maiores numeros é " + (numero1 + numero2));
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("A soma dos dois maiores numeros é " + (numero2 + numero3));
        } else {
            System.out.println("A soma dos dois maiores numeros é " + (numero1 + numero3));
        }
    }

}

=================== apage essa linha para usar  ===================  */

// Faça um programa que leia 5  valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.


/* =================== apage essa linha para usar  =================== 



import java.util.Scanner;

public class Script {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();
        System.out.println("Digite o terceiro numero: ");
        int numero3 = scanner.nextInt();
        System.out.println("Digite o quarto numero: ");
        int numero4 = scanner.nextInt();
        System.out.println("Digite o quinto numero: ");
        int numero5 = scanner.nextInt();
        if (numero1 > numero2 && numero1 > numero3 && numero1 > numero4 && numero1 > numero5) {
            System.out.println("A soma dos dois maiores numeros é " + (numero1 + numero2));
        } else if (numero2 > numero1 && numero2 > numero3 && numero2 > numero4 && numero2 > numero5) {
            System.out.println("A soma dos dois maiores numeros é " + (numero2 + numero3));
        } else if (numero3 > numero1 && numero3 > numero2 && numero3 > numero4 && numero3 > numero5) {
            System.out.println("A soma dos dois maiores numeros é " + (numero1 + numero3));
        } else if (numero4 > numero1 && numero4 > numero2 && numero4 > numero3 && numero4 > numero5) {
            System.out.println("A soma dos dois maiores numeros é " + (numero1 + numero4));
        } else {
            System.out.println("A soma dos dois maiores numeros é " + (numero1 + numero5));
        }
    }

}

=================== apage essa linha para usar  ===================  */



// Faça um programa para ler 2 valores informados pelo usuário e se o segundo valor informado for neutro, deve ser lido um novo valor - ou seja, para o segundo valor não pode ser aceito o valor zero nem um valor negativo. O programa deve imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido. 

/* =================== apage essa linha para usar  =================== 



import java.util.Scanner;

public class Script {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();
        if (numero2 <= 0) {
            System.out.println("Digite o segundo numero: ");
            numero2 = scanner.nextInt();
        }
        System.out.println("A divisão dos dois numeros é " + (numero1 / numero2));
    }

}

=================== apage essa linha para usar  ===================  */


//Faça um programa que leia 10 valores informados pelo usuário, calcule, exiba os números informados e escreva a média aritmética desses valores lidos.


/* =================== apage essa linha para usar  =================== 


import java.util.Scanner;

public class Script {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + "º numero: ");
            int numero = scanner.nextInt();
            soma += numero;
        }
        System.out.println("A média dos numeros é " + (soma / 10));
    }

}

=================== apage essa linha para usar  ===================  */


//Escreva um programa para ler as notas das 4 avaliações de um aluno no semestre, calcular e escrever a média do semestre e a seguinte mensagem: PARABÉNS! Você foi aprovado! somente se o aluno foi aprovado (considere 6.0 a média mínima para aprovação e 4 notas informadas). 


/* =================== apage essa linha para usar  =================== 



import java.util.Scanner;

public class Script {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println("Digite a " + (i + 1) + "º nota: ");
            int nota = scanner.nextInt();
            soma += nota;
        }
        if (soma / 4 >= 6) {
            System.out.println("PARABÉNS! Você foi aprovado!");
        } else {
            System.out.println("Você foi reprovado!");
        }
    }

}


=================== apage essa linha para usar  ===================  */


 //Crie uma bomba relógio (usando somente código - para deixar claro!) cuja contagem regressiva vá de 30 a 0. Utilize "document.write" para escrever em tela e no final da repetição escreva "EXPLOSÃO".

 /* =================== apage essa linha para usar  =================== 


    import java.util.Scanner;

    public class Script {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            for (int i = 30; i >= 0; i--) {
                System.out.println(i);
            }
            System.out.println("EXPLOSÃO");
        }

    }

    =================== apage essa linha para usar  ===================  */


    //Escreva um algoritmo para imprimir os números de 1 (inclusive) a 10 (inclusive) em ordem decrescente.


     /* =================== apage essa linha para usar  =================== 



    import java.util.Scanner;

    public class Script {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            for (int i = 10; i >= 1; i--) {
                System.out.println(i + " tic tic tic ");
            }
        }

    }

        =================== apage essa linha para usar  ===================  */

        //Faça um algoritmo que calcule e escreva a média aritmética dos dois números inteiros informados pelo usuário e todos os números inteiros entre eles. Considere que o primeiro sempre será menor que o segundo.


             /* =================== apage essa linha para usar  =================== 

        import java.util.Scanner;

        public class Script {

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Digite o primeiro numero: ");
                int numero1 = scanner.nextInt();
                System.out.println("Digite o segundo numero: ");
                int numero2 = scanner.nextInt();
                int soma = 0;
                for (int i = numero1; i <= numero2; i++) {
                    soma += i;
                }
                System.out.println("A média dos numeros é " + (soma / (numero2 - numero1)));
            }

        }

                =================== apage essa linha para usar  ===================  */

                //Escreva um programa para ler 6 notas de um aluno, calcular e imprimir a média final. Considere que a nota de aprovação é 6,5. Logo após escrever a mensagem "Calcular a média de outro aluno Sim/Não?" e solicitar um resposta. Se a resposta for "S", o programa deve ser executado novamente, caso contrário deve ser encerrado exibindo a quantidade de alunos aprovados.   


                /* =================== apage essa linha para usar  =================== 


                             
                import java.util.Scanner;

                public class Script {

         public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           int alunosAprovados = 0;
          do {
          int soma = 0;
        for (int i = 0; i < 6; i++) {
              System.out.println("Digite a " + (i + 1) + "º nota: ");
            int nota = scanner.nextInt();
          soma += nota;
        if (soma / 6 >= 6.5) {
            }
     System.out.println("Calcular a média de outro aluno Sim/Não?");
     } while (scanner.next().equalsIgnoreCase("S"));
    System.out.println("A quantidade de alunos aprovados é " + alunosAprovados);
         

        }
     }

=================== apage essa linha para usar  ===================  */

//Anacleto tem 1,50 metro e cresce 2 centímetros por ano, enquanto Felisberto tem 1,1O metro e cresce 3 centímetros por ano. Construa um algoritmo que calcule e imprima quantos anos serão necessários para que Felisberto seja maior que Anacleto.

   /* =================== apage essa linha para usar  =================== 


import java.util.Scanner;

public class Script {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double anacleto = 1.5;
        double felisberto = 1.1;
        int anos = 0;
        while (felisberto < anacleto) {
            anacleto += 0.02;
            felisberto += 0.03;
            anos++;
        }
        System.out.println("Serão necessários " + anos + " anos para que Felisberto seja maior que Anacleto");
    }

}

=================== apage essa linha para usar  ===================  */


