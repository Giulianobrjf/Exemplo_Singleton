package org.example;

public class CasaInteligente {

    private CasaInteligente() {}

    private static CasaInteligente instance = new CasaInteligente();

    public static CasaInteligente getInstance() {
        return instance;
    }

    private boolean luzesAcesas;
    private boolean arCondicionadoLigado;
    private boolean alarmeAtivado;

    public boolean isLuzesAcesas() {
        return luzesAcesas;
    }

    public void setLuzesAcesas(boolean luzesAcesas) {
        this.luzesAcesas = luzesAcesas;
    }

    public boolean isArCondicionadoLigado() {
        return arCondicionadoLigado;
    }

    public void setArCondicionadoLigado(boolean arCondicionadoLigado) {
        this.arCondicionadoLigado = arCondicionadoLigado;
    }

    public boolean isAlarmeAtivado() {
        return alarmeAtivado;
    }

    public void setAlarmeAtivado(boolean alarmeAtivado) {
        this.alarmeAtivado = alarmeAtivado;
    }
}