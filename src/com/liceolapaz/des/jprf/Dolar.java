package com.liceolapaz.des.jprf;

public class Dolar implements Moneda {

	private double cantidad;
	private double factorConversion = 0.883509299;

	public Dolar(double cantidad) {
		super();
		this.cantidad = cantidad;
	}

	@Override
	public double cantidadEnEuros() {
		return this.cantidad * this.factorConversion;
	}

}
