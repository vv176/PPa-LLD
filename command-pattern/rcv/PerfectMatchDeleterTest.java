package command.rcv;

import command.data.IStore;
import org.junit.Assert;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class PerfectMatchDeleterTest {

    private IStore iStore = Mockito.mock(IStore.class);

    @Test
    public void testDeleteForHappyCase() {
        List<String> tags = Arrays.asList("tag1", "tag2", "tag3");
        Mockito.when(iStore.getTags()).thenReturn(tags);
        String tagToDelete = "tag2";
        Mockito.doNothing().when(iStore).delete(tagToDelete);
        List<String> deletedTags = new PerfectMatchDeleter(iStore)
                .delete(tagToDelete);
        Assert.assertEquals("Size of list should be 1",
                1, deletedTags.size());
        // compare the lists
        Mockito.verify(iStore, Mockito.times(1))
                .getTags();
        Mockito.verify(iStore, Mockito.times(1))
                .delete(tagToDelete);
    }

}