package com.kike.cuentas;

public class CuentaAhorro extends Cuenta {

	public CuentaAhorro(int a, double saldo) {
		super(a, saldo);
	}

	public void sacarDinero(double sum) {
		if (sum > 0) {
			if(getSaldo() <= sum) {
				System.err.println("CUENTA  AHORRO -> No puede quedar el saldo en negativo");
			}
			else {
				setSaldo(getSaldo() - sum);
			}
		}	
		else {
			System.err.println("Cuenta.sacarDinero(...): " + "no se puede sacar una suma negativa");
		}
	}
	
	public String toString() {
		return "CUENTA  AHORRO -> Número de cuenta " + getNumeroCuenta() + ": " + "saldo = " + getSaldo();
	}
}
