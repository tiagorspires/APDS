package Reflection;

import java.lang.reflect.*;

public class ReflexaoUtil {

    // 2.1 - Definições de uma classe
    public static void mostrarDefinicoesClasse(Class<?> clazz) {
        System.out.println("Classe: " + clazz.getName());
        System.out.println("Superclasse: " + clazz.getSuperclass());
        System.out.println("Interfaces:");
        for (Class<?> iface : clazz.getInterfaces()) {
            System.out.println("- " + iface.getName());
        }

        System.out.println("Atributos declarados:");
        for (Field f : clazz.getDeclaredFields()) {
            System.out.println("- " + f.getName());
        }

        System.out.println("Atributos públicos:");
        for (Field f : clazz.getFields()) {
            System.out.println("- " + f.getName());
        }
    }

    // 2.2 - Construtores
    public static void mostrarConstrutores(Class<?> clazz) {
        for (Constructor<?> c : clazz.getConstructors()) {
            System.out.println("Construtor: " + c);
        }
    }

    // 2.3 - Métodos
    public static void mostrarMetodos(Class<?> clazz) {
        for (Method m : clazz.getDeclaredMethods()) {
            System.out.println("Método: " + m.getName());
            System.out.println("  Tipos de parâmetro:");
            for (Class<?> param : m.getParameterTypes()) {
                System.out.println("    - " + param.getName());
            }
        }
    }

    // 2.4 - Executar método
    public static void executarMetodo(Object obj, String nomeMetodo, Object... parametros) throws Exception {
        Class<?>[] tipos = new Class<?>[parametros.length];
        for (int i = 0; i < parametros.length; i++) {
            tipos[i] = parametros[i].getClass();
        }

        Method metodo = obj.getClass().getMethod(nomeMetodo, tipos);
        metodo.invoke(obj, parametros);
    }

    // 2.5 - Alterar valor de atributo
    public static void alterarAtributo(Object obj, String nomeAtributo, Object novoValor) throws Exception {
        Field f = null;
        Class<?> clazz = obj.getClass();
        while (clazz != null) {
            try {
                f = clazz.getDeclaredField(nomeAtributo);
                break;
            } catch (NoSuchFieldException e) {
                clazz = clazz.getSuperclass(); // sobe na hierarquia
            }
        }
        if (f == null) {
            throw new NoSuchFieldException("Atributo '" + nomeAtributo + "' não encontrado.");
        }

        f.setAccessible(true);
        f.set(obj, novoValor);
    }


    // 2.6 - Instanciar objeto dinamicamente
    public static Object instanciarClasse(String nomeClasse, Object... parametros) throws Exception {
        Class<?> clazz = Class.forName(nomeClasse);
        for (Constructor<?> c : clazz.getConstructors()) {
            if (c.getParameterCount() == parametros.length) {
                return c.newInstance(parametros);
            }
        }
        throw new IllegalArgumentException("Construtor compatível não encontrado.");
    }

    // 2.7 e 2.8 - Executar método dinâmico com tratamento de exceções
    public static void executarMetodoDinamicoComTratamento(Object obj, String nomeMetodo, Object... parametros) {
        try {
            Class<?>[] tipos = new Class<?>[parametros.length];
            for (int i = 0; i < parametros.length; i++) {
                tipos[i] = parametros[i].getClass();
            }
            Method metodo = obj.getClass().getMethod(nomeMetodo, tipos);
            metodo.invoke(obj, parametros);
        } catch (Exception e) {
            System.out.println("Erro ao executar método: " + e.getMessage());
        }
    }
}
