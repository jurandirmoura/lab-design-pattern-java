package com.one.digitalinnovation;

import com.one.digitalinnovation.facade.Facade;
import com.one.digitalinnovation.singleton.SingletonEager;
import com.one.digitalinnovation.singleton.SingletonLazy;
import com.one.digitalinnovation.singleton.SingletonLazyHolder;
import com.one.digitalinnovation.strategy.Comportamento;
import com.one.digitalinnovation.strategy.ComportamentoAgressivo;
import com.one.digitalinnovation.strategy.ComportamentoDefensivo;
import com.one.digitalinnovation.strategy.ComportamentoNormal;
import com.one.digitalinnovation.strategy.Robo;

public class Teste {
	public static void main(String[] args) {
		
		//Singleton
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		//Strategy
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		//Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Jurandir", "7454340");
		
		
		
	}

}
