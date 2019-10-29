# Router
  Projeto de simulação de um roteador em Java.

# What is it?
O projeto consiste na implementação do funcionamento da comunicação de roteadores, da entrega de pacotes. Basicamente, o roteamento de pacotes consiste em encaminhar pacotes de um roteador para outro. Dada uma comunicação entra pacotes deve-se enviar um pacote do roteador origem para o seu roteador destino.

# Compilação:
É possvel utilizando qualquer IDE, compilando a classe `Main`. OU, dentro da pasta util, executar a seguinte linha de comando:

```bash
javac Main.java
```
Em seguida, para executar:
```bash
java Main
```
# Explicando a classe Teste.java:
  O teste foi realizado criando um pacote e colocando ele no buffer de um determinado roteador, após isso, é chamada a rotina de transmissão entre os roteadores, até chegar ao destino.
  O teste teve sucesso em todos os casos nos quais o último dígito do IP do roteador de origem era "maior ou igual" que o do roteador destino. Por exemplo, para um roteador de origem terminando em ".4", o roteador de destino daria certo caso terminasse em ".4", ".3", ".2" ou ".1". Caso contrário, a operação terminava em erro.
  Não conseguimos entender o porquê desse erro, já que os atributos importantes para essa operação aparentemente não davam brecha para tal.

## Colaboradores
<table>
  <tr>
    <td align="center">
      <a href="https://github.com/nataly-enne">
        <img src="https://avatars3.githubusercontent.com/u/26802307?s=400&v=4" width="100px;" alt="Nátaly Enne"/>
        <br />
        <sub><b>Nátaly Enne</b></sub>
      </a><br />
      <a href="https://github.com/nataly-enne/router/commits?author=nataly-enne" title="Code">💻</a>
    </td>
    <td align="center">
      <a href="https://github.com/Vanz5">
        <img src="https://avatars2.githubusercontent.com/u/36575665?s=400&v=4" width="100px;" alt="Van Allem"/>
        <br />
        <sub><b>Van Allem</b></sub>
      </a><br />
      <a href="https://github.com/nataly-enne/router/commits?author=Vanz5" title="Code">💻</a>
    </td>
    <td align="center">
      <a href="https://github.com/ilikemiojo">
        <img src="https://avatars1.githubusercontent.com/u/32806113?s=400&v=4" width="100px;" alt="Maurício Ramalho"/>
        <br />
        <sub><b>Maurício Ramalho</b></sub>
      </a><br />
      <a href="https://github.com/nataly-enne/router/commits?author=ilikemiojo" title="Code">💻</a>
    </td>
  </tr>
</table>
