package com.api.ApiSpring.resources;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.ApiSpring.domain.Pedido;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoResources {

	@RequestMapping(method = RequestMethod.GET)
	public List<Pedido> listar() throws ParseException {
		
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		Pedido ped1 = new Pedido(1000, 12, df.parse("06/07/2019 08:00"), "L");
		Pedido ped2 = new Pedido(1010, 13, df.parse("02/07/2019 08:00"), "F");
		Pedido ped3 = new Pedido(1011, 12, df.parse("03/07/2019 08:00"), "L");
		
		List<Pedido> lista = new ArrayList();
		lista.add(ped1);
		lista.add(ped2);
		lista.add(ped3);
		
		
		return lista;
	}
	
	
}
