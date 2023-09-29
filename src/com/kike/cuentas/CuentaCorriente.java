package com.kike.cuentas;

public class CuentaCorriente extends Cuenta{

	public CuentaCorriente(int a, double saldo) {
		super(a, saldo);
	}
	
	public void sacarDinero(double sum) {
		setSaldo(getSaldo() - sum);
	}

	public String toString() {
		return "CUENTA CORRIENTE -> Número de cuenta " + getNumeroCuenta() + ": " + "saldo = " + getSaldo();
	}
}
