// Princípio de Projeto Singleton

package Singleton;


public class CertificadoDigitalAutenticador {

    private CertificadoDigitalAutenticador() {};

    private static CertificadoDigitalAutenticador instanciaUnica = new CertificadoDigitalAutenticador();

    public static CertificadoDigitalAutenticador getInstance() {
        return instanciaUnica;
    }

    public boolean autenticar(String certificado) {
        if (certificado != null && certificado.equals("CERTIFICADO_VALIDO")) {
            return true;
        } else {
            return false;
        }
    }
}
