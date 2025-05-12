package Proxy;

import java.util.HashMap;
import java.util.Map;

public class ContactServiceImpl implements ContactService {
    private Map<String, String> contacts;

    public ContactServiceImpl() {
        contacts = new HashMap<>();
        // Simular base de dados
        contacts.put("Ana", "ana@email.com");
        contacts.put("Bruno", "bruno@email.com");
        contacts.put("Carlos", "carlos@email.com");
        contacts.put("Diana", "diana@email.com");
        contacts.put("Eduardo", "eduardo@email.com");
        contacts.put("Fátima", "fatima@email.com");
        contacts.put("John","john@email.com");
        contacts.put("Jane","jane@email.com");
        contacts.put("Joe","joe@email.com");
        contacts.put("Jade","jade@email.com");
    }

    @Override
    public String getContact(String name) {
        simulateSlowAccess();
        return contacts.getOrDefault(name, "Contacto não encontrado.");
    }

    private void simulateSlowAccess() {
        try {
            Thread.sleep(1000); // simula processamento pesado
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
