package command.data;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.powermock.reflect.Whitebox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@ExtendWith(MockitoExtension.class)
public class StoreTest {

    @Test
    public void getTags() {
        List<String> tags = new ArrayList<>();
        tags.add("knapsack");
        tags.add("math");
        tags.add("mathematics");
        tags.add("sieve");
        tags.add("runtime error");
        tags.add("sieve-of-eratosthenes");
        Whitebox.setInternalState(Store.class, "tags", tags);
        List<String> actualTags = Store.getTags();
        Assert.assertEquals("size differs", tags.size(), actualTags.size());
        for (int i = 0; i < tags.size(); i++)
            Assert.assertEquals("tags differ", tags.get(i), actualTags.get(i));
    }

    @Test
    public void delete() {
        List<String> tags = new ArrayList<>();
        tags.add("knapsack");
        tags.add("math");
        tags.add("mathematics");
        tags.add("sieve");
        tags.add("runtime error");
        tags.add("sieve-of-eratosthenes");
        Whitebox.setInternalState(Store.class, "tags", tags);
        Store.delete("knapsack");
        List<String> actualTags = Store.getTags();
        List<String> expectedTags = Arrays.asList("math","mathematics","sieve","runtime error",
                "sieve-of-eratosthenes");
        Assert.assertEquals("size differs", expectedTags.size(), actualTags.size());
        for (int i = 0; i < expectedTags.size(); i++)
            Assert.assertEquals("tags differ", expectedTags.get(i), actualTags.get(i));
    }

    @Test
    public void insert() {
        List<String> tags = new ArrayList<>();
        tags.add("knapsack");
        tags.add("math");
        tags.add("mathematics");
        tags.add("sieve");
        tags.add("runtime error");
        tags.add("sieve-of-eratosthenes");
        Whitebox.setInternalState(Store.class, "tags", tags);
        Store.insert("tag");
        List<String> actualTags = Store.getTags();
        List<String> expectedTags = new ArrayList<>();
        expectedTags.add("knapsack");
        expectedTags.add("math");
        expectedTags.add("mathematics");
        expectedTags.add("sieve");
        expectedTags.add("runtime error");
        expectedTags.add("sieve-of-eratosthenes");
        expectedTags.add("tag");
        Assert.assertEquals("size differs", expectedTags.size(), actualTags.size());
        for (int i = 0; i < expectedTags.size(); i++)
            Assert.assertEquals("tags differ", expectedTags.get(i), actualTags.get(i));
    }
}