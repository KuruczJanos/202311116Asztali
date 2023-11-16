public class Search implements Searchable {

    @Override
    public boolean containsKeyword(String keyword) {
        System.out.println("Tartalmazás vizsgáló metódus");
        return true;
    }

    @Override
    public int countWords() {
        System.out.println("Szószám");
        return 60;
    }
    
}
