package questao5;

public abstract class ItemCultural {

        protected String titulo;
        protected int anoDeCreacao;
        protected String origem;

        public ItemCultural(String titulo, int anoDeCreacao, String origem) {
            this.titulo = titulo;
            this.anoDeCreacao = anoDeCreacao;
            this.origem = origem;
        }

        public void descrever() {
            System.out.printf("[%s] '%s' (%d) — %s%n",
                    getClass().getSimpleName(), titulo, anoDeCreacao, origem);
        }

        public String getTitulo() { return titulo; }
    }