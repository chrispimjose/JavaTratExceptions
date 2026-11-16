public class App {
    public static void main(String[] args) throws Exception {
        
        // Tratamento de erro aritmético
        int a = 10; //Numerador
        int b = 0; //Denominador

        try{

            int resultado = a/b;
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e){
            // Captura detalhes da interrupção
            String detalhes = String.format(
                "Erro: %s | Tipo: %s | Causa: %s",
                e.getMessage(),
                e.getClass().getName(),
                e.getCause() != null ? e.getCause() : "não especificada"
            );   
            System.out.println("===================");         
            System.out.println(detalhes);
            System.out.println("Stack trace:");
            e.printStackTrace(System.out);
        } finally {
            System.out.println("Operação finalizada com sucesso!");
        }







    }
}
