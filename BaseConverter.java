package MyProject5.ConverterOfTemper;

public class BaseConverter {


    public  void convert(double temperCel) {


        double temperKelvin = temperCel + 273.15;
        double temperFarengate = temperCel * 1.8 + 32;
        System.out.println("Температура по Кельвину = " + temperKelvin + "," + " по Фаренгейту = " + temperFarengate);
    }
}