package Singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CertificadoDigitalAutenticadorTest {
    @Test
    public void deveRetornarValido() {
        CertificadoDigitalAutenticador autenticador = CertificadoDigitalAutenticador.getInstance();

        boolean resultado = autenticador.autenticar("CERTIFICADO_VALIDO");
        assertTrue(resultado, "O certificado válido deveria ser autenticado com sucesso.");
    }

    @Test
    public void deveRetornarInvalido() {
        CertificadoDigitalAutenticador autenticador = CertificadoDigitalAutenticador.getInstance();

        boolean resultado = autenticador.autenticar("CERTIFICADO_INVALIDO");
        assertFalse(resultado, "O certificado inválido não deveria ser autenticado.");
    }

    @Test
    public void deveRetornarNulo() {
        CertificadoDigitalAutenticador autenticador = CertificadoDigitalAutenticador.getInstance();

        boolean resultado = autenticador.autenticar(null);
        assertFalse(resultado, "Um certificado nulo não deveria ser autenticado.");
    }
}