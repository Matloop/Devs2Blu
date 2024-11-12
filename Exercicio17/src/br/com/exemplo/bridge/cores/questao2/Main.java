package br.com.exemplo.bridge.cores.questao2;

import br.com.exemplo.bridge.cores.questao2.empregado.Analista;
import br.com.exemplo.bridge.cores.questao2.empregado.Empregado;
import br.com.exemplo.bridge.cores.questao2.empregado.GerenteDeProjetos;
import br.com.exemplo.bridge.cores.questao2.empregado.Secretaria;
import br.com.exemplo.bridge.cores.questao2.formato.FormatoCSV;
import br.com.exemplo.bridge.cores.questao2.formato.FormatoExportacao;
import br.com.exemplo.bridge.cores.questao2.formato.FormatoJSON;


public class Main {
    public static void main(String[] args) {
        FormatoExportacao formatoJSON = new FormatoJSON();
        FormatoExportacao formatoCSV = new FormatoCSV();

        Empregado gerente = new GerenteDeProjetos("Alice", 40, 12000.00, formatoJSON);
        Empregado analista = new Analista("Bob", 30, 8000.00, formatoCSV);
        Empregado secretaria = new Secretaria("Carol", 25, 5000.00, formatoJSON);

        System.out.println("Gerente (JSON):\n" + gerente.exportar());
        System.out.println("\nAnalista (CSV):\n" + analista.exportar());
        System.out.println("\nSecretaria (JSON):\n" + secretaria.exportar());
    }
}
