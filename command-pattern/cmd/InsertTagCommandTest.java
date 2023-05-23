package command.cmd;

import command.rcv.PerfectMatchDeleter;
import command.rcv.TagInserter;
import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class InsertTagCommandTest {

    private static final String NAME = "arrays";
    @Mock
    private TagInserter tagInserter;
    @Mock
    private PerfectMatchDeleter perfectMatchDeleter;

    @Test
    public void execute() {
        Mockito.doNothing().when(tagInserter).insert(NAME);
        new InsertTagCommand(NAME, tagInserter, perfectMatchDeleter).execute();
    }

    @Test
    public void undo() {
        Mockito.when(perfectMatchDeleter.delete(NAME)).thenReturn(Arrays.asList());
        new InsertTagCommand(NAME, tagInserter, perfectMatchDeleter).undo();
    }

}