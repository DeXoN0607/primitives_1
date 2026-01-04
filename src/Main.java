//TIP Чтобы <b>запустить</b> код, нажмите <shortcut actionId="Run"/> или
// нажмите на значок <icon src="AllIcons.Actions.Execute"/> на полях.
public class Main {
    public static void main(String[] args) {
        int ticketPrice = 24_342;

        int milesPrice = 20;

        int bonusMiles = ticketPrice/milesPrice;
        //TIP Нажмите <shortcut actionId="ShowIntentionActions"/>, когда курсор находится на подсвеченном тексте,
        // чтобы увидеть предложения IntelliJ IDEA по исправлению.
        System.out.println(bonusMiles);

    }
}