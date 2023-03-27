package eu.senla.task1.core;

public class Rainbow {
    String result;
    public String Color(String n){
        switch (n) {
            case "1":
                result = "Зеленый";
                break;

            case "2":
                result = "Красный";
                break;

            case "3":
                result = "Синий";
                break;

            case "4":
                result = "Розовый";
                break;

            case "5":
                result = "Пурпурный";
                break;

        }
    return(result);
    }

    public String DoubleColor(String m){
        switch (m) {
            case "12":
                result = "Зелено-Красный";
                break;

            case "21":
                result = "Красно-Зеленый";
                break;

            case "13":
                result = "Зелено-Синий";
                break;

            case "31":
                result = "Сине-Зеленый";
                break;

            case "14":
                result = "Зелено-Розовый";
                break;

        }
        return(result);
    }


}
