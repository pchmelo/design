import java.util.List;

public class StringRecipe {
    private List<StringTransformer> transformers;

    public StringRecipe(List<StringTransformer> transformers){
        this.transformers = transformers;
    }
    void mix (StringDrink drink){
        for(StringTransformer t : transformers){
            t.execute(drink);
        }
    }
}
