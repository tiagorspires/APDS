package Proxy;

import java.util.LinkedHashMap;
import java.util.Map;

public class ContactServiceProxy implements ContactService {
    private ContactServiceImpl realService;
    private Map<String, String> cache;

    public ContactServiceProxy(ContactServiceImpl realService) {
        this.realService = realService;
        this.cache = new LinkedHashMap<String, String>(5, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry<String, String> eldest) {
                return size() > 5; // mantém só os últimos 5
            }
        };
    }

    @Override
    public String getContact(String name) {
        if (cache.containsKey(name)) {
            System.out.println("[CACHE] Contacto de " + name + " obtido do cache.");
            return cache.get(name);
        }

        System.out.println("[REAL] A aceder ao serviço real para " + name + "...");
        String result = realService.getContact(name);
        cache.put(name, result);
        return result;
    }
}
