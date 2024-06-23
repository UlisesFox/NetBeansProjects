package DDTECH;

public class Quejas {

private String DiaQ;
private String MotivoQ;
private String TipoQ;
private String SecciónE;
private String PersonaDiri;

    public Quejas() {
        this.DiaQ = "";
        this.MotivoQ = "";
        this.TipoQ = "";
        this.SecciónE = "";
        this.PersonaDiri = "";
    }

    public String getDiaQ() {
        return DiaQ;
    }

    public void setDiaQ(String DiaQ) {
        this.DiaQ = DiaQ;
    }

    public String getMotivoQ() {
        return MotivoQ;
    }

    public void setMotivoQ(String MotivoQ) {
        this.MotivoQ = MotivoQ;
    }

    public String getTipoQ() {
        return TipoQ;
    }

    public void setTipoQ(String TipoQ) {
        this.TipoQ = TipoQ;
    }

    public String getSecciónE() {
        return SecciónE;
    }

    public void setSecciónE(String SecciónE) {
        this.SecciónE = SecciónE;
    }

    public String getPersonaD() {
        return PersonaDiri;
    }

    public void setPersonaD(String PersonaDiri) {
        this.PersonaDiri = PersonaDiri;
    }
}