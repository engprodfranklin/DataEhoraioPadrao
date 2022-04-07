import java.util.Date;
import java.util.Calendar;

public class DataPadrao {

	public static void main(String[] args) {
		    Date data = new Date();
		    Calendar cal = Calendar.getInstance();
	//Código-fonte para hora do dia
    int hora = data.getHours();
    //Código-fonte para minutos do dia
    int minutos = data.getMinutes();
    //Código-fonte para segundos atuais
    int segundos = data.getSeconds();   
//Impressão padrão do Horário Atual, termo convencional
    System.out.println(hora + ":" + minutos + ":" + segundos);   
 // 14:17:29
    
	//Código-fonte para dia atual
	int dia = cal.get(Calendar.DAY_OF_MONTH);
	//Código-fonte para mês atual
	int mes = cal.get(Calendar.MONTH);
	//Código-fonte para ano atual
	int ano = cal.get(Calendar.YEAR);
//Impressão padrão da Data Atual, termo convencional
System.out.println(dia + "/" + mes + "/" + ano);
// 7/3/2022

	}
}
