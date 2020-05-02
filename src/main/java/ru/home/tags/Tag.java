package ru.home.tags;

import ru.home.attributes.Atribute;

import java.io.IOException;
import java.util.ArrayList;

public abstract class Tag<T extends Tag<T>> extends DomContent {
    protected String tagName;
    private ArrayList<Atribute> attributes;

    protected Tag(String tagName) {
        this.tagName = tagName;
        this.attributes = new ArrayList<>();
    }


    protected boolean hasTagName() {
        return tagName != null && !tagName.isEmpty();
    }


    protected void renderOpenedTag(Appendable writer, Object model) throws IOException {
        if (!hasTagName()) {
            return;
        }
        writer.append("<").append(tagName);
        for (Atribute attribute : attributes) {
            attribute.renderModel(writer, model);
        }
        writer.append(">");
    }

    protected void renderCloseTag(Appendable writer) throws IOException {
        if (!hasTagName()) {
            return;
        }
        writer.append("</");
        writer.append(tagName);
        writer.append(">");
    }
}
