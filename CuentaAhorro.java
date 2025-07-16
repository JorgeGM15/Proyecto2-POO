public class CuentaAhorro extends CuentaBanco {
    private double limiteRetiro;

    public CuentaAhorro(double saldoInicial, double limiteRetiro) {
        super(saldoInicial);
        this.limiteRetiro = limiteRetiro;
    }

    @Override
    public void retirar(double monto) {
        if (monto > limiteRetiro) {
            System.out.println("No se puede retirar, el monto excede el límite de retiro.");
        } else {
            super.retirar(monto);
        }
    }

    public double getLimiteRetiro() {
        return limiteRetiro;
    }

    public void setLimiteRetiro(double limiteRetiro) {
        this.limiteRetiro = limiteRetiro;
    }
}