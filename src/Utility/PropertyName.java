package Utility;


import Enums.PropertyCodeEnum;

public class PropertyName {

    public static String propertyName(PropertyCodeEnum prefix) {
        String name = "";
        switch (prefix) {

            case HOU -> {
                name = "Houses";
            }
            case APA -> {
                name = "Apartments";
            }
            case CON -> {
                name = "Condos";
            }
        }
        return  name;
    }
}