# Roteador
  Projeto de simulação de um roteador em Java.
# Componentes: Maurício Ramalho, Nátaly Enne e Van Allem Barreto 

# Compilação:
  Para compilação do código basta extrair a pasta do .zip e importar o projeto no IntelliJ IDEA, 
  IDE utilizada nessa matéria, e compilar normalmente.

# Divisão de tarefas:
  - Maurício Ramalho: Funções relacionadas a transferências de pacotes, teste realizado no main, tratamento de erros de compilação.
  - Nátaly Enne: Organização do código e pacotes, criação de classes e definição de atributos e métodos, criação do versão inicial da função de roteamento.
  - Van Allem Barreto: Inicialização dos roteadores e portas no main, criação de classes e definição de atributos e métodos, tratamento de erros de compilação. 

# Dificuldades:
  - A maior dificuldade encontrada foi quanto ao arquivo explicando o que deveria ser feito neste trabalho, deixando ele bem confuso 
  e, em certos momentos, tornou o desenvolvimento muito truncado.
  - Por falta de tempo e clareza de como deveriam ser utilizados os arquivos .txt no projeto, acabamos não implementando os métodos de 
  leitura de ips por arquivo e escrita final da porta rede para um arquivo com as comunicações que aconteceram no decorrer do código.

# Funcionamento do teste:
  O teste foi realizado criando um pacote e colocando ele no buffer de um determinado roteador, após isso, é chamada a rotina de transmissão entre os roteadores, até chegar ao destino.
  O teste teve sucesso em todos os casos nos quais o último dígito do IP do roteador de origem era "maior ou igual" que o do roteador destino. Por exemplo, para um roteador de origem terminando em ".4", o roteador de destino daria certo caso terminasse em ".4", ".3", ".2" ou ".1". Caso contrário, a operação terminava em erro.
  Não conseguimos entender o porquê desse erro, já que os atributos importantes para essa operação aparentemente não davam brecha para tal.
