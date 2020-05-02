package ru.home.tags;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContainTag extends Tag<ContainTag> {
    private static String FOUR_SPACES = "    ";

    private List<DomContent> children;

    public ContainTag(String tagName) {
        super(tagName);
        this.children = new ArrayList<>();
    }

    public String indenter(int level, String text) {
        String a = String.join("", Collections.nCopies(level, FOUR_SPACES)) + text;
        return a;
    }

    public ContainTag with(DomContent child) {
        if (this == child) {
            throw new RuntimeException("Cannot append a tag to itself.");
        }
        if (child == null) {
            return this;
        }
        children.add(child);
        return this;
    }

    public ContainTag with(DomContent... children) {
        for (DomContent child : children) {
            with(child);
        }
        return this;
    }


    public ContainTag withText(String text) {
        return with(new Text(text));
    }

    public String renderFormatted() throws IOException {
        return renderFormatted(0);
    }

    static String rend(ContainTag tag, int level) throws IOException {
        return tag.renderFormatted(level);
    }

    private String renderFormatted(int lvl) throws IOException {
        StringBuilder sb = new StringBuilder();
        renderOpenedTag(sb, null);
        if (hasTagName()) {
            sb.append("\n");
        }
        if (!children.isEmpty()) {
            for (DomContent c : children) {
                lvl++;
                if (c instanceof ContainTag) {
                    if (((ContainTag) c).hasTagName()) {
                        sb.append(indenter(lvl, rend((ContainTag) c, lvl)));
                    } else {
                        sb.append(indenter(lvl - 1, rend((ContainTag) c, lvl - 1)));
                    }
                } else {
                    sb.append(indenter(lvl, c.render()));
                    sb.append("\n");
                }
                lvl--;
            }
        }
        sb.append(indenter(lvl, ""));
        renderCloseTag(sb);
        if (hasTagName()) {
            sb.append("\n");
        }
        return sb.toString();
    }
    @Override
    public void renderModel(Appendable writer, Object model) throws IOException {
        renderOpenedTag(writer, model);
        if (children != null && !children.isEmpty()) {
            for (DomContent child : children) {
                child.renderModel(writer, model);
            }
        }
        renderCloseTag(writer);
    }
}
