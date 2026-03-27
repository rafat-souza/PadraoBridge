package testes;

import concessionaria.Motorizacao;
import concessionaria.carros.Caminhao;
import concessionaria.motores.Motor10;
import concessionaria.motores.Motor16;
import concessionaria.motores.Motor20;
import concessionaria.motores.MotorTurbo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaminhaoTest {

    @Test
    void deveRetornarPrecoCaminhaoComMotor10() {
        Motorizacao motor = new Motor10();
        Caminhao caminhao = new Caminhao(50000.0f);
        caminhao.setMotorizacao(motor);
        caminhao.setEixos(3);
        assertEquals(150000.0f, caminhao.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoCaminhaoComMotor16() {
        Motorizacao motor = new Motor16();
        Caminhao caminhao = new Caminhao(50000.0f);
        caminhao.setMotorizacao(motor);
        caminhao.setEixos(3);
        assertEquals(165000.0f, caminhao.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoCaminhaoComMotor20() {
        Motorizacao motor = new Motor20();
        Caminhao caminhao = new Caminhao(50000.0f);
        caminhao.setMotorizacao(motor);
        caminhao.setEixos(3);
        assertEquals(180000.0f, caminhao.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoCaminhaoComMotorTurbo() {
        Motorizacao motor = new MotorTurbo();
        Caminhao caminhao = new Caminhao(50000.0f);
        caminhao.setMotorizacao(motor);
        caminhao.setEixos(3);
        assertEquals(195000.0f, caminhao.calcularPreco(), 0.01f);
    }
}
