package padroesestruturais.adapter;

public class ScoreAdapter extends ScoreNumerico {

    private IScore scoreRating;

    public ScoreAdapter(IScore scoreRating) {
        this.scoreRating = scoreRating;
    }

    public String recuperarScore() {
        if (this.getPontuacao() >= 900.0f)
            scoreRating.setScore("A");
        else
            if (this.getPontuacao() >= 700.0f)
                scoreRating.setScore("B");
            else
                if (this.getPontuacao() >= 500.0f)
                    scoreRating.setScore("C");
                else
                    scoreRating.setScore("D");
        return scoreRating.getScore();
    }

    public void salvarScore() {
        if (scoreRating.getScore().equals("A"))
            this.setPontuacao(900.0f);
        else
            if (scoreRating.getScore().equals("B"))
                this.setPontuacao(700.0f);
            else
                if (scoreRating.getScore().equals("C"))
                    this.setPontuacao(500.0f);
                else
                    this.setPontuacao(300.0f);
    }
}
