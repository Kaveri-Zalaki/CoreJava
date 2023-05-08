package com.collections;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class c4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

				List<Integer> listNum = Arrays.asList(77,66,34,90,12,34,56,78);
				
				for(Integer j : listNum)
				{
					if(j == 90)
					System.out.println(j+j); //180
				}
				
				List<Integer> flt = listNum.stream().map(k -> k+k).collect(Collectors.toList());
				
				System.out.println(flt);
				
				List<String> lstNames = Arrays.asList("java","java", ".net", "php", "php", "python","spring", "hibernate", "core");
				
				
				List<String> fltNames = lstNames.stream().filter(t -> t.startsWith("p")).collect(Collectors.toList());
				
				System.out.println(fltNames);
				
				List<String> srtNames = lstNames.stream().sorted().collect(Collectors.toList());
				
				System.out.println(srtNames);
				
				Set<String> unqData = lstNames.stream().collect(Collectors.toSet());
				
				System.out.println(unqData);
				
				List<String> lstUnq = lstNames.parallelStream().distinct().collect(Collectors.toList());
				
				System.out.println(lstUnq);
				
				lstUnq.forEach(l -> System.out.println(l));
				
				List<String> data = Arrays.asList("Java", "Spring", "Jsp", "Jsp", null);
				
				Optional<String> rdata = data.stream().reduce((names1, names2)->names1 +" : "+names2);
				
				System.out.println(rdata);
				
			}
		

	}

