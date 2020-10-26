public class Practice111 {
    public static void main(String args[]){
        class AllTheColorsOfTheRainbow{
            int anIntegerReprsentingColors;
            void changeTheHueOfTheColor(int newHue){
                anIntegerReprsentingColors = newHue;
            }
        }

        AllTheColorsOfTheRainbow allTheColorsOfTheRainbow = new AllTheColorsOfTheRainbow();
        allTheColorsOfTheRainbow.changeTheHueOfTheColor(27);
    }
}
