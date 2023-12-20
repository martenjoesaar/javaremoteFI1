package D231217;

public class Task1 {
    public static void main(String[] args) {

        Task1Author author = new Task1Author();
        author.setSurname("Mike");
        author.setNationality("Italy");

        Task1Poem poem = new Task1Poem();
        poem.setCreator(author);
        poem.setStropheNumbers(10);

        Task1Author author1 = new Task1Author();
        author1.setSurname("Panusen");
        author1.setNationality("Finland");

        Task1Poem poem1 = new Task1Poem();
        poem1.setCreator(author1);
        poem1.setStropheNumbers(76);

        Task1Author author2 = new Task1Author();
        author2.setSurname("Joosep");
        author2.setNationality("Estonia");

        Task1Poem poem2 = new Task1Poem();
        poem2.setCreator(author2);
        poem2.setStropheNumbers(10);

        Task1Poem[] poems = {poem, poem1, poem2};
        Task1Author bestAuthor = getBestAuthor(poems);
        System.out.printf("%s has written the longest poem!", bestAuthor.getSurname());
    }
    private static  Task1Author getBestAuthor(Task1Poem[] poems) {
        int counter = 0;

        for(int i = 1; i < poems.length; i++){
        if (poems[counter].getStropheNumbers() < poems[i].getStropheNumbers()){
            counter = i;
        }
        }
        return poems[counter].getCreator();
    }
}
