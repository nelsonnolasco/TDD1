import java.util.Date;

public class Relogio {
    private int horas;
    private int minutos;
    private int segundos;

    public Relogio() {
        atualizarTempoAtual();
    }

    public void atualizarTempoAtual() {
        Date dataAtual = new Date();
        horas = dataAtual.getHours();
        minutos = dataAtual.getMinutes();
        segundos = dataAtual.getSeconds();
    }

    public String getTempoAtual() {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }

    public void ticTac() {
        segundos++;
        if (segundos == 60) {
            segundos = 0;
            minutos++;
            if (minutos == 60) {
                minutos = 0;
                horas = (horas + 1) % 24;
            }
        }
    }
}
