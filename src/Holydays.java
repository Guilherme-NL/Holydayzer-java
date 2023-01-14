import java.util.HashMap;
import java.util.Map;

public class Holydays {
    Map<String, String> holyday = new HashMap<>();

    public Holydays() {
        mountHolydays();
    }

    public void getHolyday(String holyday) {
        String getHoliday = this.holyday.get(holyday);

        if(getHoliday == null) {
            System.out.println("Esse feriado não existe!");
        } else {
            System.out.println(getHoliday);
        }

    }

    public void mountHolydays() {
        holyday.put("01/01/2023","Confraternização mundial");
        holyday.put("21/02/2023","Carnaval");
        holyday.put("17/04/2023","Páscoa");
        holyday.put("21/04/2023","Tiradentes");
        holyday.put("01/05/2023","Dia do trabalho");
        holyday.put("08/06/2023","Corpus Christi");
        holyday.put("07/09/2023","Independência do Brasil");
        holyday.put("12/10/2023","Nossa Senhora Aparecida");
        holyday.put("02/11/2023","Finados");
        holyday.put("15/11/2023","Proclamação da República");
        holyday.put("25/12/2023","Natal");
    }

    public void getAllHolydays() {
        holyday.forEach((key, value) -> System.out.println("Data: " + key + ", Feriado: " + value));
    }
}