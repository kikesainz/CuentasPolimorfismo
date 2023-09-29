package com.kike.banco;

import java.util.ArrayList;
import java.util.List;

import com.kike.cuentas.Cuenta;
import com.kike.cuentas.CuentaAhorro;
import com.kike.cuentas.CuentaCorriente;

public class Banco {
	
	public void crearCuentas() {
		List<Cuenta> cuentas = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			cuentas.add(new CuentaCorriente(i, 0));
			cuentas.add(new CuentaAhorro(i + 11, 0));
		}

		for (Cuenta c : cuentas) {
			c.ingresarDinero(500);
			System.out.println();
			c.sacarDinero(600);

			System.out.print(c.toString());
			System.out.println();
		}
	}
}
