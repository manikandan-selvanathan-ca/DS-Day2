import java.util.*;

public class CountItemsMatchingaRule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        
        HashMap<String, Integer> map = new HashMap();
        map.put("type",0);
        map.put("color",1);
        map.put("name",2);
        
        int index = map.get(ruleKey);
        int match = 0;
        
        for(List<String> item: items) {
            if(item.get(index).equals(ruleValue)) {
                match++;
            }
        }
        return match;
    }

    public static void main(String[] args) {
        CountItemsMatchingaRule countItemsMatchingaRule = new CountItemsMatchingaRule();
        
    }
}
