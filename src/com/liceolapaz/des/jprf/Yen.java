package com.liceolapaz.des.jprf;

public class Yen implements Moneda {

	private double cantidad;
	private double factorConversion = 0.00779327499;

	public Yen(double cantidad) {
		super();
		this.cantidad = cantidad;
	}

	@Override
	public double cantidadEnEuros() {
		return this.cantidad * this.factorConversion;
	}

}
