package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FabricaTipoArvore {
    private static Map<String, TipoArvore> tiposArvore = new HashMap<>();

    public static TipoArvore getTipoArvore(String nome, String cor, String textura) {
        String key = nome + cor + textura;
        if (!tiposArvore.containsKey(key)) {
            tiposArvore.put(key, new TipoArvoreConcreto(nome, cor, textura));
        }
        return tiposArvore.get(key);
    }

    public static int getTotalTipos() {
        return tiposArvore.size();
    }
}