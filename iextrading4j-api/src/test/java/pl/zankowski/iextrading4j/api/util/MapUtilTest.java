package pl.zankowski.iextrading4j.api.util;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.google.common.collect.ImmutableMap;

public class MapUtilTest {

    @Test
    public void shouldCreateEmptyMapForNullInput() {
        final Map<String, String> result = MapUtil.immutableMap(null);

        assertThat(result).isEmpty();
    }

    @Test
    public void shouldCreateImmutableMapFromMap() {
        final Map<String, String> mutableMap = new HashMap<>();

        final Map<String, String> immutableMap = MapUtil.immutableMap(mutableMap);

        assertThat(immutableMap).isInstanceOf(ImmutableMap.class);
    }

}
