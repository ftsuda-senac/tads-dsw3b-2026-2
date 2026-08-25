package br.senac.tads.dsw.helloworld;

public class ExemploJson {

    public String gerarJson() {
        String json = """
                {
                    "nome": "JSON Java via Spring Boot",
                    "valor": 411,
                    "propriedades": [
                        "prop1",
                        "prop2",
                        "prop3"
                    ] 
                }
                """;
        return json;
    }

    public static void main(String[] args) {
        ExemploJson objeto = new ExemploJson();
        String json = objeto.gerarJson();

        System.out.println("JSON gerado: " + json);
    }

}
