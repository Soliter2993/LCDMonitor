/**
 ._.   ...   ._.   ._.   ...   ._.   ._.   ._.   ._.   ._.
 |.|   ..|   ._|   ._|   |_|   |_.   |_.   ..|   |_|   |_|
 |_|   ..|   |_.   ._|   ..|   ._|   |_|   ..|   |_|   ..|
 */
public class Digit {
    private String n0 = "._.\n|.|\n|_|";
    private String n1 = "...\n..|\n..|";
    private String n2 = "._.\n._|\n|_.";
    private String n3 = "._.\n._|\n._|";

    int[] items =  new int [3];
    char[] itemsChar = new char [3];
    String [] strings = new String [] {n0,n1,n2,n3};

    public String printDigits(int value) {
        itemsChar = ("" + value).toCharArray();
        for(int i = itemsChar.length; i > 0; i--){
            items[itemsChar.length - i] = Character.getNumericValue(itemsChar[i - 1]);
        }


        return "";
    }

    public String printDigits(int index0, int index1) {
        return makeFirstLine(index0,index1) + "\n" + makeSecondLine(index0, index1) + "\n" + makeThirdLine(index0, index1);
    }

    private String makeFirstLine(int i0, int i1){
        return String.valueOf(strings[i0].split("\n")[0]) + " " + String.valueOf(strings[i1].split("\n")[0]);
    }
    private String makeSecondLine(int i0, int i1){
        return String.valueOf(strings[i0].split("\n")[1]) + " " + String.valueOf(strings[i1].split("\n")[1]);
    }
    private String makeThirdLine(int i0, int i1){
        return String.valueOf(strings[i0].split("\n")[2]) + " " + String.valueOf(strings[i1].split("\n")[2]);
    }




    public String printDigits(int index0, int index1, int index2) {
        return makeFirstLine(index0,index1, index2) + "\n"
                + makeSecondLine(index0, index1, index2) + "\n"
                + makeThirdLine(index0, index1, index2);
    }
    private String makeFirstLine(int i0, int i1, int i2){
        return String.valueOf(strings[i0].split("\n")[0]) + " "
                + String.valueOf(strings[i1].split("\n")[0] + " "
                + String.valueOf(strings[i2].split("\n")[0]));
    }
    private String makeSecondLine(int i0, int i1, int i2){
        return String.valueOf(strings[i0].split("\n")[1]) + " "
                + String.valueOf(strings[i1].split("\n")[1]) + " "
                + String.valueOf(strings[i2].split("\n")[1]);
    }
    private String makeThirdLine(int i0, int i1, int i2){
        return String.valueOf(strings[i0].split("\n")[2]) + " "
                + String.valueOf(strings[i1].split("\n")[2]) + " "
                + String.valueOf(strings[i2].split("\n")[2]);
    }

}
