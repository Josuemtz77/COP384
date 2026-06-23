package Week3_Inheritance;

class DVD extends LibraryItem{
    private String director;
    private int duration;

    public DVD(String title, String creator, int itemId, String director, int duration) {
        super(title, creator, itemId);

        this.director = director;
        this.duration = duration;
    }

    public String toString() {
        return "DVD: \n"
                + super.toString()
                + "\nDirector: " + director
                + "\nDuration: " + duration;
    }
}
