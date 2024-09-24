

public class Carro{

    private String placa;
    private String cor;
    private int ano;
    private String dono;

    /**
     * @deprecated 
     * @see Carro (String placa, String cor, int ano)
     * @param placa
     * @param cor
     * @param ano
     * @param dono
     */

    public Carro (String placa, String cor, int ano, String dono){
        this.placa = placa;
        this.cor = cor;
        this.ano = ano;
        this.dono = dono;
    }

    /*
     * @param placa
     * @param cor
     * @param ano
     * Construtor da classe
     */

    public Carro (String placa, String cor, int ano){
        this.placa = placa;
        this.cor = cor;
        this.ano = ano;
    }

    /*
     * @return String placa
     */

    public String getPlaca() {
        return placa;
    }

    /*
     * @return String cor
     */

    public String getCor() {
        return cor;
    }

    /*
     * @return int ano
     */

    public int getAno() {
        return ano;
    }

    /*
     * @return String dono
     */

    public String getDono() {
        return dono;
    }

    /*
     * @param String placa
     */

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /*
     * @param String cor
     */

    public void setCor(String cor) {
        this.cor = cor;
    }

    /*
     * @param int ano
     */

    public void setAno(int ano) {
        this.ano = ano;
    }

    /*
     * @param String dono
     */

    public void setDono(String dono) {
        this.dono = dono;
    }

    


}