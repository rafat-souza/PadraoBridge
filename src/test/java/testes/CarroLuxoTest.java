package testes;

import concessionaria.Motorizacao;
import concessionaria.carros.CarroLuxo;
import concessionaria.motores.Motor10;
import concessionaria.motores.Motor16;
import concessionaria.motores.Motor20;
import concessionaria.motores.MotorTurbo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarroLuxoTest {
    @Test
    void deveRetornarPrecoCarroLuxoComMotor10() {
        Motorizacao motor = new Motor10();
        CarroLuxo carro = new CarroLuxo(100000.0f);
        carro.setMotorizacao(motor);
        assertEquals(100000.0f, carro.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoCarroLuxoComMotor16() {
        Motorizacao motor = new Motor16();
        CarroLuxo carro = new CarroLuxo(100000.0f);
        carro.setMotorizacao(motor);
        assertEquals(110000.0f, carro.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoCarroLuxoComMotor20() {
        Motorizacao motor = new Motor20();
        CarroLuxo carro = new CarroLuxo(100000.0f);
        carro.setMotorizacao(motor);
        assertEquals(120000.0f, carro.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoCarroLuxoComMotorTurbo() {
        Motorizacao motor = new MotorTurbo();
        CarroLuxo carro = new CarroLuxo(100000.0f);
        carro.setMotorizacao(motor);
        assertEquals(130000.0f, carro.calcularPreco(), 0.01f);
    }
}
