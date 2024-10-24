//package modelo;
//
//public class Base {
// 
//	Usar datas
//		import java.time.LocalDate;
//		tipo: LocalDate data;
//		Usar: 
//			LocalDate.of(2025, 10, 12) - data específica sem horas
//			LocalDate.now() - data atual sem horas
//			para usar com horas:
//				LocalDateTime.now() 
//				LocalDateTime.of(2024, 10, 21, 23, 57)
//			Diferença entre datas: import java.time.Period;
//				LocalDate inicio = LocalDate.of(2022, 10, 21);
//        		LocalDate fim = LocalDate.of(2024, 10, 21);
//        		
//        		// Calcula a diferença entre duas datas	
//        		Period periodo = Period.between(inicio, fim);
//
//        		System.out.println("Diferença: " + periodo.getYears() + " anos, " +
//                           periodo.getMonths() + " meses e " +
//                           periodo.getDays() + " dias.");
//    Procurar dentro de Array:
//    	import java.util.HashMap;
//    	import java.util.Map;
//
//    	 // Mapa para armazenar a contagem de cada String
//        Map<String, Integer> frequencia = new HashMap<>();
//
//        // Contar as ocorrências de cada String
//        for (String s : array) {
//            frequencia.put(s, frequencia.getOrDefault(s, 0) + 1);
//        }
//
//        // Encontrar a String mais frequente
//        String maisFrequente = null;
//        int maxContagem = 0;
//
//        for (Map.Entry<String, Integer> entry : frequencia.entrySet()) {
//            if (entry.getValue() > maxContagem) {
//                maisFrequente = entry.getKey();
//                maxContagem = entry.getValue();
//            }
//        }
//
//        System.out.println("A string mais frequente é: \"" + maisFrequente + "\"");
//        System.out.println("Ela aparece " + maxContagem + " vezes.");
//    }
//}
//
//
//
//}
