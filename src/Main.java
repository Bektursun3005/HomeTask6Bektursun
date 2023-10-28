public class Main {
    public static void main(String[] args) {
       Hero [] havingSuperAbility = {new Medic(), new Warrior(), new Magic()};
        for (int i = 0; i < havingSuperAbility.length; i++) {
         if (havingSuperAbility[i] instanceof HavingSuperAbility){
             havingSuperAbility[i].applySuperAbility();
         }
        }
    }
}