package testes;

import concessionaria.Motorizacao;
import concessionaria.carros.CarroPopular;
import concessionaria.motores.Motor10;
import concessionaria.motores.Motor16;
import concessionaria.motores.Motor20;
import concessionaria.motores.MotorTurbo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarroPopularTest {

    @Test
    void deveRetornarPrecoCarroPopularComMotor10() {
        Motorizacao motor = new Motor10();
        CarroPopular carro = new CarroPopular(50000.0f);
        carro.setMotorizacao(motor);
        assertEquals(50000.0f, carro.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoCarroPopularComMotor16() {
        Motorizacao motor = new Motor16();
        CarroPopular carro = new CarroPopular(50000.0f);
        carro.setMotorizacao(motor);
        assertEquals(50000.0f, carro.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoCarroPopularComMotor20() {
        Motorizacao motor = new Motor20();
        CarroPopular carro = new CarroPopular(50000.0f);
        carro.setMotorizacao(motor);
        assertEquals(50000.0f, carro.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoCarroPopularComMotorTurbo() {
        Motorizacao motor = new MotorTurbo();
        CarroPopular carro = new CarroPopular(50000.0f);
        carro.setMotorizacao(motor);
        assertEquals(50000.0f, carro.calcularPreco(), 0.01f);
    }
}
