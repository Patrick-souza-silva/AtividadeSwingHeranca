public class ContaPoupanca extends ContaBancaria{

    private int diaDeRendimento;

    //get e set
    public int getDiaDeRendimento() {
        return diaDeRendimento;
    }

    public void setDiaDeRendimento(int diaDeRendimento) {
        this.diaDeRendimento = diaDeRendimento;
    }

    //metodo
    private void calcularNovoSaldo(float valorTaxa){
      this.diaDeRendimento = (int) (saldo * valorTaxa);
    }
}
