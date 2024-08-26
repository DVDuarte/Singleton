// Princípio de Projeto Singleton

package Singleton;


class CertificadoDigitalAutenticador {

    private static CertificadoDigitalAutenticador instanciaUnica;

    private CertificadoDigitalAutenticador() {

    }

    public static CertificadoDigitalAutenticador getInstance() {
        if (instanciaUnica == null) {
            instanciaUnica = new CertificadoDigitalAutenticador();
        }
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
