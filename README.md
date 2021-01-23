# <h1 align="center"> Padrões de Projeto </h1>
<hr/>

## <h2 align="center">Padrões de Projetos Criacionais - Singleton - Parte2 </h2>

<div align="justify">
 
 #### <h4><b>Definição:</b></h4>
 
 <p> 📘"Garante que uma classe tenha apenas uma instância e fornece um ponto global de acesso a ela." [UCPP] </p>
 </br>
 <p> Neste projeto estou implementando o código do professor Manoel Campos, disponível no vídeo:</p>
 
 [🙋🏽‍♂️ Padrão SINGLETON com INJEÇÃO de DEPENDÊNCIA (CDI) em JAVA: API REST no framework QUARKUS](https://www.youtube.com/watch?v=2MypBiHd0Ko&list=PLyo0RUAM69UtO8Jjq71qgvRxcI2pTrB2m&index=10)
 
 <p>Como pedido na atividade:  </p>
 
<p>No vídeo anterior sobre Singleton com CDI, no método updateConfig(Config newConfig) da classe de recurso ConfigResource, falei que não podemos atribuir o parâmetro newConfig ao atributo config. 

Altere o código de tal método para this.config = newConfig; 
Crie uma nova classe de recurso chamada RelatorioResource  como uma cópia da ConfigResource, alterando a anotação @Path para para @Path("/relatorio")
Tal classe simula a geração de um relatório que precisará acessar nosso Singleton Config também. Agora temos dois serviços REST disponíveis: /config e /relatorio. Acesse os métodos nos dois e informe qual o problema ocorrido com a alteração do código do updateConfig.

Envie o projeto para o GitHub e descreva seu relato em um arquivo README.md.</p>

<p>Como meu projeto está com problemas com relação a um conflito com o Maven, não pude executar o projeto para notar tal diferença. Entretando analisando o código juntamente com o que foi explicado no vídeo, imagino que ao fazer a alteração proposta no código deixamos de usar o padrão Singleton porque um novo obejto foi criado assim não teremos uma única instancia da classe. E por isso, quando chamando o config em outra classe o padrão deixa de funcionar e não atualiz as modificações...</p>
 
 <p>Para entender melhor o conceito do projeto basta clicar nos links abaixo:</p>
 
 [Padrões de Projetos Criacionais](https://github.com/manoelcampos/padroes-projetos/tree/master/criacionais/singleton)
 

 [🙋🏽‍♂️ Padrão SINGLETON com INJEÇÃO de DEPENDÊNCIA (CDI) em JAVA: API REST no framework QUARKUS](https://www.youtube.com/watch?v=2MypBiHd0Ko&list=PLyo0RUAM69UtO8Jjq71qgvRxcI2pTrB2m&index=10)
 
 
 <p></p>
 

</div>

 
