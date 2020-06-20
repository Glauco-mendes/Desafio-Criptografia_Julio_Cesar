package challenge;

public class Main {

    public static void main(String[] args){

        CriptografiaCesariana cripto = new CriptografiaCesariana();

        String textoCripto = cripto.criptografar("a ligeira raposa marrom saltou sobre o cachorro cansado");
        System.out.println(textoCripto);

        String textoDescripto = cripto.descriptografar(textoCripto);

        System.out.println(textoDescripto);

        cripto.descriptografar(null);

    }


}
