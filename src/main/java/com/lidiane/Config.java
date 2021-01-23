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

import javax.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 *
 * @author Lidiane
 */

/*<p>Aqui estamos usando a anotação &#64;{@link ApplicationScoped}
 * do CDI como uma forma de definir um objeto Singleton, que possui
 * uma única instância para todos os usuários da aplicação.
 * Assim, as configurações são as mesmas para todos.
 * Se for alterada, todos os usuários poderão ver as alterações.</p>
 *
 * @author Manoel Campos da Silva Filho
 */
@ApplicationScoped
public class Config {

    @ConfigProperty(name = "formatRelatorios")
    private String formatoRelatorios = "pdf";

    @ConfigProperty(name = "tipoGraficos")
    private String tipoGraficos = "barras";

    /**
     * @return the formatoRelatorios
     */
    protected String getFormatoRelatorios() {
        return formatoRelatorios;
    }

    /**
     * @param formatoRelatorios the formatoRelatorios to set
     */
    protected void setFormatoRelatorios(String formatoRelatorios) {
        this.formatoRelatorios = formatoRelatorios;
    }

    /**
     * @return the tipoGraficos
     */
    protected String getTipoGraficos() {
        return tipoGraficos;
    }

    /**
     * @param tipoGraficos the tipoGraficos to set
     */
    protected void setTipoGraficos(String tipoGraficos) {
        this.tipoGraficos = tipoGraficos;
    }

}
