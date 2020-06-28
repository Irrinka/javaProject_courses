public class StringFunctions {

    SomeFunctions functions = new SomeFunctions();

    public String replaceWords() {
        String s = new String();
        String userStringFirstInput = functions.getUserStringInput("Please enter characters:  ");
        String userStringSecondInput = functions.getUserStringInput("Please enter characters:  ");
        return s.replace(userStringFirstInput, userStringSecondInput);
    }
}
