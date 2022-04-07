import java.util.Date;
import java.util.Calendar;

public class DataPadrao {

	public static void main(String[] args) {
		    Date data = new Date();
		    Calendar cal = Calendar.getInstance();
	//C�digo-fonte para hora do dia
    int hora = data.getHours();
    //C�digo-fonte para minutos do dia
    int minutos = data.getMinutes();
    //C�digo-fonte para segundos atuais
    int segundos = data.getSeconds();   
//Impress�o padr�o do Hor�rio Atual, termo convencional
    System.out.println(hora + ":" + minutos + ":" + segundos);   
 // 14:17:29
    
	//C�digo-fonte para dia atual
	int dia = cal.get(Calendar.DAY_OF_MONTH);
	//C�digo-fonte para m�s atual
	int mes = cal.get(Calendar.MONTH);
	//C�digo-fonte para ano atual
	int ano = cal.get(Calendar.YEAR);
//Impress�o padr�o da Data Atual, termo convencional
System.out.println(dia + "/" + mes + "/" + ano);
// 7/3/2022

	}
}
