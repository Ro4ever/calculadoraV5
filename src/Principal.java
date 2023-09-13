import javax.swing.*;
public class Principal {

    private static Operacoes oper = new Operacoes();
    public static void main(String[] args) {

        int continuar;
        double resultado = 0;

        do
        {
            double num1 = EntradaSaida.solicitaNumero("1º");
            double num2 = EntradaSaida.solicitaNumero("2º");
            int operacao = EntradaSaida.solicitaOperacao();

            switch(operacao)
            {
                case 1:
                    Soma soma = new Soma();
                    soma.setNum1(num1);
                    soma.setNum2(num2);
                    resultado = soma.calcula();
                    break;

                case 2:
                    Subtracao sub = new Subtracao();
                    sub.setNum1(num1);
                    sub.setNum2(num2);
                    resultado = sub.calcula();
                    break;

                case 3:
                    Multiplicacao multiplicacao = new Multiplicacao();
                    multiplicacao.setNum1(num1);
                    multiplicacao.setNum2(num2);
                    resultado = multiplicacao.calcula();
                    break;

                case 4:
                    while(num2 == 0)
                    {
                        num2 = EntradaSaida.solicitaNumero("2º");
                    }
                    Divisao divisao = new Divisao();
                    divisao.setNum1(num1);
                    divisao.setNum2(num2);
                    resultado = divisao.calcula();
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Operação inválida! A calculadora será encerrada!");
                    System.exit(0);
            }
            EntradaSaida.mostraResultado(resultado, operacao);
            continuar = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar calculando? 1- Sim | 2- Não"));

        }while(continuar == 1);
    }

}
