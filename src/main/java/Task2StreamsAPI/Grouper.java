package Task2StreamsAPI;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouper {
    public Map<String, Collection<NamedObject>> groupByName(Collection<NamedObject> collection) {
        Map<String, List<NamedObject>> listMap = collection
                .stream()
                .collect(Collectors.groupingBy(NamedObject::getName));

        return listMap.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
