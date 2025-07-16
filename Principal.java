public class Principal {
    
    public static void realizarRetiro(CuentaBanco cuenta, double monto) {
        cuenta.retirar(monto);
    }

    public static void main(String[] args) {

        CuentaAhorro cuentaAhorro = new CuentaAhorro(1000, 300);
        RevisionCuenta cuentaRevision = new RevisionCuenta(1000, 20);

        realizarRetiro(cuentaAhorro, 350); 
        realizarRetiro(cuentaAhorro, 250); 

        realizarRetiro(cuentaRevision, 900); 
        realizarRetiro(cuentaRevision, 800); 
    }
}

