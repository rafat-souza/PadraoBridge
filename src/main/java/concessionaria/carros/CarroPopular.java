package concessionaria.carros;

import concessionaria.Veiculo;

public class CarroPopular extends Veiculo {

    public CarroPopular(float precoBase) {
        super(precoBase);
    }

    public float calcularPreco() {
        return this.precoBase;
    }
}
