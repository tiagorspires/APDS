package Builder;

import java.util.List;

public class Pizza {
    private String massa;
    private String molho;
    private List<String> coberturas;

    public void setMassa(String massa) {
        this.massa = massa;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }

    public void setCoberturas(List<String> coberturas) {
        this.coberturas = coberturas;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "massa='" + massa + '\'' +
                ", molho='" + molho + '\'' +
                ", coberturas=" + coberturas +
                '}';
    }
}
