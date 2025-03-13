import java.util.ArrayList;
import java.util.List;

public class Card {
    private int value;
    private String color, name;
    private List<String> cardNames = new ArrayList<>(List.of("Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Skip","Reverse","Draw 2","Wild","Wild Draw4"));
    private List<Integer> cardValue = new ArrayList<>(List.of(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14));;
    private List<String> COLORS = new ArrayList<>(List.of("Blue","Red","Green","Yellow"));
    
    public Card(){
        this.value = (int)(Math.random()*cardValue.size());
        this.name = cardNames.get(value);
        if(value < 13){
            this.color = COLORS.get((int)(Math.random()*COLORS.size()));
        }
        else{
            this.color = "";
        }
    }
    public Card(String color, Integer value){
        this.color = color;
        this.value = value;
        this.name = cardNames.get(value);
    }
    public Card(int value){
        this.value = value;
        this.name = cardNames.get(value);
        if(value < 13){
            this.color = COLORS.get((int)(Math.random()*COLORS.size()));
        }
        else{
            this.color = "";
        }
    }

    public String toString(){
        if(value >= 13){
            return name;
        }
        return "[" + name + ", " + color + "]"; 
    }
    public static boolean isStackable(Card c1, Card c2){
        if(c1.name == c2.name){
            return true;
        }
        return false;
    }
    public int getValue(){
        return value;
    }
    public String getColor(){
        return color;
    }

    public static void main(String[]a){
        Card c1 = new Card("blue", 0);
        Card c2 = new Card("red",0);
        Card c3 = new Card("green",0);
        Card c4 = new Card("yellow",0);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

    }
}
