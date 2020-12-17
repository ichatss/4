import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class ReadTest {
    @Test
    public void testGetPersonLinkedList() throws IOException {


        Settings settings = new Settings();
        ClassLoader loader = Settings.class.getClassLoader();

        try(InputStream io = loader.getResourceAsStream("myApp.properties")) {
            settings.load(io);
        }

        ReadDataOpenCSV readDataOpenCSV = new ReadDataOpenCSV(settings.getValue("foreign_names.path"));
        assertEquals(25898, readDataOpenCSV.getPersonLinkedList().size());
        assertEquals(28281, readDataOpenCSV.getPersonLinkedList().getFirst().getId());
        assertEquals(54178, readDataOpenCSV.getPersonLinkedList().getLast().getId());
        assertEquals(
                readDataOpenCSV.getPersonLinkedList().get(4).getOutfit().getId(),
                readDataOpenCSV.getPersonLinkedList().getLast().getOutfit().getId()
        );

    }

}