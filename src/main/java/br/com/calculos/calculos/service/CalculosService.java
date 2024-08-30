package br.com.calculos.calculos.service;

import org.springframework.stereotype.Service;

import br.com.calculos.calculos.entity.Entrada;
import br.com.calculos.calculos.entity.Resultado;

@Service
public class CalculosService {
	public Resultado calcular (Entrada entrada) {
		Resultado resultado =new Resultado();
		
		Integer soma = 0;
		
		if (entrada.getLista() != null) {
			for (int i=0; i< entrada.getLista().size(); i++) {
				soma = soma + entrada.getLista().get(i);
				System.out.println(soma);
			}	
		}
		
		resultado.setSoma(soma);
		Double media = (double) soma/entrada.getLista().size();
		resultado.setMedia(media);
		return resultado;
	}
}
