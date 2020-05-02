package ru.home.attributes;

import ru.home.tags.Renderable;

import java.io.IOException;

public class Atribute implements Renderable {
    private String name;
    private String value;

    public Atribute(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public Atribute(String name) {
        this.name = name;
        this.value = null;
    }

    @Override
    public void renderModel(Appendable writer, Object model) throws IOException {
        if (name == null) {
            return;
        }
        writer.append(" ");
        writer.append(name);
        if (value != null) {
            writer.append("=\"");
            writer.append(value);
            writer.append("\"");
        }
    }


    public String getName() {
        return name;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue()
    {
        return value;
    }
}
