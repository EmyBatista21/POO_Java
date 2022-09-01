package vogalConsoante;

public class Frase {
    private int vogais;
    private int consoantes;
    private int outroCaracteres;
    String conteudo; 

    public Frase (String valor){
        conteudo = valor.toLowerCase();
        contaCaracteres();
    }

    private void contaCaracteres(){
        int i;
        char letra;
        for(i = 0; i < conteudo.length(); i++){
            letra = conteudo.charAt(i);
            if(Character.isLetter(letra)){
                if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                    vogais++; 
                }else{
                    consoantes++;
                }
            }else{
                outroCaracteres++;
            }
        }
    }

    public int getVogais(){
        return vogais; 
    }

    public int getConsoantes(){
        return consoantes;
    }

    public int outroCaracteres(){
        return outroCaracteres;
    }

    public String getResultados(){
        return "O número de vogais é "+getVogais()+", número de consoantes é "+getConsoantes()+", o número de outroCaracteres é " + outroCaracteres();
    }

}
