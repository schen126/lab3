import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests implements StringChecker{
    @Test
    public void testFilter() {
        String[] filterStr = {"are", "Are", "th", "Hello", "Goodbye", "as", "cd"};
        List<String> str = new ArrayList<>();
        for(int i = 0; i < filterStr.length; i++) {
            str.add(filterStr[i]);
        }

        List<String> result = new ArrayList<>();
        result.add("cd");
        result.add("as");
        result.add("th");

        //ListExamples sc = new ListExamples();
        ListTests sc = new ListTests();
        assertEquals(result, ListExamples.filter(str, sc));
    }

    public boolean checkString(String s) {
        if(s.length()==2) {
            return true;
        }
        return false;
    }

    @Test
    public void testMerge() {
        List<String> str1 = new ArrayList<>();
        str1.add("Hello1");
        str1.add("Hello2");
        str1.add("Hello3");

        List<String> str2 = new ArrayList<>();
        str2.add("Goodbye1");
        str2.add("Goodbye2");
        str2.add("Goodbye3");

        ArrayList<String> expectedResult = new ArrayList<String>();
        expectedResult.add("Goodbye1");
        expectedResult.add("Goodbye2");
        expectedResult.add("Goodbye3");
        expectedResult.add("Hello1");
        expectedResult.add("Hello2");
        expectedResult.add("Hello3");

        assertEquals(expectedResult, ListExamples.merge(str1, str2));
    }
}
