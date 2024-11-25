public class testeReferencia{

public static void main(String[] args){ 
    Conta  primeiraConta =  new conta();
    primeiraConta.saldo = 300;
    system.out.println("saldo da primeira:" + primeiraConta.saldo);

    conta segundaConta = primeiraConta;
    system.out.println("saldo da segunda Conta:" + segundaConta.saldo);

    segundaConta.saldo += 100;
    system.out.println("saldo da segunda conta:" + segundaConta.saldo);

    system.out.println(primeiraConta.saldo);

    if(primeiraConta == segundaConta){
        system.out.println("sao a messmissima conta");
    }

    system.out.println(primeiraConta)


}
}