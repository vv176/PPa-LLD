package command.data;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.powermock.api.mockito.PowerMockito;

import java.util.Arrays;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class IStoreImplTest {

    @Test
    public void testGetTags() {
        PowerMockito.mockStatic(Store.class);
        PowerMockito.when(Store.getTags()).thenReturn(Arrays.asList("t1","t2"));
        List<String> actual = new IStoreImpl().getTags();
        List<String> expected = Arrays.asList("t1","t2");
        Assert.assertEquals("size differs", expected.size(), actual.size());
        for (int i = 0; i < expected.size(); i++)
            Assert.assertEquals("tags differ", expected.get(i), actual.get(i));
    }

    @Test
    public void testDelete() throws Exception {
        /**PowerMockito.mockStatic(Store.class);
        PowerMockito.doNothing().when(Store.class, "delete", "t1");
        new IStoreImpl().insert("t1");**/
    }

    @Test
    public void testInsert() {
    }
}