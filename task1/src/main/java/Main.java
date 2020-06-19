import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

import static ru.home.FileBuilder.FileBuilder.fileCheck;
import static ru.home.FileBuilder.FileBuilder.fileCreate;
import static ru.home.tags.TagCreator.*;

public class Main {
    public static void main(String[] args) {
        String text = html(
                title("Login gage"),
                body(
                        div(form(
                                table(
                                        tr(td(input())),
                                        tr(td(input()))
                                ),
                                button("Login")
                                )
                        )
                )

        ).renderFormatted();

        String tagsDemonstration = html(
                title("Tags demonstration"),
                style("  h1 { \n" +
                        "    font-size: 120%; \n" +
                        "    font-family: Verdana, Arial, Helvetica, sans-serif; \n" +
                        "    color: red;\n" +
                        "   }" +
                        "body {\n" +
                        "    background-color:palegreen;\n" +
                        "}"),
                body(
                        h1("HELLO, ADMIN"),
                        div(form(
                                table(
                                        tr(td(input())),
                                        tr(td(input())),
                                        tr(td(input())),
                                        tr(td(input()))
                                ),
                                button("go")
                                )
                        ),
                        output(),
                        h1("h1 текст"),h2("h2 текст"),h3("h3 текст"),h4("h4 текст"),h5("h5 текст"),h6("h6 текст"),
                        strong("жирный текст"),
                        button("button")

                )

        ).renderFormatted();
        System.out.println(tagsDemonstration);







/*        fileCheck(
                text,
                "C:/Users/Kirill/Desktop/Диплом/HTMLproject/task1/src/main/resources/testFile.txt",
                false);*/
    }
}

//  fileCheck(text, "C:/Users/Kirill/Desktop/testFile.txt", false);
//     String text = html(title(), body(), div()).renderFormatted();
//fileCheck(text, "C:/Users/Kirill/Desktop/Диплом/HTMLproject/task1/src/main/resources/testFile.txt", false);
//   System.out.println(text);