# Simulação de Banco em Java

Este projeto implementa um sistema bancário simples em Java, permitindo a criação de contas, depósitos e saques (com uma taxa para saques).

**Autor:** gustavodees

## Arquivos Incluídos

* `model/Banco.java`: Contém a definição da classe `Banco`, que representa uma conta bancária com atributos para nome, ID e saldo, além de métodos para realizar depósitos e saques.
* `principal/Main.java`: Contém a classe principal com o método `main`, responsável por interagir com o usuário para obter os dados da conta e realizar operações de depósito e saque.

## Como Usar

1.  **Salve os arquivos:** Salve o código nos locais apropriados:
    * Crie uma pasta chamada `model` e salve dentro dela o arquivo `Banco.java`.
    * Crie uma pasta chamada `principal` e salve dentro dela o arquivo `Main.java`.
2.  **Compile o código:** Abra um terminal ou prompt de comando, navegue até o diretório raiz do seu projeto e compile os arquivos Java utilizando o comando:

    ```bash
    javac principal/Main.java model/Banco.java
    ```

3.  **Execute o programa:** Após a compilação, execute a classe principal `Main` com o comando:

    ```bash
    java principal.Main
    ```

4.  **Interação com o Programa:**
    * O programa solicitará que você digite o seu ID e nome para criar uma conta.
    * Em seguida, perguntará se você deseja realizar um depósito (digite 'y' para sim ou 'n' para não).
        * Se escolher 'y', o programa pedirá o valor a ser depositado.
        * Após o depósito (ou se você escolheu não depositar), o programa exibirá as informações da sua conta.
    * O programa então perguntará se você deseja realizar um saque (digite 'y' para sim ou 'n' para não).
        * Se escolher 'y', o programa pedirá o valor do saque. O programa aplicará uma taxa de saque de R$5.00.
        * Se escolher 'n', o programa exibirá as informações da sua conta novamente.
    * Caso você digite uma opção inválida ('y' ou 'n'), o programa exibirá uma mensagem de erro.

## Explicação do Código

### `model/Banco.java`

Este arquivo define a classe `Banco`, que representa uma conta bancária.

* **Atributos:**
    * `nome` (private String): O nome do titular da conta.
    * `ID` (private int): O identificador único da conta.
    * `saldo` (private double): O saldo atual da conta.
* **Construtores:**
    * `Banco()`: Construtor padrão que inicializa o nome com uma string vazia, o ID com 0 e o saldo com 0.
    * `Banco(String nome, int ID, double saldoInicial)`: Construtor que permite inicializar o nome, ID e saldo inicial da conta ao criar um objeto da classe.
* **Getters e Setters:** Métodos públicos para acessar e modificar os atributos da classe `Banco`.
    * `getNome()`, `setNome()`
    * `getID()`, `setID()`
    * `getSaldo()`, `setSaldo()`
* **Métodos de Operação:**
    * `depoistar(double valor)`: Permite realizar um depósito na conta. Se o valor for maior que zero, o saldo é aumentado e uma mensagem de sucesso é exibida. Caso contrário, uma mensagem de valor inválido é mostrada.
    * `sacar(double valor)`: Permite realizar um saque da conta. Uma taxa de R$5.00 é aplicada a cada saque. O método verifica se o valor do saque (incluindo a taxa) é maior que zero e se há saldo suficiente na conta antes de realizar a operação. Retorna `true` se o saque for bem-sucedido e `false` caso contrário, exibindo mensagens informativas em ambos os casos.
* **Método `toString()`:**
    * `@Override public String toString()`: Sobrescreve o método `toString` para retornar uma representação em string do objeto `Banco`, mostrando o ID da conta, o nome do titular e o saldo atual, formatado em moeda brasileira (R$).

### `principal/Main.java`

Este arquivo contém a classe `Main`, que é o ponto de entrada do programa.

* **Método `main`:**
    1.  Cria um objeto da classe `Scanner` para receber a entrada do usuário.
    2.  Cria um objeto da classe `Banco`.
    3.  Solicita e lê o ID e o nome do usuário para definir as informações da conta bancária.
    4.  Pergunta ao usuário se deseja realizar um depósito ('y' para sim, 'n' para não).
    5.  Utiliza uma estrutura `switch` para processar a resposta do depósito:
        * Se a resposta for 'y', solicita e lê o valor do depósito e chama o método `depoistar()` do objeto `Banco`.
        * Em seguida, exibe as informações da conta.
        * Pergunta se o usuário deseja realizar um saque ('y' para sim, 'n' para não).
        * Utiliza outro `switch` aninhado para processar a resposta do saque:
            * Se a resposta for 'y', solicita e lê o valor do saque e chama o método `sacar()` do objeto `Banco`, exibindo o resultado da operação.
            * Se a resposta for 'n', exibe as informações da conta.
            * Se a resposta for outra, exibe uma mensagem de opção inválida.
        * Se a resposta inicial para o depósito for 'n', exibe as informações da conta.
        * Se a resposta inicial para o depósito for outra, exibe uma mensagem de opção inválida.
    6.  Fecha o objeto `Scanner` para liberar os recursos.
