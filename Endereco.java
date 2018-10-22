package mergeexterno;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.charset.Charset;
 
public class Endereco implements Comparable{
     
    private String logradouro;
    private String bairro;
    private String cidade;
    private String estado;
    private String sigla;
    private String cep;
 
    public void leEndereco(DataInput din) throws IOException
    {
        byte logradouro[] = new byte[72];
        byte bairro[] = new byte[72];
        byte cidade[] = new byte[72];
        byte estado[] = new byte[72];
        byte sigla[] = new byte[2];
        byte cep[] = new byte[8];
         
        din.readFully(logradouro);
        din.readFully(bairro);
        din.readFully(cidade);
        din.readFully(estado);
        din.readFully(sigla);
        din.readFully(cep);
        din.readByte(); // Ultimo espaco em branco 
        din.readByte(); // Quebra de linha
         
        // Definie a forma como caracteres especias estão codificados.
        Charset enc = Charset.forName("ISO-8859-1");
         
        this.setLogradouro(new String(logradouro,enc));
        this.setBairro(new String(bairro,enc));
        this.setCidade(new String(cidade,enc));
        this.setEstado(new String(estado,enc));
        this.setSigla(new String(sigla,enc));
        this.setCep(new String(cep,enc));
    }

    /**
     * @return the logradouro
     */
    public String getLogradouro() {
        return logradouro;
    }

    /**
     * @param logradouro the logradouro to set
     */
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public void escreveEndereco(DataOutput dout) throws IOException
    {       
        // Definie a forma como caracteres especias est�o codificados.
        Charset enc = Charset.forName("ISO-8859-1");
        dout.write(this.logradouro.getBytes(enc));
        dout.write(this.bairro.getBytes(enc));
        dout.write(this.cidade.getBytes(enc));
        dout.write(this.estado.getBytes(enc));
        dout.write(this.sigla.getBytes(enc));
        dout.write(this.cep.getBytes(enc));
        dout.write(" \n".getBytes(enc));
    }
    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the sigla
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * @param sigla the sigla to set
     */
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }
    public boolean equals(Object o){
        Endereco outroEndereco = (Endereco) o;
        if(this.getCep().equals(null)||outroEndereco.getCep().equals(null)){
            return false;
        }
        else if(this.getCep().equals(outroEndereco.getCep())){
            return true;
        }
        return false;
        
    }
    @Override
    public int compareTo(Object o) {
        Endereco outroEndereco = (Endereco) o;
        return this.getCep().compareTo(outroEndereco.getCep());
    }
 
}