package fr.univpau.convertisseur.calcul;

public class Convertion {

    private float result;

    public float ConvertionTemp(float value, String tempSrc, String tempDest){
        switch (tempSrc){
            case "Celsius":
                switch (tempDest){
                    case "Celsius":
                        result = value;
                        break;
                    case "Kelvin":
                        result = (value + 273.15f);
                        break;
                    case "Fahrenheit":
                        result = ((9f / 5f ) * value + 32f);
                        break;
                }
                break;
            case "Kelvin":
                switch (tempDest){
                    case "Celsius":
                        result = (value - 273.15f);
                        break;
                    case "Kelvin":
                        result = value;
                        break;
                    case "Fahrenheit":
                        result = ((9f / 5f ) * value - 459.67f);
                        break;
                }
                break;
            case "Fahrenheit":
                switch (tempDest){
                    case "Celsius":
                        result = (5f / 9f ) * (value - 32f);
                        break;
                    case "Kelvin":
                        result = (5f / 9f ) * (value + 459.67f);
                        break;
                    case "Fahrenheit":
                        result = value;
                        break;
                }
                break;
        }
        return result;
    }
}
