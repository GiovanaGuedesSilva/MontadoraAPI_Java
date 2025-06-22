package io.github.giovanaguedessilva.arquiteturaspring.montadora;

public class Motor {

    private String modelo;
    private Integer cilindros;
    private Integer cavalos;
    private Double litragem;
    private TipoMotor tipoMotor;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public TipoMotor getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(TipoMotor tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public Double getLitragem() {
        return litragem;
    }

    public void setLitragem(Double litragem) {
        this.litragem = litragem;
    }

    public Integer getCavalos() {
        return cavalos;
    }

    public void setCavalos(Integer cavalos) {
        this.cavalos = cavalos;
    }

    public Integer getCilindros() {
        return cilindros;
    }

    public void setCilindros(Integer cilindros) {
        this.cilindros = cilindros;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "modelo='" + modelo + '\'' +
                ", cilindros=" + cilindros +
                ", cavalos=" + cavalos +
                ", litragem=" + litragem +
                ", tipoMotor=" + tipoMotor +
                '}';
    }
}
