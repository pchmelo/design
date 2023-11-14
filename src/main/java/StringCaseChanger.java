public class StringCaseChanger implements StringTransformer {
    public void execute(StringDrink drink) {
        String text = drink.getText();
        StringBuilder new_text = new StringBuilder();

        for(char c : text.toCharArray()){
            if(Character.isLowerCase(c)){
                new_text.append(Character.toUpperCase(c));
            }
            else{
                new_text.append(Character.toLowerCase(c));
            }
        }
        drink.setText(new_text.toString());

    }

    @Override
    public void undo(StringDrink drink){
        String text = drink.getText();
        StringBuilder new_text = new StringBuilder();

        for(char c : text.toCharArray()){
            if(Character.isLowerCase(c)){
                new_text.append(Character.toUpperCase(c));
            }
            else{
                new_text.append(Character.toLowerCase(c));
            }
        }
        drink.setText(new_text.toString());
    }
}