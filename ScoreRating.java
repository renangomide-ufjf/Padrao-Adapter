package padroesestruturais.adapter;

public class ScoreRating implements IScore {

    private String rating;

    @Override
    public String getScore() {
        return this.rating;
    }

    @Override
    public void setScore(String rating) {
        this.rating = rating;
    }
}
