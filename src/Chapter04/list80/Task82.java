package Chapter04.list80;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.channels.Selector;
import java.nio.file.Path;

/*
Как отказаться от типа var, если вызываемые имена не содержат для
людей достаточной информации о типе. Привести примеры, где типа var
следует избегать, потому что его сочетание с вызываемыми именами приводит к
тому, что люди теряют информацию.
 */
public class Task82 {

    public static File fetchBinContent() {
        return new File(" ");

    }

    public static void varLoseInformation() {

        var bin = fetchBinContent();
        //Потеря информации о типе

        try {
            var selector = Selector.open();
            //Потеря информации о типе

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
