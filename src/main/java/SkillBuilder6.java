
/**
 * SkillBuilder6 is a class for completing this Skill
 * Builder assignment in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class SkillBuilder6 {


    private static final int startState = 0;
    private static final int isT = 1;
    private static final int isY = 2;

    private static final String findT = "tT";
    private static final String findY = "yY";

    public static String findTYPattern(String s) {
        int currentState = startState;
        int first = 0;
        int last = 0;
        for (int index = 0; index < s.length(); index++) {
            char t = s.charAt(index);
            if (findT.indexOf(t) > -1) {
            }

            for (int i = 0; i < s.length(); i++){
                char y = s.charAt(i);
                if (findY.lastIndexOf(y) > -1) {
                    currentState = isY;
                    last = index;
                }

            }
        }

            return s.substring(first, last);
    }
}
