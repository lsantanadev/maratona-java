package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoPagamento;

import static academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente.*;


public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("tsubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("tsubasa", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println("Desconto cliente 1: "+cliente1.getTipoPagamento().calcularPagamento(150));
        System.out.println("Desconto cliente 2: "+cliente2.getTipoPagamento().calcularPagamento(150));


        TipoCliente tipoCliente = TipoCliente.tipoClientePorNomeRelatorio("Pessoa física");
        System.out.println(tipoCliente);

    }
}
