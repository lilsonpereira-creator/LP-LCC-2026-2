package br.ufpb.dcx;

public class CadastrarUsuario {
    private String nomeDoUsuario;
    private  String cpf;
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;



    public CadastrarUsuario(String nomeDoUsuario, String cpf, String rua, int numero, String bairro, String cidade, String estado) {
        this.nomeDoUsuario = nomeDoUsuario;
        this.cpf = cpf;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;

    }

    public String getNomeDoUsuario() {
        return nomeDoUsuario;
    }

    public void setNomeDoUsuario(String nomeDoUsuario) {
        this.nomeDoUsuario = nomeDoUsuario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "CadastrarUsuario{" +
                "nomeDoUsuario='" + nomeDoUsuario + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rua='" + rua + '\'' +
                ", numero=" + numero +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
