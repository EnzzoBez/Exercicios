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
}
