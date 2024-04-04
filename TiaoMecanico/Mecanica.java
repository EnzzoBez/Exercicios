import java.util.Scanner;
public class Mecanica{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Clientes cliente = new Clientes();
        Veiculo veiculo = new Veiculo();
        Servicos servico = new Servicos();
        OrdemServico OrdemServico = new OrdemServico();
        
        System.out.println("Cliente");
        System.out.print("Nome: ");
        cliente.setNome(s.nextLine());
        System.out.print("Endereço: ");
        cliente.setEndereco(s.nextLine());
        System.out.print("CPF: ");
        cliente.setCPF(s.nextLine());
        System.out.print("Contato: ");
        cliente.setContato(s.nextLine());

        System.out.println("Veículo");
        System.out.print("Descrição: ");
        veiculo.setDescricao(s.nextLine());
        System.out.print("Placa: ");
        veiculo.setPlaca(s.nextLine());
        System.out.print("Ano: ");
        veiculo.setAno(s.nextLine());

        Servicos servicos = new Servicos();
        String continuar = "y";
       do{
            System.out.println("Serviço");
            System.out.print("Valor: ");
            servico.setValor(s.nextDouble());
            System.out.println("Tempo:");
            servico.setTempo(s.nextLine());
            s.nextLine();
            System.out.print("Descrição: ");
            servico.setDescricao(s.nextLine());

            System.out.println("Deseja mais algum serviço?: ");
            continuar = s.nextLine();
            
        } while (continuar.equalsIgnoreCase("y"));
    }  
}