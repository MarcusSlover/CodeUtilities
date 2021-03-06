package io.github.codeutilities.util;

public enum ChatType {
    SUCCESS("§2§l➤", 'a'),
    FAIL("§4§l➤", 'c'),
    INFO_YELLOW("§6§l➤", 'e'),
    INFO_BLUE("§9§l➤", 'b');

    private final String prefix;
    private final char trailing;

    ChatType(String prefix, char trailing) {
        this.prefix = prefix;
        this.trailing = trailing;
    }

    public String getString() {
        return this.prefix;
    }

    public char getTrailing() {
        return trailing;
    }
}
