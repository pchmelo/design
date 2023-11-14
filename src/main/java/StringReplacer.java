public class StringReplacer implements StringTransformer{
    private char t_1;
    private char t_2;

    public StringReplacer(char t_1, char t_2){
        this.t_1 = t_1;
        this.t_2 = t_2;
    }
    @Override
    public void execute(StringDrink drink){
        String text = drink.getText().replace(t_1,t_2);
        drink.setText(text);

    }

    @Override
    public void undo(StringDrink drink){
        String text = drink.getText().replace(t_2,t_1);
        drink.setText(text);
    }
}
