package com.liceolapaz.des.jprf;

public class Libra implements Moneda {

	private double cantidad;
	private double factorConversion = 1.1029861;

	public Libra(double cantidad) {
		super();
		this.cantidad = cantidad;
	}

	@Override
	public double cantidadEnEuros() {
		return this.cantidad * this.factorConversion;
	}

}
