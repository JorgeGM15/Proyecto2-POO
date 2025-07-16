public class CuentaBanco {
    private double saldo;

    public CuentaBanco(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depositado: " + monto + ". Saldo actual: " + saldo);
        } else {
            System.out.println("Monto de depósito inválido");
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retirado: " + monto + ". Saldo actual: " + saldo);
        } else {
            System.out.println("Retiro no permitido, saldo insuficiente o monto inválido.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public double setSaldo() {
        return saldo;
    }
}

