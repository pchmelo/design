public class StringInverter implements StringTransformer{
    @Override
    public void execute(StringDrink drink){
        String text = drink.getText();
        String invert = new StringBuilder().append(text).reverse().toString();
        drink.setText(invert);
    }
    @Override
    public void undo(StringDrink drink){
        String text = drink.getText();
        String invert = new StringBuilder().append(text).reverse().toString();
        drink.setText(invert);
    }

}
