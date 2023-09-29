package com.kike.cuentas;

public class Cuenta {
	private double saldo; // Saldo actual
	private int numeroCuenta; // Número de cuenta

	public Cuenta(int a, double saldo) {
		saldo = 0.0;
		numeroCuenta = a;
	}

	public void ingresarDinero(double sum) {
		if (sum > 0)
			saldo += sum;
		else
			System.err.println("No se puede ingresar una cantidad negativa");
	}

	public void sacarDinero(double sum) {
		if (sum > 0)
			saldo -= sum;
		else
			System.err.println("Cuenta.sacarDinero(...): " + "no se puede sacar una suma negativa");
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getCuentaNumber() {
		return numeroCuenta;
	}

	public String toString() {
		return "Número de cuenta " + numeroCuenta + ": " + "saldo = " + saldo;
	}

}