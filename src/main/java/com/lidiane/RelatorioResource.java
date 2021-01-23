/*
 * #10 CRIACIONAIS: SINGLETON
 * Entender os problemas de atribuir um novo objeto ao Singleton
 * No vídeo anterior sobre Singleton com CDI 
 *(https://www.youtube.com/watch?v=2MypBiHd0Ko&list=PLyo0RUAM69UtO8Jjq71qgvRxcI2pTrB2m&index=10), 
 * no método updateConfig(Config newConfig) da classe de recurso ConfigResource, 
 *falei que não podemos atribuir o parâmetro newConfig ao atributo config.
 * Altere o código de tal método para this.config = newConfig; 
 * Crie uma nova classe de recurso chamada RelatorioResource  como uma cópia da 
 * ConfigResource, alterando a anotação @Path para para @Path("/relatorio")
 * Tal classe simula a geração de um relatório que precisará acessar nosso 
 * Singleton Config também. Agora temos dois serviços REST disponíveis: /config e /relatorio.
 * Acesse os métodos nos dois e informe qual o problema ocorrido com a alteração 
 * do código do updateConfig.
 * Envie o projeto para o GitHub e descreva seu relato em um arquivo README.md.
 */
package com.lidiane;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/relatorio")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RelatorioResource {

    @Inject
    Config config;

    @GET
    public Config getConfig() {
        return config;
    }

    @PUT
    public void updateConfig(Config newConfig) {
        config.setFormatoRelatorios(newConfig.getFormatoRelatorios());
        config.setTipoGraficos(newConfig.getTipoGraficos());
    }
}
