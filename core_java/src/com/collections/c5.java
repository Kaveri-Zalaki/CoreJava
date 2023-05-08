package com.collections;
import java.util.ArrayList;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Order
{
	Integer id;
	String name;
	
	public Order()
	{
		
	}
	
	public Order(Integer id, String name)
	{
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class c5 {
	
		public static void main(String[] args) {
			
			List<Order> listOrdrs =  new ArrayList<Order>();
			
			listOrdrs.add(new Order(1, "Dell"));
			listOrdrs.add(new Order(2, "Lenovo"));
			listOrdrs.add(new Order(3, "Sony"));
			listOrdrs.add(new Order(4, "Asus"));
			
			
			
			//converting list to map
			
			Map<Integer, String> mp = listOrdrs.stream()
					.collect(Collectors
							.toMap(Order::getId, Order::getName,(k, v)->k+" : "+v, LinkedHashMap::new));
			
			mp.forEach((k,v) ->System.out.println(k+" "+v));
			
			// converting map to list
			
			List<Integer> lstId = mp.entrySet().stream().map(k -> k.getKey()).collect(Collectors.toList());
			
			List<String> lstNm = mp.entrySet().stream().map(v -> v.getValue()).collect(Collectors.toList());
			
			
			lstId.forEach(System.out::println);
			
			lstNm.forEach(System.out::println);
					
		}

	}


