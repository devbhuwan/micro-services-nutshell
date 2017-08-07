package bpm.service.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public final class SafeValueUtil {

    private SafeValueUtil() {
    }

    public static List<?> safe(List<?> list) {
        return list == null ? new ArrayList<>() : list;
    }

    public static Set<?> safe(Set<?> set) {
        return set == null ? new HashSet<>() : set;
    }

}
