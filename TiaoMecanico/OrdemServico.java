import java.util.ArrayList;

public class OrdemServico {
    private double total;
    private Clientes cliente;
    private Veiculo veiculo;
    private ArrayList<Servicos> servicos = new ArrayList<>();

    public void addTotal(double total) {
        this.total += total;
    }

    public double getTotal() {
        return total;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void addServico(Servicos servico) {
        servicos.add(servico);
    }

    public void imprimir() {
        System.out.println("");
        System.out.println("          MECANICA DO TIÃO          ");
        System.out.println("----------------------------------------");
        System.out.println(formatar("Cliente", this.cliente.getNome()));
        System.out.println(formatar("CPF", formatCPF(this.cliente.getCPF())));
        System.out.println(formatar("Endereço", this.cliente.getEndereco()));
        System.out.println(formatar("Contato", this.cliente.getContato()));
        System.out.println("");
        System.out.println(formatar("Veículo", this.veiculo.getDescricao()));
        System.out.println(formatar("Placa", this.veiculo.getPlaca()));
        System.out.println(formatar("Ano", this.veiculo.getAno()));
        System.out.println("");
        System.out.println("                Serviço                 ");
        System.out.println("----------------------------------------");
        for(int i = 0; i < this.servicos.size(); i++){
            System.out.println(formatar(this.servicos.get(i).getDescricao(), String.valueOf(this.servicos.get(i).getValor())));
        }
        System.out.println("----------------------------------------");
        System.out.println(formatar("Total", String.valueOf(this.total)));
        System.out.println("----------------------------------------");
    }
}