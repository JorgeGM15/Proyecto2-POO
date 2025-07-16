public class RevisionCuenta extends CuentaBanco {
    private double cuotaConsulta;

    public RevisionCuenta(double saldoInicial, double cuotaConsulta) {
        super(saldoInicial);
        this.cuotaConsulta = cuotaConsulta;
    }

    @Override
    public void retirar(double monto) {
        double montoTotal = monto + cuotaConsulta;
        if (montoTotal > getSaldo()) {
            System.out.println("No se puede retirar, saldo insuficiente para cubrir el retiro y la cuota de consulta.");
        } else {
            super.retirar(montoTotal);
        }
    }

    public double getCuotaConsulta() {
        return cuotaConsulta;
    }

    public void setCuotaConsulta(double cuotaConsulta) {
        this.cuotaConsulta = cuotaConsulta;
    }
}