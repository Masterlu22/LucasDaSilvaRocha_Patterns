package builder;

public class Computador {
    private String processador;
    private String memoriaRam;
    private String armazenamento;
    private String placaDeVideo;
    private String sistemaOperacional;

    public Computador(String processador, String memoriaRam, String armazenamento, String placaDeVideo, String sistemaOperacional) {
        this.processador = processador;
        this.memoriaRam = memoriaRam;
        this.armazenamento = armazenamento;
        this.placaDeVideo = placaDeVideo;
        this.sistemaOperacional = sistemaOperacional;
    }

    @Override
    public String toString() {
        return String.format("%nProcessador: %s%nMemória ram: %s%nArmazenamento: %s%nPlaca de vídeo: %s%nSistema Operacional: %s%n",
                this.processador, this.memoriaRam, this.armazenamento, this.placaDeVideo, this.sistemaOperacional);
    }
}
