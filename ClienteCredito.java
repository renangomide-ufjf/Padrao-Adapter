package padroesestruturais.adapter;

public class ClienteCredito {

    IScore score;
    ScoreAdapter persistencia;

    public ClienteCredito() {
        score = new ScoreRating();
        persistencia = new ScoreAdapter(score);
    }

    public void setScore(String rating) {
        score.setScore(rating);
        persistencia.salvarScore();
    }

    public String getScore() {
        return persistencia.recuperarScore();
    }

    public float getPontuacao() {
        return persistencia.getPontuacao();
    }
}
