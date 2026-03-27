package concessionaria;

public abstract class Veiculo {

    protected Motorizacao motorizacao;

    protected float precoBase;

    public Veiculo(float precoBase) {
        this.precoBase = precoBase;
    }

    public void setMotorizacao(Motorizacao motorizacao) {
        this.motorizacao = motorizacao;
    }

    public void setPrecoBase(float precoBase) {
        this.precoBase = precoBase;
    }

    public abstract float calcularPreco();
}
