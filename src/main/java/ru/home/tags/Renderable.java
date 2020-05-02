package ru.home.tags;

import java.io.IOException;

public interface Renderable {

    default String render() {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            render(stringBuilder);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
        return stringBuilder.toString();
    }

    default void render(Appendable writer) throws IOException {
        renderModel(writer, null);
    }

    void renderModel(Appendable writer, Object model) throws IOException;
}
