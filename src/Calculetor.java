public class Calculetor {
    public void getreport(Id id) {
        Id id1 =new Id();


        double caloriesMale = 88.362 + ((id.getGhad() * 4.799) + (id.getVazn() * 13.397))- (5.677 * id.getSen());;
        double caloriesFemale = 447.593 + ((id.getGhad() * 3.098) + (id.getVazn() * 9.247)) - (4.330 * id.getSen());

        if(id.isJensiat())
            System.err.println("calorie masrafi roozane shoma    " +caloriesFemale);
        else System.err.println("calori masrafi roozane shoma    "+caloriesMale);
        

    }
}