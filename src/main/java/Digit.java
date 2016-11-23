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
    private String n4 = "...\n|_|\n..|";
    private String n5 = "._.\n|_.\n._|";
    private String n6 = "._.\n|_.\n._|";
    private String n7 = "._.\n|_.\n._|";
    private String n8 = "._.\n|_.\n._|";
    private String n9 = "._.\n|_.\n._|";
    String result = "";

    int[] items =  new int [10];
    static char[] itemsChar = new char [10];

    void fillItemsChar(){
        for(int k=0; k < itemsChar.length -1; k++){
            itemsChar[k] = 'a';
        }
    }

    String [] strings = new String [] {n0,n1,n2,n3,n4,n5,n6,n7,n8,n9};

    public String printDigits(int value) {
        fillItemsChar();
        itemsChar = ("" + value).toCharArray();
        for(int j = itemsChar.length; j > 0; j--){
            items[itemsChar.length - j] = Character.getNumericValue(itemsChar[j - 1]);
        }

        for(int line = 0; line < 3; line++){
            for (int i = 0; i <= itemsChar.length -1; i++ ){
                if(  itemsChar[i] != 'a'){
                   result += String.valueOf(strings[ Character.getNumericValue(itemsChar[i])].split("\n")[line]);
                    if ( i != itemsChar.length - 1)
                        result += " ";
                }
            }
            if (line != 2)
                result += "\n";
        }
        return result;

    }
}
