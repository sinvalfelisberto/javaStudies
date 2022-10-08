package utils;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Datas {

    	
    public void mostrarDatas(){
        // https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

		DateTimeFormatter dateFormater = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter dateFormaterCHora = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");
		DateTimeFormatter dateFormaterInstant = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss")
				.withZone(ZoneId.systemDefault());

		LocalDate agora = LocalDate.now();
		LocalDateTime agoraComHora = LocalDateTime.parse("2022-10-01T15:01:59");
		Instant agoraComInstant = Instant.now();

		// LocalDate data = LocalDate.parse("2022-10-08");
		// LocalDate dataemOutroFormato = LocalDate.parse("08/10/2022", dateFormater);

		System.out.println(agora.format(dateFormater));
		System.out.println(dateFormaterCHora.format(agoraComHora));
		System.out.println(dateFormaterInstant.format(agoraComInstant));

    }
        
    
}
