package academy.devdojo.maratonajava.javacore.Rdates.date;

import java.time.Instant;

public class InstantTest01 {
    public static void main(String[] args) {
    /**
     * Um Instant representa um ponto instantâneo na linha do tempo universal (UTC).
     * - Sempre em UTC: Não possui fuso horário, o que o torna ideal para registros globais.
     * - Imutável: Uma vez criado, seu valor não pode ser alterado, garantindo segurança em threads.
     * - Alta Precisão: Medido em nanosegundos a partir da época padrão do Java (1970-01-01T00:00:00Z).
     *   Uso principal: timestamps de eventos, logs, APIs e persistência de dados.
     * Para formatação legível para humanos, use .atZone(ZoneTest01) para convertê-lo em um ZonedDateTime.
     */

        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano());


    }
}
