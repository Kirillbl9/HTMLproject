package ru.home.tags;


public class TagCreator {
    public static Text text(String text) {
        return new Text(text);
    }

    public static ContainTag html() {
        return new ContainTag("html");
    }

    public static ContainTag html(String text) {
        return new ContainTag("html").withText(text);
    }

    public static ContainTag html(DomContent... dc) {
        return new ContainTag("html").with(dc);
    }

    public static ContainTag body() {
        return new ContainTag("body");
    }

    public static ContainTag body(String text) {
        return new ContainTag("body").withText(text);
    }

    public static ContainTag body(DomContent... dc) {
        return new ContainTag("body").with(dc);
    }

    public static ContainTag button() {
        return new ContainTag("button");
    }

    public static ContainTag button(String text) {
        return new ContainTag("button").withText(text);
    }

    public static ContainTag button(DomContent... dc) {
        return new ContainTag("button").with(dc);
    }

    public static ContainTag h1() {
        return new ContainTag("h1");
    }

    public static ContainTag h1(String text) {
        return new ContainTag("h1").withText(text);
    }

    public static ContainTag h1(DomContent... dc) {
        return new ContainTag("h1").with(dc);
    }

    public static ContainTag h2() {
        return new ContainTag("h2");
    }

    public static ContainTag h2(String text) {
        return new ContainTag("h2").withText(text);
    }

    public static ContainTag h2(DomContent... dc) {
        return new ContainTag("h2").with(dc);
    }

    public static ContainTag h3() {
        return new ContainTag("h3");
    }

    public static ContainTag h3(String text) {
        return new ContainTag("h3").withText(text);
    }

    public static ContainTag h3(DomContent... dc) {
        return new ContainTag("h3").with(dc);
    }

    public static ContainTag h4() {
        return new ContainTag("h4");
    }

    public static ContainTag h4(String text) {
        return new ContainTag("h4").withText(text);
    }

    public static ContainTag h4(DomContent... dc) {
        return new ContainTag("h4").with(dc);
    }

    public static ContainTag h5() {
        return new ContainTag("h5");
    }

    public static ContainTag h5(String text) {
        return new ContainTag("h5").withText(text);
    }

    public static ContainTag h5(DomContent... dc) {
        return new ContainTag("h5").with(dc);
    }

    public static ContainTag h6() {
        return new ContainTag("h6");
    }

    public static ContainTag h6(String text) {
        return new ContainTag("h6").withText(text);
    }

    public static ContainTag h6(DomContent... dc) {
        return new ContainTag("h6").with(dc);
    }

    public static ContainTag head() {
        return new ContainTag("head");
    }

    public static ContainTag head(String text) {
        return new ContainTag("head").withText(text);
    }

    public static ContainTag head(DomContent... dc) {
        return new ContainTag("head").with(dc);
    }

    public static ContainTag output() {
        return new ContainTag("output");
    }

    public static ContainTag output(String text) {
        return new ContainTag("output").withText(text);
    }

    public static ContainTag output(DomContent... dc) {
        return new ContainTag("output").with(dc);
    }

    public static ContainTag strong() {
        return new ContainTag("strong");
    }

    public static ContainTag strong(String text) {
        return new ContainTag("strong").withText(text);
    }

    public static ContainTag strong(DomContent... dc) {
        return new ContainTag("strong").with(dc);
    }

    public static ContainTag style() {
        return new ContainTag("style");
    }

    public static ContainTag style(String text) {
        return new ContainTag("style").withText(text);
    }

    public static ContainTag style(DomContent... dc) {
        return new ContainTag("style").with(dc);
    }

    public static ContainTag table() {
        return new ContainTag("table");
    }

    public static ContainTag table(String text) {
        return new ContainTag("table").withText(text);
    }

    public static ContainTag table(DomContent... dc) {
        return new ContainTag("table").with(dc);
    }

    public static ContainTag td() {
        return new ContainTag("td");
    }

    public static ContainTag td(String text) {
        return new ContainTag("td").withText(text);
    }

    public static ContainTag td(DomContent... dc) {
        return new ContainTag("td").with(dc);
    }

    public static ContainTag th() {
        return new ContainTag("th");
    }

    public static ContainTag th(String text) {
        return new ContainTag("th").withText(text);
    }

    public static ContainTag th(DomContent... dc) {
        return new ContainTag("th").with(dc);
    }

    public static ContainTag title() {
        return new ContainTag("title");
    }

    public static ContainTag title(String text) {
        return new ContainTag("title").withText(text);
    }

    public static ContainTag title(DomContent... dc) {
        return new ContainTag("title").with(dc);
    }

    public static ContainTag tr() {
        return new ContainTag("tr");
    }

    public static ContainTag tr(String text) {
        return new ContainTag("tr").withText(text);
    }

    public static ContainTag tr(DomContent... dc) {
        return new ContainTag("tr").with(dc);
    }

    public static ContainTag div() {
        return new ContainTag("div");
    }

    public static ContainTag div(String text) {
        return new ContainTag("div").withText(text);
    }

    public static ContainTag div(DomContent... dc) {
        return new ContainTag("div").with(dc);
    }

    public static ContainTag form() {
        return new ContainTag("form");
    }

    public static ContainTag form(String text) {
        return new ContainTag("form").withText(text);
    }

    public static ContainTag form(DomContent... dc) {
        return new ContainTag("form").with(dc);
    }
}
