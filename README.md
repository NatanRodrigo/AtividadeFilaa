Implementação de Pilha e Fila em Java


Este repositório apresenta a implementação de duas estruturas de dados fundamentais: Pilha e Fila. Os exemplos abordam o uso dessas estruturas em dois cenários práticos:


Navegador Web (Pilha): Gerenciamento do histórico de navegação.


Fila de Pacientes (Fila): Controle de atendimento sequencial em um hospital.


🚀 Tecnologias Utilizadas


Java


Stack (Pilha)


Queue (Fila - LinkedList)

📌 Funcionalidades

🖥️ Navegador Web (Pilha)

Implementa o controle de navegação utilizando duas pilhas:

Histórico: Armazena as páginas visitadas.

Avançar: Guarda as páginas que podem ser acessadas ao voltar.

Exemplo de Uso:

Navegador navegador = new Navegador();
navegador.acessarPagina("google.com");
navegador.acessarPagina("github.com");
navegador.voltar();

🏥 Fila de Pacientes (Fila)

Gerencia a ordem de atendimento de pacientes por meio de uma fila:

Cada paciente recebe uma senha sequencial (Exemplo: "P1", "P2").

Exemplo de Uso:

FilaHospital fila = new FilaHospital();
fila.gerarSenha(); // Saída: "Senha gerada: P1"
fila.gerarSenha(); // Saída: "Senha gerada: P2"

📂 Estrutura do Projeto

📂 src/
 ├── Navegador.java  # Implementação da pilha para histórico do navegador
 ├── FilaHospital.java  # Implementação da fila para pacientes

📖 Referências

Cormen, T. H., Leiserson, C. E., Rivest, R. L., & Stein, C. (2009). Introduction to Algorithms. MIT Press.

Goodrich, M. T., & Tamassia, R. (2010). Data Structures and Algorithms in Java. Wiley.

🛠 Como Contribuir

Faça um fork do repositório.

Crie uma branch (git checkout -b minha-feature).

Faça commit das suas alterações (git commit -m 'Adiciona nova funcionalidade').

Faça push para a branch (git push origin minha-feature).

Abra um Pull Request.

📜 Licença

Este projeto está sob a licença MIT. Sinta-se livre para usá-lo e modificá-lo!
