package hexlet.code.schemas;

public class NumberSchema extends BaseSchema implements Schema {
    public final NumberSchema required() {
        addCheck((v) -> v instanceof Integer);
        return this;
    }

    public final NumberSchema positive() {
        addCheck((v) -> v instanceof Integer && (Integer) v > 0);
        return this;
    }

    public final NumberSchema range(final Integer from, final Integer to) {
        addCheck((v) -> v instanceof Integer && (Integer) v >= from && (Integer) v <= to);
        return this;
    }

}
