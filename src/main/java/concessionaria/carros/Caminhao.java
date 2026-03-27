package concessionaria.carros;

import concessionaria.Veiculo;

public class Caminhao extends Veiculo {

    private int eixos;

    public Caminhao(float precoBase) {
        super(precoBase);
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public float calcularPreco() {
        return this.precoBase * this.eixos * (1 + this.motorizacao.percentualAcrescimo());
    }
    
}
