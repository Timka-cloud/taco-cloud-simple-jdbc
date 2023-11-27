package kz.timka.tacocloudsimplejdbc.converters;

import kz.timka.tacocloudsimplejdbc.data.IngredientRef;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class IngredientRefConverter implements Converter<String, IngredientRef> {

    @Override
    public IngredientRef convert(String source) {
        IngredientRef ref = new IngredientRef();
        ref.setIngredient(source);
        return ref;
    }
}
