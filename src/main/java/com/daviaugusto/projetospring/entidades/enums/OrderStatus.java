package com.daviaugusto.projetospring.entidades.enums;

public enum OrderStatus {
	
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DEVIVERED(4),
	CANCELED(5);
	
	private int codigo;
	
	private OrderStatus(int code) {
		this.codigo = code;
	}

	public int getCode() {
		return codigo;
	}
	
	public static OrderStatus valueOf(int code) {
		for(OrderStatus valor : OrderStatus.values()) {
			if(valor.getCode() == code) {
				return valor;
			}
		}
		throw new IllegalArgumentException("Codigo OrderStatus invalido");
		
	}
	
	}
