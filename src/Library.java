public class Library {
    private Rack[] racks;

    public Library(Rack[] racks) {
        this.racks = racks;
    }

    public int racksCount() {
        int counter = 0;
        for (var rack : racks) {
            counter++;
        }

        return counter;
    }

    public Rack getRack(int index) {
        for (int i = 0; i < racks.length; i++) {
            if (racks[i] != null && i == index) return racks[i];
        }

        return null;
    }

    public int totalBooks(){
        int result = 0;
        for(var rack : racks){
           result += rack.totalBooks();
        }

        return result;
    }

    public Book findByTitle(String title){
        for(var rack : racks){
            if (rack != null && rack.findFirstByTitle(title) != -1){
               Shelf shelf = rack.getShelf(rack.findFirstByTitle(title));
               return shelf.get(shelf.indexOfByTitle(title));

            }
        }

        return null;
    }
}
