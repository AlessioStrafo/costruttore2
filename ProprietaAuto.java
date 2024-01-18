public class ProprietaAuto {
    private String marca;
    private String modello;
    private int cilindrata;
    private String targa;
    public ProprietaAuto(String marca, String modello,int cilindrata, String targa){
        this.marca = marca;
        this.modello = modello;
        this.targa = targa;
        this.cilindrata = cilindrata;
    }
    String getMarca(){
        return marca;
    }
    String getModello(){
        return modello;
    }
    int getCilindrata(){
        return cilindrata;
    }
    String getTarga(){
        return targa;
    }
    @Override
    public String toString() {
        return "ProprietaAuto{" +
                "marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", cilindrata=" + cilindrata +
                ", targa='" + targa + '\'' +
                '}';
    }
}
