package concessionaria.carros;

import concessionaria.Veiculo;

public class CarroLuxo extends Veiculo {

    public CarroLuxo(float precoBase) {
        super(precoBase);
    }

    public float calcularPreco() {
        return this.precoBase * (1 + this.motorizacao.percentualAcrescimo());
    }
}
