package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maphelper {

          public static class Entry {
            private String key;
            private Object value;

            public Entry(String key, Object value) {
                this.key = key;
                this.value = value;
            }

            public String getKey() {
                return key;
            }

            public Object getValue() {
                return value;
            }
        }

        public static Map<String, Object> map(Entry... entries) {
            Map<String, Object> map = new HashMap<String, Object>();
            for (Entry e : entries) {
                map.put(e.getKey(), e.getValue());
            }
            return map;
        }

        public static Entry entry(String k, Object v) {
            return new Entry(k, v);
        }

        public static List<Object> array(Object... items) {
            List<Object> list = new ArrayList<Object>(items.length);
            for (int i = 0; i < items.length; i++) {
                list.add(i, items[i]);
            }
            return list;
        }
    }

