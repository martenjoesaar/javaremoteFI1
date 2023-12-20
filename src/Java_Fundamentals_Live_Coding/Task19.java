package Java_Fundamentals_Live_Coding;

import D231217.Task1Author;
import D231217.Task1Poem;

public class Task19 { public static void main(String[] args) {

    Task19Author author = new Task19Author();
    author.setSurname("Mike");
    author.setNationality("Italy");

    Task19Poem poem = new Task19Poem();
    poem.setCreator(author);
    poem.setStropheNumbers(10);

    Task19Author author1 = new Task19Author();
    author1.setSurname("Panusen");
    author1.setNationality("Finland");

    Task19Poem poem1 = new Task19Poem();
    poem1.setCreator(author1);
    poem1.setStropheNumbers(76);

    Task19Author author2 = new Task19Author();
    author2.setSurname("Joosep");
    author2.setNationality("Estonia");

    Task19Poem poem2 = new Task19Poem();
    poem2.setCreator(author2);
    poem2.setStropheNumbers(10);

    Task19Poem[] poems = {poem, poem1, poem2};
    Task19Author bestAuthor = getBestAuthor(poems);
    System.out.printf("%s has written the longest poem!", bestAuthor.getSurname());
}
    private static  Task19Author getBestAuthor(Task19Poem[] poems) {
        int counter = 0;

        for(int i = 1; i < poems.length; i++){
            if (poems[counter].getStropheNumbers() < poems[i].getStropheNumbers()){
                counter = i;
            }
        }
        return poems[counter].getCreator();
    }
}