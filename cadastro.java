import java.util.Scanner;

public class cadastro
{
    public static void main(String[] args)
    {

        Scanner ler = new Scanner(System.in);
        String senha = "null";
        System.out.println("Insira seu nome completo:");
        String nome = ler.nextLine();

        StringBuilder ultimo = new StringBuilder("_");

        for (int i = nome.lastIndexOf(" ")+1; i <= nome.length(); i++)
        {
            if (i <nome.length())
            {
                ultimo.append(nome.charAt(i));
            }
        }


        String log = nome.charAt(0)+ultimo.toString();


        System.out.println("Seu login é: " + log);



        boolean valSenha = false;

        while (valSenha == false)
        {

            System.out.println("Crie uma senha:");
            senha = ler.nextLine();

            if (senha.length() >= 8 && senha.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[-, !, @])(?=.*[A-Z])(?=.*\\d).+"))
            {
                System.out.println("Sua senha foi definida... direcionando para login...");
                valSenha = true;
            } else
            {
                System.out.println("Senha invalida... digite novamente:");
            }
        }


        boolean doLogin = false;

        while (doLogin == false)
        {

            System.out.println("Insira seu login:");
            String vLogin = ler.nextLine();

            System.out.println("Insira sua senha:");
            String vSenha = ler.nextLine();

            if (vLogin.equals(log) && vSenha.equals(senha))
            {
                System.out.println("Bem vindo!");
                doLogin = true;
            }else
            {
                System.out.println("Login ou senha incorretos... Por favor, tente novamente!");
            }

        }

    }
}
