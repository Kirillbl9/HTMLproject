import java.io.IOException;

import static ru.home.tags.TagCreator.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String text =
                html(head(
                        title("Hello")),
                        body(
                                h1("Hello,test")),
                        form(),
                        output())
                        .renderFormatted();
        System.out.println(text);

    }
}

