package MyProject5.ConverterOfTemper;

import java.util.Scanner;



public class ConverterOfTemperature {




    public static void main(String[] args)   {

        System.out.println("Пожалуйста введите температуру: ");
        Scanner scanner = new Scanner(System.in);
        double temperCel = scanner.nextDouble();
        BaseConverter baseConverter = new BaseConverter();
        baseConverter.convert(temperCel);

    }


//




        }








