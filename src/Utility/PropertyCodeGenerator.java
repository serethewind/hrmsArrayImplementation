package Utility;

import Database.DataBase;
import Enums.PropertyCodeEnum;

public class PropertyCodeGenerator {
    private static int apartmentCount = 1;
    private static int houseCount = 1;
    private static int condoCount = 1;

    public static String getCode(PropertyCodeEnum prefix) {
        String code ="" ;

            switch (prefix){

                case HOU : {
                    code = "HOU" + String.format("%03d", houseCount++);
                }
                break;
                case APA : {
                    code = "APA" + String.format("%03d", apartmentCount++);
                }
                break;
                case CON : {
                    code = "CON" + String.format("%03d", condoCount++);
                }
                break;
                default:
            }

            return code;
    }

}
