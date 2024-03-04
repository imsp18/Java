public class DataTypes {
    public static void main(String[] args) {
        //integer data type
        byte aSingleByte = 100; //-128 to 127
        short aShortInteger = 10000; //-32,768 to 32,767
        int anInteger = 100000; //-2,147,483,648 to 2,147,483,647
        long aLongInteger = 1000000000; //-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        //decimal data type
        float aFloat = 234.5f; // 32-bit floating point
        double aDouble = 234.5; // 64-bit floating point

        //boolean data type
        boolean isWeekend = true; // true or false
        boolean isWorkday = false; // true or false

        //character data type
        char percentageSymbol = '%'; // Unicode character

        System.out.println("This is a the percentage symbol: " + percentageSymbol);
        
    }
}
